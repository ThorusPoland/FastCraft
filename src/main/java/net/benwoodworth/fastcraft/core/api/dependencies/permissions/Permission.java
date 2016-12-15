package net.benwoodworth.fastcraft.core.api.dependencies.permissions;

import org.jetbrains.annotations.NotNull;

/**
 * Plugin permission.
 */
public enum Permission {
    USE("fastcraft.use"),

    COMMAND_CRAFT("fastcraft.command.craft"),
    COMMAND_TOGGLE("fastcraft.command.toggle"),
    COMMAND_TOGGLE_OTHER("fastcraft.command.toggle"),

    ADMIN_RELOAD("fastcraft.admin.reload");

    private final String permission;
    Permission(@NotNull String permission) { // TODO Description, defaults, children, ....
        this.permission = permission;
    }

    /**
     * Get this permission's permission string.
     *
     * @return Returns the permission string.
     */
    @NotNull
    public String getPermissionString() {
        return permission;
    }
}
