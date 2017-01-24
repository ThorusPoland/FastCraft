package net.benwoodworth.fastcraft.core.dependencies.inventory

import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

import java.util.*

/**
 * A Minecraft inventory.
 *
 * @param TItem the native item type
 */
interface FcInventory<TItem> {

    /** The title of the inventory. */
    val title: String?

    /** The players viewing the inventory. */
    val viewers: List<FcPlayer<TItem>>

    /** The carrier of this inventory. */
    val carrier: Any?
}
