package net.benwoodworth.fastcraft.dependencies.inventory

/**
 * A Minecraft item.
 *
 * @param TBase the native item type
 */
interface FcItem<TBase> {

    /** The Minecraft item type ID. */
    val typeId: String

    /** The amount of items in this stack. */
    val amount: Int

    /** The display name of this item. */
    val displayName: String?

    /** The maximum size of this stack. */
    val maxStackSize: Int

    /**
     * Get a mutable copy of this item.
     *
     * @return a mutable copy
     */
    fun getMutableItem(): FcItemMutable<TBase>

    /**
     * Clone the base item being adapted.
     *
     * @return a clone of the base item
     */
    fun cloneBaseItem(): TBase

    /**
     * Get the item's lore.
     *
     * @return the item's lore
     */
    fun getLore(): List<String?>

    /**
     * Whether this item, as an ingredient, matches any
     * item of the same type, regardless of data.
     */
    val hasWildCardData: Boolean

    /**
     * Compare equality of this base item to another, ignoring amount.
     *
     * @param item the [FcItem] to compare to
     * @return `true` if the items are similar
     */
    fun isSimilar(item: FcItem<TBase>): Boolean

    /**
     * Checks if this item can be used as an ingredient in a recipe.
     * Ingredient can have wildcard data.
     *
     * @param ingredient the ingredient of a recipe
     * @return `true` if this item can be used as the ingredient
     */
    fun matchesIngredient(ingredient: FcItem<TBase>): Boolean

    /**
     * Checks if the items are similar, and have the same amount.
     *
     * @return `true` if the items are equal
     */
    fun equals(other: FcItem<TBase>): Boolean {
        return amount == other.amount && isSimilar(other)
    }

    /**
     * A hash code for this item.
     *
     * The hash code should remain the same between starts.
     *
     * @return the item's hash code
     */
    override fun hashCode(): Int
}
