package net.benwoodworth.fastcraftplus.core.inventory

/**
 * Provides inventories and items for the plugin.
 */
interface InventoryProvider<TItem> {

    fun getItem(): FcItem<TItem>

    fun getChestInventory(height: Int, title: String?): FcChestInventory<TItem>

    fun getCraftingInventory(matrixWidth: Int, matrixHeight: Int, title: String?): FcCraftingInventory<TItem>
}