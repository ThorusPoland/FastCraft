package net.benwoodworth.fastcraft.dependencies.player

import net.benwoodworth.fastcraft.dependencies.inventory.FcInventory
import net.benwoodworth.fastcraft.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.dependencies.permissions.Permission
import java.util.*

/**
 * A Minecraft player.
 *
 * @param TFcItem The type of item the player carries.
 */
interface FcPlayer<TFcItem : FcItem<*>> {

    /** The player's username. */
    val username: String

    /** The player's display name. */
    var displayName: String?

    /** The player's UUID. */
    var uuid: UUID

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

    /**
     * Open an inventory.
     *
     * @param inventory The inventory to open.
     */
    fun openInventory(inventory: FcInventory<TFcItem>)
}
