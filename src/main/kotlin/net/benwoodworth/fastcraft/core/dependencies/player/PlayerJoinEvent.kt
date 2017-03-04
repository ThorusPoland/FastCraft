package net.benwoodworth.fastcraft.core.dependencies.player

import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

/**
 * An event for players joining the server.
 *
 * @param TItem the native item type
 */
interface PlayerJoinEvent<TItem> {

    /** The player who joined. */
    val player: FcPlayer<TItem>
}
