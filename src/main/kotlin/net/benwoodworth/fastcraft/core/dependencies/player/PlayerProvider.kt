package net.benwoodworth.fastcraft.core.dependencies.player

import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem
import java.util.*

/**
 * Provides player for the plugin.
 *
 * @param TFcItem The item type the player carries in their inventory.
 */
interface PlayerProvider<TFcItem : FcItem<*>> {

    /**
     * Get a list of online player.
     *
     * @return A list of online players
     */
    fun getOnlinePlayers(): List<FcPlayer<TFcItem>>

    /**
     * Get an online player given a UUID.
     *
     * @param uuid The player's UUID
     * @return The player with the given UUID, or null if none exists
     */
    fun getOnlinePlayer(uuid: UUID): FcPlayer<TFcItem>
}
