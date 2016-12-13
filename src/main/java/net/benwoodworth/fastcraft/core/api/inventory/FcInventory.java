package net.benwoodworth.fastcraft.core.api.inventory;

import net.benwoodworth.fastcraft.core.api.player.FcPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Adapts items so they can be used by the plugin.
 *
 * @param <TItem> The native item type.
 */
public abstract class FcInventory<TItem> {

    /**
     * The number of slots in the inventory.
     */
    public abstract int getSize();

    /**
     * The title of the inventory.
     */
    @Nullable
    public abstract String getTitle();

    /**
     * The player viewing the inventory.
     */
    @NotNull
    public abstract List<FcPlayer<TItem>> getViewers();

    /**
     * The contents of the inventory.
     */
    @NotNull
    protected abstract List<FcItem<TItem>> getContents();

    /**
     * The grid of items in this inventory.
     */
    @NotNull
    public abstract ItemGrid<FcItem<TItem>> getItemGrid();

    /**
     * Add items to the inventory.
     *
     * @param items The items to add.
     * @return Items that could not be added to the inventory.
     */
    @NotNull
    public abstract List<FcItem<TItem>> addItems(@NotNull Collection<FcItem<TItem>> items);

    /**
     * Remove items from the inventory.
     *
     * @param items The items to remove.
     * @return Items that could not be removed from the inventory.
     */
    @NotNull
    public abstract List<FcItem<TItem>> removeItems(@NotNull Collection<FcItem<TItem>> items);

    /**
     * Remove ingredients from the inventory.
     *
     * @param ingredients The ingredients to remove.
     * @return Items that could not be removed from the inventory.
     */
    @NotNull
    public abstract List<FcItem<TItem>> removeIngredients(@NotNull Collection<FcItem<TItem>> ingredients);

    /**
     * See if items are all in the inventory.
     */
    public boolean containsItems(@NotNull Collection<FcItem<TItem>> items) {
        return contains(items, FcItem::isSimilar);
    }

    /**
     * See if ingredients are all in the inventory.
     */
    public boolean containsIngredients(@NotNull Collection<FcItem<TItem>> items) {
        LinkedList<FcItem<TItem>> sorted = new LinkedList<>();

        // Compare wildcard items last, because they're less specific.
        for (FcItem<TItem> item : items) {
            if (item.hasWildCardData()) {
                sorted.addLast(item);
            } else {
                sorted.addFirst(item);
            }
        }

        return contains(sorted, FcItem::matchesIngredient);
    }

    /**
     * See if items are all in the inventory, using the specified
     * comparator to check for similarity between items.
     */
    private boolean contains(@NotNull Collection<FcItem<TItem>> items,
                             @NotNull FcItemComparator<FcItem<TItem>> comparator) {
        int[] amounts = new int[getContents().size()];
        Arrays.setAll(amounts, (int i) -> getContents().get(i).getAmount());

        items:for (FcItem<TItem> item : items) {
            int remaining = item.getAmount();

            for (int i = 0; i <= getContents().size(); i++) {
                if (i == getContents().size()) return false;
                if (!comparator.compare(item, getContents().get(i))) continue;

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

    /**
     * Provides an interface for comparing FcItem's.
     *
     * @param <T> The type of item being compared.
     */
    private interface FcItemComparator<T extends FcItem<?>> {
        boolean compare(@NotNull T a, @NotNull T b);
    }
}
