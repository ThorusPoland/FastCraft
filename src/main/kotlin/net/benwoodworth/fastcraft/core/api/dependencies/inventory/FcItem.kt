package net.benwoodworth.fastcraft.core.api.dependencies.inventory

/**
 * An immutable Minecraft item.
 *
 * @param TBase the native item type
 */
abstract class FcItem<TBase>(
        /** The base item */
        open protected val baseItem: TBase
) {

    /** The Minecraft item type ID. */
    abstract var typeId: String

    /** The amount of items in this stack. */
    abstract var amount: Int

    /** The display name of this item. */
    abstract var displayName: String?

    /** The maximum size of this stack. */
    abstract val maxStackSize: Int

    /**
     * Construct an immutable FcItem from another FcItem.
     *
     * @param item the FcItem this will be based off
     */
    constructor(item: FcItem<TBase>) : this(item.cloneBaseItem())

    /**
     * Clone the base item being adapted.
     *
     * @return a clone of the base item
     */
    abstract fun cloneBaseItem(): TBase

    /**
     * Get the item's lore.
     *
     * @return the item's lore
     */
    abstract fun getLore(): List<String?>

    /**
     * Set the item's lore.
     *
     * @param lore the item's lore
     */
    abstract fun setLore(lore: List<String?>)

    /**
     * Add an enchantment to the item.
     *
     * @param enchantmentId the Minecraft enchantment ID
     * @param level the enchantment level
     */
    abstract fun addEnchantment(enchantmentId: String, level: Int)

    /**
     * Whether this item, as an ingredient, matches any
     * item of the same type, regardless of data.
     */
    abstract val hasWildCardData: Boolean

    /**
     * Compare equality of this base item to another, ignoring amount.
     *
     * @param item the [FcItem] to compare to
     * @return `true` if the items are similar
     */
    abstract fun isSimilar(item: FcItem<TBase>): Boolean

    /**
     * Checks if this item can be used as an ingredient in a recipe.
     * Ingredient can have wildcard data.
     *
     * @param ingredient the ingredient of a recipe
     * @return `true` if this item can be used as the ingredient
     */
    abstract fun matchesIngredient(ingredient: FcItem<TBase>): Boolean

    /**
     * A hash code for this item.
     *
     * @return the item's hash code
     */
    abstract override fun hashCode(): Int

    /**
     * Compare equality to an object that isn't an FcItem<T>.
     *
     * @return `false`
     */
    final override fun equals(other: Any?) = false

    /**
     * Checks if the items are similar, and have the same amount.
     *
     * @return `true` if the items are equal
     */
    fun equals(other: FcItem<TBase>): Boolean {
        return amount == other.amount && isSimilar(other)
    }
}
