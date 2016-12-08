package net.benwoodworth.mc.fastcraftplus.core.inventory

/**
 * A grid of items.
 */
interface ItemGrid<out TItem : FcItem<*>> {

    /**
     * The width of the item grid.
     */
    val width: Int

    /**
     * The height of the item grid.
     */
    val height: Int

    /**
     * Get an item from the item grid.
     *
     * @param x The x-coordinate within the grid, where 0 is the left column.
     * @param y The y-coordinate within the grid, where 0 is the top row.
     */
    fun getItem(x: Int, y: Int): TItem
}
