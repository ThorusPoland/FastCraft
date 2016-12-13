package net.benwoodworth.fastcraft.core.api.inventory

/**
 * A Minecraft item.
 *
 * @param <TBase> The item type from the native server platform.
 */
abstract class FcItem<TBase> {
    /**
     * The base item being adapted.
     */
    abstract val base: TBase

    /**
     * The Minecraft item type ID.
     */
    abstract var typeId: String

    /**
     * The amount of items in this stack.
     */
    abstract var amount: Int

    /**
     * The display name of this item.
     */
    abstract var displayName: String?

    /**
     * The lore of this item.
     */
    abstract var lore: Array<String>

    /**
     * Get the maximum size of this stack.
     */
    abstract val maxStackSize: Int

    /**
     * Whether this item, as an ingredient, matches any item of the same type, regardless of data.
     */
    abstract val wildcardData: Boolean

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
    abstract fun isSimilar(item: FcItem<TBase>): Boolean

    /**
     * Checks if this item can be used as an ingredient in a recipe.
     * Ingredient can have wildcard data.
     *
     * @param ingredient The ingredient of a recipe.
     * @return Returns true if this item can be used as the ingredient.
     */
    abstract fun matchesIngredient(ingredient: FcItem<TBase>): Boolean

    /**
     * A hash code for this item.
     *
     * @return Returns the item's hash code.
     */
    abstract override fun hashCode(): Int

    /**
     * Compare equality to an object that isn't an FcItem<T>.
     *
     * @return Returns false.
     */
    override fun equals(other: Any?): Boolean = false

    /**
     * Checks if the items are similar, and have the same amount.
     *
     * @return Returns whether the items are equal.
     */
    fun equals(other: FcItem<TBase>): Boolean {
        return isSimilar(other) && amount == other.amount
    }
}
