package net.benwoodworth.fastcraft.core.api.inventory;

import net.benwoodworth.fastcraft.core.api.player.FcPlayer;
import java.util.*;

/**
 * Adapts items so they can be used by the plugin.
 */
public abstract class FcInventory<TItem> {

    /**
     * The number of slots in the inventory.
     */
    public abstract int getSize();

    /**
     * The title of the inventory.
     */
    public abstract String getTitle();

    /**
     * The player viewing the inventory.
     */
    public abstract List<FcPlayer<TItem>> getViewers();

    /**
     * The contents of the inventory.
     */
    protected abstract List<TItem> getContents();

    /**
     * The grid of items in this inventory.
     */
    public abstract ItemGrid<TItem> getItemGrid();

    /**
     * Add items to the inventory.
     *
     * @param items The items to add.
     * @return Items that could not be added to the inventory.
     */
    public abstract List<TItem> addItems(TItem... items);

    /**
     * Remove items from the inventory.
     *
     * @param items The items to remove.
     * @return Items that could not be removed from the inventory.
     */
    public abstract List<TItem> removeItems(TItem... items);

    /**
     * Remove ingredients from the inventory.
     *
     * @param ingredients The ingredients to remove.
     * @return Items that could not be removed from the inventory.
     */
    public abstract List<TItem> removeIngredients(TItem... ingredients);

    /**
     * See if items are all in the inventory.
     */
    public boolean containsItems(TItem... items) {
        return contains(items, TItem::isSimilar);
    }

    /**
     * See if ingredients are all in the inventory.
     */
    public boolean containsIngredients(TItem... items) {
        LinkedList<TItem> sorted = new LinkedList<>();

        // Compare wildcard items last, because they're less specific.
        for (TItem item : items) {
            if (item.getWildcardData()) {
                sorted.addLast(item);
            } else {
                sorted.addFirst(item);
            }
        }

        return contains(sorted, (a, b) -> a.matchesIngredient(b));
    }

    /**
     * See if items are all in the inventory, using the specified comparator to check for similarity between items.
     */
    private boolean contains(Collection<TItem> items, ItemComparator<TFcItem> comparator) {
        int[] amounts = new int[getContents().size()];
        Arrays.setAll(amounts, (int i) -> getContents().get(i).getAmount());

        items:for (TItem item : items) {
            int remaining = item.getAmount();

            for (int i = 0; i <= getContents().size(); i++) {
                if (i == getContents().size()) return false;
                if (!comparator.areEqual(item, getContents().get(i))) continue;

                if (amounts[i] < remaining) {
                    remaining -= amounts[i];
                    amounts[i] = 0;
                } else {
                    amounts[i] -= remaining;
                    continue items;
                }
            }
        }

        return true;
    }

    private interface ItemComparator<T extends FcItem<?>> {
        boolean areEqual(T item0, T item1);
    }
}
