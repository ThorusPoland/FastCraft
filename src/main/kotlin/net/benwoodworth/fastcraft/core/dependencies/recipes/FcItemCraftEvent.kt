package net.benwoodworth.fastcraft.core.dependencies.recipes

import net.benwoodworth.fastcraft.core.dependencies.event.Cancellable
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcCraftingInventory
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.core.dependencies.inventory.ItemGrid
import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

/**
 * Event for crafting items.
 *
 * @param TItem the native item type
 */
interface FcItemCraftEvent<TItem> : Cancellable {

    /** The player crafting the item. */
    val player: FcPlayer<TItem>

    /** The crafting inventory. */
    val inventory: FcCraftingInventory<TItem>
}
