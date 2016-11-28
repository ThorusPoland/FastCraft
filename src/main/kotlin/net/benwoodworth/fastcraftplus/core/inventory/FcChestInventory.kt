package net.benwoodworth.fastcraftplus.core.inventory

/**
 * Created by bwoodworth on 11/28/2016.
 */
interface FcChestInventory<TItem> : FcInventory<TItem> {

    /**
     * The grid of items in this inventory.
     */
    val itemGrid: ItemGrid<TItem>

    /**
     * Add items to the inventory.
     *
     * @param items The items to add.
     * @return Items that could not be added to the inventory.
     */
    abstract fun addItems(vararg items: FcItem<TItem>): Array<FcItem<TItem>>

    /**
     * Remove items from the inventory.
     *
     * @param items The items to remove.
     * @return Items that could not be removed from the inventory.
     */
    abstract fun removeItems(vararg items: FcItem<TItem>): Array<FcItem<TItem>>

    /**
     * See if items are all in the inventory.
     */
    fun contains(vararg items: FcItem<TItem>): Boolean {
        val amounts = Array(contents.size, {contents[it].amount})

        items@for (item in items) {
            var remaining = item.amount

            for (i in 0..contents.size) {
                if (i == contents.size) return false
                if (!contents[i].isSimilar(item)) continue

                if (amounts[i] < remaining) {
                    remaining -= amounts[i]
                    amounts[i] = 0
                } else {
                    amounts[i] -= remaining
                    continue@items
                }
            }
        }

        return true
    }
}
