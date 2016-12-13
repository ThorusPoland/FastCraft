package net.benwoodworth.fastcraft.core.api.event;

import org.jetbrains.annotations.NotNull;

/**
 * Handles events that have been raised.
 */
public interface FcEventHandler<TEvent extends FcEvent<?>> {

    /**
     * Handle an event that has been raised.
     *
     * @param event The event that has been raised.
     */
    void handleEvent(@NotNull TEvent event);
}
