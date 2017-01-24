package net.benwoodworth.fastcraft.core.dependencies.event

import net.benwoodworth.fastcraft.core.dependencies.event.events.FcItemCraftEvent
import net.benwoodworth.fastcraft.core.dependencies.event.events.FcPlayerJoinEvent

/**
 * Provides listeners to server events.
 *
 * @param TItem the native item type
 * @param TPlayer the native player type
 */
interface FcEventListeners<TItem, TPlayer> {

    /** An event listener for players joining the server. */
    val playerJoin: FcPlayerJoinEvent<TItem>

    /** An event listener for items being crafted. */
    val itemCraft: FcItemCraftEvent<TItem>
}
