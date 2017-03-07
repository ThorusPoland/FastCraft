package net.benwoodworth.fastcraft.core.dependencies.player

import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * An event for players joining the server.
 *
 * @param TItem the native item type
 */
interface PlayerJoinEvent<TFcItem : FcItem<*>> {

    /** The player who joined. */
    val player: FcPlayer<TFcItem>
}
