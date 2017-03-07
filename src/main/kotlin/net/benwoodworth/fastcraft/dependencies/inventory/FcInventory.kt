package net.benwoodworth.fastcraft.dependencies.inventory

import net.benwoodworth.fastcraft.dependencies.player.FcPlayer

import java.util.*

/**
 * A Minecraft inventory.
 *
 * @param TFcItem type of item contained in this inventory.
 */
interface FcInventory<TFcItem : FcItem<*>> {

    /** The title of the inventory. */
    val title: String?

    /** The players viewing the inventory. */
    val viewers: List<FcPlayer<TFcItem>>

    /** The carrier of this inventory. */
    val carrier: Any?
}
