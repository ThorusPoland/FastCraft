package net.benwoodworth.fastcraftplus.core.events

/**
 * Adapts an event from a native implementation.
 *
 * @param TBase The base event of this event.
 */
interface FcEvent<TBase> {
    /**
     * The base of this event.
     */
    val base: TBase

    /**
     * Whether this event has been cancelled.
     */
    var cancelled: Boolean

    /**
     * Raise the base event.
     */
    fun raise()
}
