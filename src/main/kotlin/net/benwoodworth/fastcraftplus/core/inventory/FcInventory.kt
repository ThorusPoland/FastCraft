package net.benwoodworth.fastcraftplus.core.inventory

import net.benwoodworth.fastcraftplus.core.players.FcPlayer

/**
 * Adapts items so they can be used by the plugin.
 */
interface FcInventory<TItem : FcItem<*>> {

    /**
     * The number of slots in the inventory.
     */
    val size: Int

    /**
     * The title of the inventory.
     */
    val title: String?

    /**
     * The players viewing the inventory.
     */
    val viewers: List<FcPlayer>
}
