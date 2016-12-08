package net.benwoodworth.mc.fastcraftplus.core.permission

/**
 * Plugin permission.
 */
enum class Permission(val Permission: String) {
    USE("fastcraft.use"),

    COMMAND_CRAFT("fastcraft.command.craft"),
    COMMAND_TOGGLE("fastcraft.command.toggle"),
    COMMAND_TOGGLE_OTHER("fastcraft.command.toggle"),

    ADMIN_RELOAD("fastcraft.admin.reload")
}
