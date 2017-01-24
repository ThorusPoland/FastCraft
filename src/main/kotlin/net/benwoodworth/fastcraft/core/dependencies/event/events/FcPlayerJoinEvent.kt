package net.benwoodworth.fastcraft.core.dependencies.event.events

import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

/**
 * An event for players joining the server.
 *
 * @param TItem the native item type
 */
interface FcPlayerJoinEvent<TItem> {

    /** The player who joined. */
    val player: FcPlayer<TItem>
}
