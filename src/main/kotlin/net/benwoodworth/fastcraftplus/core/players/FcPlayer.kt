package net.benwoodworth.fastcraftplus.core.players

import net.benwoodworth.fastcraftplus.core.permissions.Permission
import java.util.*

interface FcPlayer {

    /**
     * The player's name.
     */
    val Name: String

    /**
     * The player's UUID.
     */
    val Uuid: UUID

    /**
     * Send a message to the player.
     *
     * @param message The message to send.
     */
    fun sendMessage(message: String)

    /**
     * See if the player has a permission.
     *
     * @param permission The permission to check.
     */
    fun hasPermission(permission: Permission): Boolean
}
