package net.benwoodworth.fastcraft.dependencies.inventory

/**
 * A Minecraft chest inventory.
 *
 * @param TItem the native item type
 */
interface FcChestInventory<TItem> : FcInventory<TItem>, ItemGrid<FcItem<TItem>> {

    /**
     * Add items to the inventory.
     *
     * @param items the items to add
     * @return items that could not be added to the inventory
     */
    fun addItems(items: Collection<FcItem<TItem>>): List<FcItem<TItem>>

    /**
     * Remove items from the inventory.
     *
     * @param items the items to remove
     * @return items that could not be removed from the inventory
     */
    fun removeItems(items: Collection<FcItem<TItem>>): List<FcItem<TItem>>
}
