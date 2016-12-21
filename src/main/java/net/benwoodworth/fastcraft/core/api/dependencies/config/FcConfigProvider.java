package net.benwoodworth.fastcraft.core.api.dependencies.config;

import org.jetbrains.annotations.NotNull;

/**
 * Provides new configs.
 */
public interface FcConfigProvider {

    /**
     * Create a new empty config.
     *
     * @return a new empty config
     */
    @NotNull
    FcConfig createEmptyConfig();
}
