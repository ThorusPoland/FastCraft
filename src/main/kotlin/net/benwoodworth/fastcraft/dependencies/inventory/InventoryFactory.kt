package net.benwoodworth.fastcraft.dependencies.inventory

/**
 * Provides inventories and items for the plugin.
 *
 * @param TItem the native item type
 * @param TInventory the native inventory type
 */
interface InventoryFactory<TItem, in TInventory> {

    /**
     * Create a new empty item.
     *
     * @return a new empty item
     */
    fun createItem(): FcItem<TItem>

    /**
     * Create a new chest inventory.
     *
     * @param height  the height of the inventory
     * @param title   the title of the inventory
     * @param carrier the carrier of the inventory
     * @return a chest inventory with the specified height and title
     */
    fun createChestInventory(height: Int, title: String? = null, carrier: Any? = null): FcChestInventory<TItem>

    /**
     * Adapt a native inventory implementation.
     *
     * @param inventory the native inventory
     * @return the adapted inventory
     */
    fun adaptInventory(inventory: TInventory): FcInventory<TItem>
}
