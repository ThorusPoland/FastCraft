package net.benwoodworth.fastcraftplus.core.player

import net.benwoodworth.fastcraftplus.core.inventory.FcInventory
import net.benwoodworth.fastcraftplus.core.inventory.FcItem
import net.benwoodworth.fastcraftplus.core.permission.Permission
import java.util.*

/**
 * A Minecraft player.
 *
 * @param TItem The type of item the player carries.
 */
interface FcPlayer<TItem : FcItem<*>> {

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

    /**
     * Open an inventory.
     *
     * @param inventory The inventory to open.
     */
    fun openInventory(inventory: FcInventory<TItem>)
}
