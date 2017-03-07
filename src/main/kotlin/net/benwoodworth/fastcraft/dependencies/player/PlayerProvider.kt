package net.benwoodworth.fastcraft.dependencies.player

import net.benwoodworth.fastcraft.dependencies.inventory.FcItem
import java.util.*

/**
 * Provides player for the plugin.
 *
 * @param TItem The native item type the player carries.
 */
interface PlayerProvider<TFcItem : FcItem<*>> {

    /**
     * Get a list of online player.
     *
     * @return A list of online player.
     */
    fun getOnlinePlayers(): List<FcPlayer<TFcItem>>

    /**
     * Get an online player given a UUID.
     *
     * @param uuid The player's UUID.
     * @return The player with the given UUID, or null if none exists.
     */
    fun getOnlinePlayer(uuid: UUID): FcPlayer<TFcItem>
}
