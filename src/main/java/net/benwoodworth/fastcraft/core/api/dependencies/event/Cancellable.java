package net.benwoodworth.fastcraft.core.api.dependencies.event;

/**
 * An interface for cancellable events.
 */
public interface Cancellable {

    /**
     * Get the cancelled state of this event.
     *
     * @return Returns true if this event is cancelled.
     */
    boolean isCancelled();

    /**
     * Set the cancelled state of this event.
     *
     * @param cancelled The new cancelled state.
     */
    void setCancelled(boolean cancelled);
}
