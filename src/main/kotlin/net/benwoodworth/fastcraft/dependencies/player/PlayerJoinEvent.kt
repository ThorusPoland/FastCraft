package net.benwoodworth.fastcraft.dependencies.player

import net.benwoodworth.fastcraft.dependencies.inventory.FcItem

/**
 * An event for players joining the server.
 *
 * @param TItem the native item type
 */
interface PlayerJoinEvent<TFcItem : FcItem<*>> {

    /** The player who joined. */
    val player: FcPlayer<TFcItem>
}
