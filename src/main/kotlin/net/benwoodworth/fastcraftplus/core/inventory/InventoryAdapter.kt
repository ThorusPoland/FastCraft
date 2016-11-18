package net.benwoodworth.fastcraftplus.core.inventory

import net.benwoodworth.fastcraftplus.core.players.PlayerAdapter

/**
 * Adapts items so they can be used by the plugin.
 */
abstract class InventoryAdapter<TItem> {
    /**
     * The height of the inventory.
     */
    abstract val height: Int
        get

    /**
     * The title of the inventory.
     */
    abstract val title: String?
        get

    /**
     * The contents of the inventory.
     */
    abstract val contents: Array<ItemAdapter<TItem>>
        get

    /**
     * The players viewing the inventory.
     */
    abstract val viewers: Array<PlayerAdapter>

    /**
     * Get an item from the inventory.
     *
     * @param x The x-coordinate of the item.
     * @param y The y-coordinate of the item.
     * @return The item at the given coordinates.
     */
    abstract fun getItem(x: Int, y: Int): ItemAdapter<TItem>

    /**
     * Set an item in the inventory.
     *
     * @param x The x-coordinate of the item.
     * @param y The y-coordinate of the item.
     * @param item The item to set.
     */
    abstract fun setItem(x: Int, y: Int, item: ItemAdapter<TItem>)

    /**
     * Add items to the inventory.
     *
     * @param items The items to add.
     * @return Items that could not be added to the inventory.
     */
    abstract fun addItems(vararg items: ItemAdapter<TItem>): Array<ItemAdapter<TItem>>

    /**
     * Remove items from the inventory.
     *
     * @param items The items to remove.
     * @return Items that could not be removed from the inventory.
     */
    abstract fun removeItems(vararg items: ItemAdapter<TItem>): Array<ItemAdapter<TItem>>

    /**
     * See if items are all in the inventory.
     */
    fun contains(vararg items: ItemAdapter<TItem>): Boolean {
        val amounts = Array(contents.size, {contents[it].amount})

        items@for (item in items) {
            var remaining = item.amount

            for (i in contents.indices) {
                if (!contents[i].isSimilar(item)) continue

                if (amounts[i] < remaining) {
                    remaining -= amounts[i]
                    amounts[i] = 0
                } else {
                    amounts[i] -= remaining
                    continue@items
                }
            }

            if (remaining > 0)
                return false
        }

        return true
    }
}
