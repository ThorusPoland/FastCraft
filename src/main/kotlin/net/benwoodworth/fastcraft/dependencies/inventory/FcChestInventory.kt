package net.benwoodworth.fastcraft.dependencies.inventory

/**
 * A Minecraft chest inventory.
 *
 * @param TFcItem the item type
 */
interface FcChestInventory<TFcItem : FcItem<*>> : FcInventory<TFcItem>, ItemGrid<TFcItem> {

    /**
     * Add items to the inventory.
     *
     * @param items the items to add
     * @return items that could not be added to the inventory
     */
    fun addItems(items: Collection<TFcItem>): List<TFcItem>

    /**
     * Remove items from the inventory.
     *
     * @param items the items to remove
     * @return items that could not be removed from the inventory
     */
    fun removeItems(items: Collection<TFcItem>): List<TFcItem>
}
