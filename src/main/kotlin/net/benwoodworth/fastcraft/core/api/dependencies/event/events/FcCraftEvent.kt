package net.benwoodworth.fastcraft.core.api.dependencies.event.events

import net.benwoodworth.fastcraft.core.api.dependencies.event.Cancellable
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.ItemGrid

/**
 * Event for crafting items.
 *
 * @param TBase the base of this event
 * @param TItem the native item used in this event
 */
interface FcCraftEvent<TBase, TItem> : Cancellable {

    /**
     * Get the matrix that was used to craft an item.
     *
     * @return the crafting matrix
     */
     fun getMatrix(): ItemGrid<FcItem<TItem>> // TODO Inventory instead of matrix.

    /**
     * The crafting item results.
     *
     * @return the crafting results
     */
    fun getResults(): List<FcItem<TItem>>
}
