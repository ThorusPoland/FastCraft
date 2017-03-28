package net.benwoodworth.fastcraft.core.dependencies.player

import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * An event for players joining the server.
 *
 * @param TFcItem the item type
 */
interface EventPlayerJoin<TFcItem : FcItem<*>> {

    /** The player who joined. */
    val player: FcPlayer<TFcItem>
}
