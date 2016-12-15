package net.benwoodworth.fastcraft.core.api.dependencies.config;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;

/**
 * Reads and stores config values.
 */
abstract class FcConfig extends FcConfigSection {

    /**
     * Load a config from a file.
     */
    public abstract void load(@NotNull File file) throws IOException;

    /**
     * Save this config to a file.
     *
     * @param file The file to save this config to.
     */
    public abstract void save(@NotNull File file) throws IOException;

    /**
     * Get the config's header comment.
     *
     * @return Returns the config's header.
     */
    @Nullable
    public abstract String getConfigHeader();

    /**
     * Set the config's header comment.
     *
     * @param header The new config header.
     */
    public abstract void setConfigHeader(@Nullable String header);
}
