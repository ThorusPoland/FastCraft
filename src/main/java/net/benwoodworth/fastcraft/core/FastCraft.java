package net.benwoodworth.fastcraft.core;

import net.benwoodworth.fastcraft.core.api.dependencies.Dependencies;
import org.jetbrains.annotations.NotNull;

/**
 * The core class of FastCraft.
 */
public class FastCraft {

    @NotNull
    private Dependencies dependencies;

    /**
     * Create a new instance of FastCraft.
     *
     * @param dependencies FastCraft dependencies.
     */
    public FastCraft(@NotNull Dependencies dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * Get the FastCraft dependencies.
     *
     * @return Returns FastCraft dependencies.
     */
    @NotNull
    public Dependencies getDependencies() {
        return dependencies;
    }
}
