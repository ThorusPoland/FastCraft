package net.benwoodworth.fastcraft.core;

import net.benwoodworth.fastcraft.core.api.dependencies.FcDependencies;
import org.jetbrains.annotations.NotNull;

/**
 * The core class of FastCraft.
 */
public class FastCraft {

    @NotNull
    private FcDependencies dependencies;

    /**
     * Create a new instance of FastCraft.
     *
     * @param dependencies FastCraft dependencies.
     */
    public FastCraft(@NotNull FcDependencies dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * Get the FastCraft dependencies.
     *
     * @return Returns FastCraft dependencies.
     */
    @NotNull
    public FcDependencies getDependencies() {
        return dependencies;
    }
}
