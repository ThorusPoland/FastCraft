package net.benwoodworth.fastcraft.core.api.gui.events;

import net.benwoodworth.fastcraft.core.api.dependencies.event.FcEventCancellable;

/**
 * A click event for GUI buttons.
 *
 * @param <TItem> The native item type.
 */
public class GuiButtonClickEvent<TItem> implements FcEventCancellable {

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void raise() {

    }
}
