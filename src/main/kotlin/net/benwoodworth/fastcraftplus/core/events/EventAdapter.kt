package net.benwoodworth.fastcraftplus.core.events

/**
 * Adapts an event from a native implementation.
 *
 * @param TBase The base event of this event.
 */
interface EventAdapter<TBase> {
    /**
     * The base of this event.
     */
    val base: TBase
        get

    /**
     * Whether this event has been cancelled.
     */
    var cancelled: Boolean
        get
        set

    /**
     * Raise the base event.
     */
    fun raise()
}
