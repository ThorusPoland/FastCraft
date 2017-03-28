package net.benwoodworth.fastcraft.core.dependencies.inventory

/**
 * A mutable Minecraft item.
 *
 * @param TBase the item type
 */
interface FcItemMutable<TBase> : FcItem<TBase> {

    /** The base item. */
    val baseItem: TBase

    /** The Minecraft item type ID. */
    override var typeId: String

    /** The amount of items in this stack. */
    override var amount: Int

    /** The display name of this item. */
    override var displayName: String?

    /**
     * Set the item's lore.
     *
     * @param lore the item's lore
     */
    fun setLore(lore: List<String?>)

    /**
     * Add an enchantment to the item.
     *
     * @param enchantmentId the Minecraft enchantment ID
     * @param level         the enchantment level
     */
    fun addEnchantment(enchantmentId: String, level: Int)
}
