package net.benwoodworth.fastcraftplus.core.inventory

import net.benwoodworth.fastcraftplus.core.players.FcPlayer

/**
 * Adapts items so they can be used by the plugin.
 */
interface FcInventory<TItem> {
    /**
     * The number of slots in the inventory.
     */
    abstract val size: Int
        get

    /**
     * The title of the inventory.
     */
    abstract val title: String?
        get

    /**
     * The contents of the inventory.
     */
    abstract val contents: Array<FcItem<TItem>>
        get

    abstract val holder: FcPlayer
        get

    /**
     * The players viewing the inventory.
     */
    abstract val viewers: List<FcPlayer>
        get
}
