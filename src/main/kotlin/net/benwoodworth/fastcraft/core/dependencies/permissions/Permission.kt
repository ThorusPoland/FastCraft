package net.benwoodworth.fastcraft.core.dependencies.permissions

/**
 * A plugin permission.
 */
enum class Permission(
        /** The permission [String]. */
        val permissionString: String
) {
    /** Permission to use FastCraft for crafting */
    USE("fastcraft.use"),

    /** Permission to use the `craft` command */
    COMMAND_CRAFT("fastcraft.command.craft"),

    /** Permission to use the `toggle` */
    COMMAND_TOGGLE("fastcraft.command.toggle"),

    /** Permission to use the `toggle` command on other players */
    COMMAND_TOGGLE_OTHER("fastcraft.command.toggle.other"),

    /** Permission to use the FastCraft `reload` command */
    ADMIN_RELOAD("fastcraft.admin.reload");
}
