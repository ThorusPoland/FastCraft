package net.benwoodworth.fastcraft.core.api.gui;

import net.benwoodworth.fastcraft.core.api.dependencies.FcDependencies;
import org.jetbrains.annotations.NotNull;

/**
 * Created by bwoodworth on 12/13/2016.
 */
public class GuiApi<TItem> {

    @NotNull
    private final FcDependencies<TItem> dependencies;

    public GuiApi(@NotNull FcDependencies<TItem> dependencies) {
        this.dependencies = dependencies;
    }
}
