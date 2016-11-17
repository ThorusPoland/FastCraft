package net.benwoodworth.fastcraftplus.core.inventory

/**
 * Adapts an item object for use by FastCraft+.
 *
 * @param <TItem> The type of item being adapted.
 */
abstract class ItemAdapter<TItem> {
    /**
     * The base item being adapted.
     */
    abstract val base: TItem
        get

    /**
     * The Minecraft item type ID.
     */
    abstract var typeId: String
        get
        set

    /**
     * The amount of items in this stack.
     */
    abstract var amount: Int
        get
        set

    /**
     * The display name of this item.
     */
    abstract var displayName: String?
        get
        set

    /**
     * The lore of this item.
     */
    abstract var lore: Array<String>
        get
        set

    /**
     * Add an enchantment to the item.
     *
     * @param enchantmentId The Minecraft enchantment ID.
     * @param level The enchantment level.
     */
    abstract fun addEnchantment(enchantmentId: String, level: Int)

    /**
     * Compare equality to another item, ignoring amount.
     *
     * @param item The item to compare to.
     * @return Returns true if the items are similar.
     */
    abstract fun isSimilar(item: ItemAdapter<TItem>): Boolean

    /**
     * Checks if this item can be used as an ingredient in a recipe.
     * Ingredient can have wildcard data.
     *
     * @param ingredient The ingredient of a recipe.
     * @return Returns true if this item can be used as the ingredient.
     */
    abstract fun matchesIngredient(ingredient: ItemAdapter<TItem>): Boolean

    /**
     * A hash code for this item.
     *
     * @return Returns the item's hash code.
     */
    abstract override fun hashCode(): Int

    /**
     * Compare equality to an object that isn't an ItemAdapter<T>.
     *
     * @return Returns false.
     */
    override fun equals(other: Any?): Boolean = false

    /**
     * Checks if the items are similar, and have the same amount.
     *
     * @return Returns whether the items are equal.
     */
    fun equals(other: ItemAdapter<TItem>): Boolean {
        return isSimilar(other) && amount == other.amount
    }
}
