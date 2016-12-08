package net.benwoodworth.fastcraftplus.core.event

/**
 * Handles events that have been raised.
 */
interface FcEventHandler<in TEvent : FcEvent<*>> {

    /**
     * Handle an event that has been raised.
     *
     * @param event The event that has been raised.
     */
    fun handleEvent(event: TEvent)
}
