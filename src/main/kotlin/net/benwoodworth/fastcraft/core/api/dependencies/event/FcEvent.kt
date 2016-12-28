package net.benwoodworth.fastcraft.core.api.dependencies.event

/**
 * Adapts an event from a native implementation.
 *
 * @param TBase the base event being adapted
 */
interface FcEvent<out TBase> {

    /** The base of this event. */
    val baseEvent: TBase

    /** Raise the base event. */
    fun raise()
}
