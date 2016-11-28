package net.benwoodworth.fastcraftplus.core.players

import net.benwoodworth.fastcraftplus.core.permissions.Permission
import java.util.*

interface FcPlayer {
    val Name: String
        get

    val Uuid: UUID
        get

    fun sendMessage(message: String)

    fun hasPermission(permission: Permission): Boolean
}
