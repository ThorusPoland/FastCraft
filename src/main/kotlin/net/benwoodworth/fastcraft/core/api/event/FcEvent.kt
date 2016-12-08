package net.benwoodworth.fastcraft.core.api.event

/**
 * Adapts an event from a native implementation.
 *
 * @param TBase The base event from the server platform.
 */
interface FcEvent<out TBase> {
    /**
     * The base of this event.
     */
    val baseEvent: TBase

    /**
     * Whether this event has been cancelled.
     */
    var cancelled: Boolean

    /**
     * Raise the base event.
     */
    fun raise()
}
