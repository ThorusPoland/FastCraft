package net.benwoodworth.fastcraft.platform.gui

import net.benwoodworth.fastcraft.platform.player.FcPlayer

/**
 * A user interface for in-game players.
 */
interface FcGui {

    /**
     * A listener for the inventory closing.
     */
    val closeListener: FcListener<GuiEventClose>

    /**
     * Open this [FcGui] for the given players.
     *
     * @param players the players to open the inventory for.
     */
    fun open(vararg players: FcPlayer)

    /**
     * Get the players viewing the inventory.
     *
     * @return the players viewing the inventory.
     */
    fun getViewers(): List<FcPlayer>
}