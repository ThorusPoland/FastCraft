package net.benwoodworth.fastcraft.core.api.dependencies.config;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;

/**
 * Reads and stores values in a configuration.
 */
abstract class FcConfig extends FcConfigSection {

    /**
     * Load a config from a file.
     *
     * @param file the {@link File} to load
     * @throws IOException if there was a problem loading the config
     */
    public abstract void load(@NotNull File file) throws IOException;

    /**
     * Save this {@link FcConfig} to a file.
     *
     * @param file the {@link File} to save to
     * @throws IOException if there was a problem saving the config
     */
    public abstract void save(@NotNull File file) throws IOException;

    /**
     * Get the header comment.
     *
     * @return the header comment
     */
    @Nullable
    public abstract String getConfigHeader();

    /**
     * Set the header comment.
     *
     * @param header the new header comment
     */
    public abstract void setConfigHeader(@Nullable String header);
}
