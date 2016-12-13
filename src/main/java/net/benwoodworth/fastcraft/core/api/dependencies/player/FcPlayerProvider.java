package net.benwoodworth.fastcraft.core.api.dependencies.player;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Provides player for the plugin.
 *
 * @param <TItem> The native item type the player carries.
 */
public interface FcPlayerProvider<TItem> {

    /**
     * Get a list of online player.
     *
     * @return A list of online player.
     */
    @NotNull
    List<TItem> getOnlinePlayers();

    /**
     * Get an online player given a UUID.
     *
     * @param uuid The player's UUID.
     * @return The player with the given UUID, or null if none exists.
     */
    @NotNull
    FcPlayer<TItem> getOnlinePlayer(@NotNull UUID uuid);
}
