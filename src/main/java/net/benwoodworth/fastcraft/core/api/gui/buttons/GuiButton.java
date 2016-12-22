package net.benwoodworth.fastcraft.core.api.gui.buttons;

import net.benwoodworth.fastcraft.core.api.dependencies.event.EventListener;
import net.benwoodworth.fastcraft.core.api.gui.events.GuiButtonClickEvent;
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout;
import org.jetbrains.annotations.NotNull;

/**
 * A button in a GUI.
 *
 * @param <TItem> the native item type
 */
public class GuiButton<TItem> extends GuiLayout<TItem> {

    @NotNull
    private final EventListener<GuiButtonClickEvent<TItem>> clickListener = new EventListener<>();

    @Override
    public int getWidth() {
        return 1;
    }

    @Override
    public int getHeight() {
        return 1;
    }

    /**
     * Get this button's click listener.
     *
     * @return the button's click listener
     */
    @NotNull
    public final EventListener<GuiButtonClickEvent<TItem>> getClickListener() {
        return clickListener;
    }
}
