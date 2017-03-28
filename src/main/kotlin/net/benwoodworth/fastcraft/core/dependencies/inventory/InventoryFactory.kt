package net.benwoodworth.fastcraft.core.dependencies.inventory

/**
 * Provides inventories and items for the plugin.
 *
 * @param TFcItem the item type
 */
interface InventoryFactory<TFcItem : FcItem<*>> {

    /**
     * Create a new chest inventory.
     *
     * @param height  the height of the inventory
     * @param title   the title of the inventory
     * @param carrier the carrier of the inventory
     * @return a chest inventory with the specified height and title
     */
    fun createChestInventory(height: Int, title: String? = null, carrier: Any? = null): FcChestInventory<TFcItem>



}
