package net.benwoodworth.fastcraft.core.api.event

/**
 * Listens to events, and notifies event handlers when events occur.
 *
 * @param TEvent The type of event being listened to.
 */
class FcEventListener<TEvent : FcEvent<*>> {

    /**
     * This listener's event handlers.
     */
    private val handlers = mutableListOf<FcEventHandler<TEvent>>()

    /**
     * Raise an event.
     *
     * @param event The event to handle.
     */
    fun notifyHandlers(event: TEvent) = handlers.forEach { it.handleEvent(event) }

    /**
     * Add an event handler to this listener.
     *
     * @param handler The event handler to add to this event.
     */
    fun addHandler(handler: FcEventHandler<TEvent>) {
        handlers += handler
    }

    /**
     * Remove an event handler from this listener.
     *
     * @param handler The event handler to remove from this listener.
     */
    fun removeHandler(handler: FcEventHandler<TEvent>) {
        handlers -= handler
    }

    /**
     * Add an event handler to this listener.
     *
     * @param handler The event handler to add to this event.
     */
    operator fun plusAssign(handler: FcEventHandler<TEvent>) = addHandler(handler)

    /**
     * Add an event handler to this listener.
     *
     * @param handler The event handler to add to this event.
     */
    operator fun minusAssign(handler: FcEventHandler<TEvent>) = removeHandler(handler)
}
