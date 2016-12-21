package net.benwoodworth.fastcraft.core.api.dependencies;

import org.jetbrains.annotations.NotNull;

public interface FcConsoleLogger {

    /**
     * Log an error to the console.
     *
     * @param message the error message to log
     */
    void error(@NotNull String message);

    /**
     * Log info to the console.
     *
     * @param message the info to log
     */
    void info(@NotNull String message);

    /**
     * Log a warning to the console.
     *
     * @param message the warning to log
     */
    void warn(@NotNull String message);

    /**
     * Log a debug message to the console, only if debug output is enabled.
     *
     * @param message the debug message to log
     */
    void debug(@NotNull String message);
}
