package net.benwoodworth.fastcraft.core.api.dependencies.config;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

/**
 * A section of a config, providing access to keys/values, and other sub-sections.
 */
public abstract class FcConfigSection {

    /**
     * Get a config section.
     *
     * @param name the section name
     * @return the section with the given name, or {@code null} if it doesn't exist
     */
    @Nullable
    public abstract FcConfigSection getSection(@NotNull String name);

    /**
     * Create a new config section.
     *
     * @param name the name of the new section
     * @return the new config section
     */
    @NotNull
    public abstract FcConfigSection createSection(@NotNull String name);

    /**
     * Set a value at a given key.
     *
     * @param key   the key
     * @param value the value to set
     * @param <T>   the value type
     */
    public abstract <T> void setValue(@NotNull String key, @Nullable T value);

    /**
     * Get a value, given a key.
     *
     * @param key the key
     * @param <T> the value type
     * @return the value at the given key, or null if the key does not exist
     */
    @Nullable
    public abstract <T> T getValue(@NotNull String key);

    /**
     * Get a value given a key.
     *
     * @param key          the key
     * @param defaultValue the value to return if the actual value is {@code null}
     * @param <T>          the value type
     * @return the value, or {@code defaultValue} if {@code null}
     */
    @NotNull
    public <T> T getValue(@NotNull String key, @NotNull T defaultValue) {
        T result = getValue(key);
        return result == null ? defaultValue : result;
    }
}
