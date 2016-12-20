package net.benwoodworth.fastcraft.core.api.dependencies.event;

import org.jetbrains.annotations.NotNull;

/**
 * Adapts an event from a native implementation.
 *
 * @param <TBase> The base event being adapted.
 */
public interface FcEvent<TBase> {

    /**
     * The base of this event.
     */
    @NotNull
    TBase getBaseEvent();

    /**
     * Raise the base event.
     */
    void raise();
}
