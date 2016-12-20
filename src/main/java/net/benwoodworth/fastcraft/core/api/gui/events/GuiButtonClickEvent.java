package net.benwoodworth.fastcraft.core.api.gui.events;

import net.benwoodworth.fastcraft.core.api.dependencies.event.Cancellable;
import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayer;
import net.benwoodworth.fastcraft.core.api.gui.Gui;
import net.benwoodworth.fastcraft.core.api.gui.buttons.GuiButton;
import org.jetbrains.annotations.NotNull;

/**
 * A click event for GUI buttons.
 *
 * @param <TItem> The native item type.
 */
public class GuiButtonClickEvent<TItem> implements Cancellable {

    @NotNull
    private final Gui<TItem> gui;
    @NotNull
    private final GuiButton<TItem> button;
    @NotNull
    private final FcPlayer<TItem> player;

    private boolean cancelled = false;

    /**
     * Construct a new GuiButtonClickEvent.
     *
     * @param gui The GUI in which the button was pressed.
     * @param button The button that was pressed.
     * @param player The player who pressed the button.
     */
    public GuiButtonClickEvent(@NotNull Gui<TItem> gui,
                               @NotNull GuiButton<TItem> button,
                               @NotNull FcPlayer<TItem> player) {
        this.gui = gui;
        this.button = button;
        this.player = player;
    }

    /**
     * Get the GUI in which the button was pressed.
     *
     * @return Returns the GUI.
     */
    @NotNull
    public Gui<TItem> getGui() {
        return gui;
    }

    /**
     * Get the button that was pressed.
     *
     * @return Returns the button.
     */
    @NotNull
    public GuiButton<TItem> getButton() {
        return button;
    }

    /**
     * Get the player who pressed the button.
     *
     * @return Returns the player.
     */
    @NotNull
    public FcPlayer<TItem> getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
