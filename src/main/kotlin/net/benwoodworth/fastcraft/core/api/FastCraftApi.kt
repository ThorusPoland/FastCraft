package net.benwoodworth.fastcraft.core.api

import net.benwoodworth.fastcraft.core.FastCraft
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem
import javax.inject.Inject

/**
 * A FastCraft API for use by other plugins.
 *
 * @param TFcItem the item type
 */
class FastCraftApi<TFcItem : FcItem<*>> @Inject constructor(
        /** The instance of FastCraft. */
        val fastCraft: FastCraft<TFcItem>
) {

//    /** TODO
//     * Checks to see if an inventory is a GUI.
//     *
//     * @param inventory the inventory to check
//     * @return `true` if the inventory is a GUI
//     */
//    fun isGuiInventory(inventory: TInventory): Boolean {
//        val fcInv = fastCraft.dependencies.inventoryProvider.adaptInventory(inventory)
//        val carrier = fcInv.carrier
//        return carrier is Gui<*, *>
//    }
}
