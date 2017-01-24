package net.benwoodworth.fastcraft.core.dependencies.player

import java.util.*

/**
 * Provides player for the plugin.
 *
 * @param TItem The native item type the player carries.
 */
interface FcPlayerProvider<TItem> {

    /**
     * Get a list of online player.
     *
     * @return A list of online player.
     */
    fun getOnlinePlayers(): List<FcPlayer<TItem>>

    /**
     * Get an online player given a UUID.
     *
     * @param uuid The player's UUID.
     * @return The player with the given UUID, or null if none exists.
     */
    fun getOnlinePlayer(uuid: UUID): FcPlayer<TItem>
}
