package net.benwoodworth.fastcraft.core.api.dependencies.event;

import org.jetbrains.annotations.NotNull;

/**
 * Adapts an event from a native implementation.
 */
public interface FcEvent {

    /**
     * Raise the base event.
     */
    void raise();
}
