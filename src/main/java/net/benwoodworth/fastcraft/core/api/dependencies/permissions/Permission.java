package net.benwoodworth.fastcraft.core.api.dependencies.permissions;

import org.jetbrains.annotations.NotNull;

/**
 * A plugin permission.
 */
public enum Permission {
    USE("fastcraft.use"),

    COMMAND_CRAFT("fastcraft.command.craft"),
    COMMAND_TOGGLE("fastcraft.command.toggle"),
    COMMAND_TOGGLE_OTHER("fastcraft.command.toggle"),

    ADMIN_RELOAD("fastcraft.admin.reload");

    @NotNull
    private final String permission;

    /**
     * Create a new permission.
     *
     * @param permission the permission {@link String}
     */
    Permission(@NotNull String permission) { // TODO Description, defaults, children, ....
        this.permission = permission;
    }

    /**
     * Get this permission's permission {@link String}.
     *
     * @return the permission {@link String}
     */
    @NotNull
    public String getPermissionString() {
        return permission;
    }
}
