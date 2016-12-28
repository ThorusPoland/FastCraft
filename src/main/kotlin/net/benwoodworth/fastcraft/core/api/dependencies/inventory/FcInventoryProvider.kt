package net.benwoodworth.fastcraft.core.api.dependencies.inventory

/**
 * Provides inventories and items for the plugin.
 *
 * @param TItem the native item type
 */
interface FcInventoryProvider<TItem> {

    /**
     * Create a new empty item.
     *
     * @return a new empty item
     */
    fun createItem(): FcItem<TItem>

    /**
     * Create a new grid inventory.
     *
     * @param height the height of the inventory
     * @param title the title of the inventory
     * @param carrier the carrier of the inventory
     * @return a chest inventory with the specified height and title
     */
    fun createInventory(height: Int, title: String?, carrier: Any?): FcInventory<TItem>
}
