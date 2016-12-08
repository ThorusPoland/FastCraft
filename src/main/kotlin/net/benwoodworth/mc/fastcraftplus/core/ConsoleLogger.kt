package net.benwoodworth.mc.fastcraftplus.core

interface ConsoleLogger {

    /**
     * Log an error to the console.
     *
     * @param message The error message to log.
     */
    fun error(message: String)

    /**
     * Log info to the console.
     *
     * @param message The info to log.
     */
    fun info(message: String)

    /**
     * Log a warning to the console.
     *
     * @param message The warning to log.
     */
    fun warn(message: String)

    /**
     * Log a debug message to the console, only if debug output is enabled.
     *
     * @param message The debug message to log.
     */
    fun debug(message: String)
}
