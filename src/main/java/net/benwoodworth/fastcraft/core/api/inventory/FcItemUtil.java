package net.benwoodworth.fastcraft.core.api.inventory;

/**
 * Provides methods to compare items.
 *
 * @param <TItem> The type of item being compared.
 */
public abstract class FcItemUtil<TItem extends FcItem<?>> {

    /**
     * Compares two items for equality.
     *
     * @param item0 An item to compare.
     * @param item1 An item to compare.
     * @return Returns true if the items are equal.
     */
    public boolean areEqual(TItem item0, TItem item1) {
        return item0.getAmount() == item1.getAmount()
                && areSimilar(item0, item1);
    }

    /**
     * Compares two items for equality, ignoring item amount.
     *
     * @param item0 An item to compare.
     * @param item1 An item to compare.
     * @return Returns true if the items are similar.
     */
    public abstract boolean areSimilar(TItem item0, TItem item1);

    /**
     * Checks to see if an item can be used as an ingredient.
     *
     * @param item The item being used as an ingredient.
     * @param ingredient The recipe ingredient.
     * @return Returns true if the item can be used as an ingredient.
     */
    public abstract boolean matchesIngredient(TItem item, TItem ingredient);

    /**
     * Evaluate an item's hash code.
     *
     * @param item The item to hash.
     * @return Returns the item's hash code.
     */
    public abstract int hashCode(TItem item);
}
