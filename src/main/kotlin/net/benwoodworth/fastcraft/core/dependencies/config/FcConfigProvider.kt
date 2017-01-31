package net.benwoodworth.fastcraft.core.dependencies.config

/**
 * Provides new configs.
 */
interface FcConfigProvider {

    /**
     * Create a new empty config.
     *
     * @return a new empty config
     */
    fun createEmptyConfig(): FcConfig
}
