package net.benwoodworth.fastcraft.core.dependencies.config

import java.io.File
import java.io.IOException

/**
 * Reads and stores values in a configuration.
 */
interface FcConfig : FcConfigSection {

    /**
     * Load a config from a file.
     *
     * @param file the [File] to load
     * @throws IOException if there was a problem loading the config
     */
    fun load(file: File)

    /**
     * Save this [FcConfig] to a file.
     *
     * @param file the [File] to save to
     * @throws IOException if there was a problem saving the config
     */
    fun save(file: File)

    /**
     * Get the header comment.
     *
     * @return the header comment
     */
    fun getConfigHeader(): String?

    /**
     * Set the header comment.
     *
     * @param header the new header comment
     */
    fun setConfigHeader(header: String?)
}
