package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Adapts items so they can be used by the plugin.
 *
 * @param <TItem> the native item type
 */
public abstract class FcInventory<TItem> {

    /**
     * The number of slots in the inventory.
     *
     * @return the number of slots in the inventory
     */
    public abstract int getSize();

    /**
     * The title of the inventory.
     *
     * @return the inventory title
     */
    @Nullable
    public abstract String getTitle();

    /**
     * The player viewing the inventory.
     *
     * @return a list of viewers
     */
    @NotNull
    public abstract List<FcPlayer<TItem>> getViewers();

    /**
     * The contents of the inventory.
     *
     * @return the inventory contents
     */
    @NotNull
    protected abstract List<FcItem<TItem>> getContents();

    /**
     * The grid of items in this inventory.
     *
     * @return the item grid
     */
    @NotNull
    public abstract ItemGrid<FcItem<TItem>> getItemGrid();

    /**
     * Get the carrier of this inventory.
     *
     * @return the carrier of this inventory, or null if there is none
     */
    @Nullable
    public abstract Object getCarrier();

    /**
     * Add items to the inventory.
     *
     * @param items the items to add
     * @return items that could not be added to the inventory
     */
    @NotNull
    public abstract List<FcItem<TItem>> addItems(@NotNull Collection<FcItem<TItem>> items);

    /**
     * Remove items from the inventory.
     *
     * @param items the items to remove
     * @return items that could not be removed from the inventory
     */
    @NotNull
    public abstract List<FcItem<TItem>> removeItems(@NotNull Collection<FcItem<TItem>> items);

    /**
     * Remove ingredients from the inventory.
     *
     * @param ingredients the ingredients to remove
     * @return items that could not be removed from the inventory
     */
    @NotNull
    public abstract List<FcItem<TItem>> removeIngredients(@NotNull Collection<FcItem<TItem>> ingredients);

    /**
     * See if items are all in the inventory.
     *
     * @param items the items to see if the inventory contains
     * @return true if the inventory contains all the {@code items}
     */
    public boolean containsItems(@NotNull Collection<FcItem<TItem>> items) {
        return contains(items, FcItem::isSimilar);
    }

    /**
     * See if ingredients are all in the inventory.
     *
     * @param ingredients the ingredients to see if the inventory contains
     * @return true if the inventory contains all the {@code ingredients}
     */
    public boolean containsIngredients(@NotNull Collection<FcItem<TItem>> ingredients) {
        LinkedList<FcItem<TItem>> sorted = new LinkedList<>();

        // Compare wildcard items last, because they're less specific.
        for (FcItem<TItem> item : ingredients) {
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
     *
     * @param items the items to check the inventory against
     * @param comparator the comparator to check items with
     * @return true if all the items are contained according to the {@code comparator}
     */
    private boolean contains(@NotNull Collection<FcItem<TItem>> items,
                             @NotNull FcItemComparator<FcItem<TItem>> comparator) {
        // Keep track of the amount of the items
        int[] amounts = new int[getContents().size()];
        Arrays.setAll(amounts, (int i) -> getContents().get(i).getAmount());

        // Loop through the provided items
        items:for (FcItem<TItem> item : items) {
            int remaining = item.getAmount();

            // Subtract item amount from amounts
            for (int i = 0; i <= getContents().size(); i++) {
                // If looped through all, and haven't removed enough
                if (i == getContents().size())
                    return false;

                // If items don't match
                if (!comparator.compare(item, getContents().get(i)))
                    continue;

                if (amounts[i] < remaining) {
                    remaining -= amounts[i];
                    amounts[i] = 0;
                } else {
                    amounts[i] -= remaining;
                    continue items;
                }
            }
        }

        // Was able to remove all items
        return true;
    }

    /**
     * Provides an interface for comparing FcItem's.
     *
     * @param <T> the type of item being compared
     */
    private interface FcItemComparator<T extends FcItem<?>> {
        boolean compare(@NotNull T a, @NotNull T b);
    }
}
