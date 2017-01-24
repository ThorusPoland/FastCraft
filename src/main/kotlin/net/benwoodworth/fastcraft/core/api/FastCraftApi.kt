package net.benwoodworth.fastcraft.core.api

import net.benwoodworth.fastcraft.core.FastCraft
import net.benwoodworth.fastcraft.core.api.gui.Gui

/**
 * A FastCraft API for use by other plugins.
 *
 * @param TItem the native item type
 * @param TInventory the native inventory type
 */
class FastCraftApi<TItem, in TInventory>(
        /** The instance of FastCraft. */
        val fastCraft: FastCraft<TItem, TInventory>
) {

    /**
     * Checks to see if an inventory is a GUI.
     *
     * @param inventory the inventory to check
     * @return `true` if the inventory is a GUI
     */
    fun isGuiInventory(inventory: TInventory): Boolean {
        val fcInv = fastCraft.dependencies.inventoryProvider.adaptInventory(inventory)
        val carrier = fcInv.carrier
        return carrier is Gui<*, *>
    }
}
