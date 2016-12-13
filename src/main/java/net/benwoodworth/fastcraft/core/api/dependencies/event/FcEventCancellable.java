package net.benwoodworth.fastcraft.core.api.dependencies.event;

/**
 * A cancellable event.
 */
public interface FcEventCancellable extends FcEvent {

    /**
     * Whether this event has been cancelled.
     */
    boolean isCancelled();

}
