package net.benwoodworth.fastcraft.core.api.gui.events;

import net.benwoodworth.fastcraft.core.api.dependencies.event.FcEvent;
import net.benwoodworth.fastcraft.core.api.dependencies.event.FcEventCancellable;

/**
 * Created by bwoodworth on 12/13/2016.
 */
public class GuiButtonClickEvent implements FcEventCancellable {

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void raise() {

    }
}
