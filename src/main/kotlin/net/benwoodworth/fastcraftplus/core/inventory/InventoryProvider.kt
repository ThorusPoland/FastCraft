package net.benwoodworth.fastcraftplus.core.inventory

/**
 * Provides inventories and items for the plugin.
 */
interface InventoryProvider<TItem> {

    /**
     * Get a new blank item.
     */
    fun getItem(): FcItem<TItem>

    /**
     * Get a new chest inventory.
     *
     * @param height The height of the inventory.
     * @param title The title of the inventory.
     * @return A chest inventory with the specified height and title.
     */
    fun getChestInventory(height: Int, title: String?): FcChestInventory<TItem>

    /**
     * Get a new crafting inventory.
     *
     * @param matrixWidth The width of the crafting matrix.
     * @param matrixHeight The height of the crafting matrix.
     * @param title The title of the inventory.
     * @return A crafting inventory with the specified matrix width/height, and title.
     */
    fun getCraftingInventory(matrixWidth: Int, matrixHeight: Int, title: String?): FcCraftingInventory<TItem>
}