package net.benwoodworth.fastcraft.core.api.gui;

import net.benwoodworth.fastcraft.core.api.dependencies.Dependencies;
import org.jetbrains.annotations.NotNull;

/**
 * Created by bwoodworth on 12/13/2016.
 */
public class GuiApi<TItem> {

    @NotNull
    private final Dependencies<TItem> dependencies;

    public GuiApi(@NotNull Dependencies<TItem> dependencies) {
        this.dependencies = dependencies;
    }
}
