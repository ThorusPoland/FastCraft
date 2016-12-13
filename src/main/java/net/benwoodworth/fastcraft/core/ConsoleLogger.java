package net.benwoodworth.fastcraft.core;

import org.jetbrains.annotations.NotNull;

public interface ConsoleLogger {

    /**
     * Log an error to the console.
     *
     * @param message The error message to log.
     */
    void error(@NotNull String message);

    /**
     * Log info to the console.
     *
     * @param message The info to log.
     */
    void info(@NotNull String message);

    /**
     * Log a warning to the console.
     *
     * @param message The warning to log.
     */
    void warn(@NotNull String message);

    /**
     * Log a debug message to the console, only if debug output is enabled.
     *
     * @param message The debug message to log.
     */
    void debug(@NotNull String message);
}
