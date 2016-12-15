package net.benwoodworth.fastcraft.core.api.gui.buttons;

import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayoutAbstract;

/**
 * A button in a GUI.
 */
public class GuiButton<TItem> extends GuiLayoutAbstract<TItem> {

    @Override
    public int getWidth() {
        return 1;
    }

    @Override
    public int getHeight() {
        return 1;
    }
}
