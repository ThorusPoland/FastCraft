package net.benwoodworth.fastcraft.core.api.dependencies.player;

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcInventory;
import net.benwoodworth.fastcraft.core.api.dependencies.permissions.Permission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * A Minecraft player.
 *
 * @param <TItem> The native item type that the player carries.
 */
public interface FcPlayer<TItem> {

    /**
     * Get the player's username.
     */
    @NotNull
    String getUsername();

    /**
     * Get the player's display name.
     */
    @Nullable
    String getDisplayName();

    /**
     * Set the player's display name.
     */
    void setDisplayName(@Nullable String displayName);

    /**
     * The player's UUID.
     */
    @NotNull
    UUID getUuid();

    /**
     * Send a message to the player.
     *
     * @param message The message to send.
     */
    void sendMessage(@NotNull String message);

    /**
     * See if the player has a permission.
     *
     * @param permission The permission to check.
     */
    boolean hasPermission(@NotNull Permission permission);

    /**
     * Open an inventory.
     *
     * @param inventory The inventory to open.
     */
    void openInventory(@NotNull FcInventory<TItem> inventory);
}
