package net.benwoodworth.fastcraft.core.dependencies.event.events

import net.benwoodworth.fastcraft.core.dependencies.event.Cancellable
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.core.dependencies.inventory.ItemGrid
import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

/**
 * Event for crafting items.
 *
 * @param TItem the native item type
 */
interface FcItemCraftEvent<TItem> : Cancellable {

    /** The player who crafted the item */
    val player: FcPlayer<TItem>

    /** The matrix that was used to craft an item. */
    val matrix: ItemGrid<FcItem<TItem>> // TODO Inventory instead of matrix.

    /** The crafting item results. */
    val results: List<FcItem<TItem>>
}
