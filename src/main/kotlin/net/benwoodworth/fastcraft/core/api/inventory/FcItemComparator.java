package net.benwoodworth.fastcraft.core.api.inventory;

/**
 * Provides methods to compare items.
 *
 * @param <TItem> The type of item being compared.
 */
public abstract class FcItemComparator<TItem extends FcItem<?>> {

    /**
     * Compares two items for equality.
     *
     * @param item0 An item to compare.
     * @param item1 An item to compare.
     * @return Returns true if the items are equal.
     */
    boolean areEqual(TItem item0, TItem item1) {
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
    abstract boolean areSimilar(TItem item0, TItem item1);


    /**
     * Checks to see if an item can be used as an ingredient.
     *
     * @param item The item being used as an ingredient.
     * @param ingredient The recipe ingredient.
     * @return Returns true if the item can be used as an ingredient.
     */
    abstract boolean matchesIngredient(TItem item, TItem ingredient);
}
