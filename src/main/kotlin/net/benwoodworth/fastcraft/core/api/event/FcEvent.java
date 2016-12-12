package net.benwoodworth.fastcraft.core.api.event;

/**
 * Adapts an event from a native implementation.
 */
public interface FcEvent<TBase> {

    /**
     * The base of this event.
     */
    TBase getBaseEvent();

    /**
     * Whether this event has been cancelled.
     */
    boolean isCancelled();

    /**
     * Raise the base event.
     */
    void raise();
}
