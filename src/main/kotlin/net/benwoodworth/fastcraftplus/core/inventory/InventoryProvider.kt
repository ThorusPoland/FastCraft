package net.benwoodworth.fastcraftplus.core.inventory

/**
 * Provides inventories and items for the plugin.
 */
interface InventoryProvider<TItem> {

    fun getNewItem(): ItemAdapter<TItem>

    fun getNewInventory(height: Int, title: String?): InventoryAdapter<TItem>
}