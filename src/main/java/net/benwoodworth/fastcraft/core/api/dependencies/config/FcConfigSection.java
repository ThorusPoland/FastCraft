package net.benwoodworth.fastcraft.core.api.dependencies.config;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

/**
 * A config section.
 */
public abstract class FcConfigSection {

    /**
     * Get a config section.
     *
     * @param name The section name.
     * @return Returns the section with the given name, or null if it doesn't exist.
     */
    @Nullable
    public abstract FcConfigSection getSection(@NotNull String name);

    /**
     * Create a new config section.
     *
     * @param name The name of the new section.
     * @return Returns the new config section.
     */
    @NotNull
    public abstract FcConfigSection createSection(@NotNull String name);

    /**
     * Set a value at a given key.
     *
     * @param key The key.
     * @param value The value to set.
     * @param <T> The value type.
     */
    public abstract <T> void setValue(@NotNull String key, @Nullable T value);

    /**
     * Get a value given a key.
     *
     * @param key The key.
     * @param <T> The value type.
     * @return Returns the value.
     */
    @Nullable
    public abstract <T> T getValue(@NotNull String key);

    /**
     * Get a value given a key.
     *
     * @param key The key.
     * @param defaultValue The value to return if the actual value is null.
     * @param <T> The value type.
     * @return Returns the value, or defaultValue if null.
     */
    @NotNull
    public <T> T getValue(@NotNull String key, @NotNull T defaultValue) {
        T result = getValue(key);
        return result == null ? defaultValue : result;
    }
}
