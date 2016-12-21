package net.benwoodworth.fastcraft.core.api.dependencies.event;

import org.jetbrains.annotations.NotNull;

/**
 * Adapts an event from a native implementation.
 *
 * @param <TBase> the base event being adapted
 */
public interface FcEvent<TBase> {

    /**
     * The base of this event.
     *
     * @return the base of this event
     */
    @NotNull
    TBase getBaseEvent();

    /**
     * Raise the base event.
     */
    void raise();
}
