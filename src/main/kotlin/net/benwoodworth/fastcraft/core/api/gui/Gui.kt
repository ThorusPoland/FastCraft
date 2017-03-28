package net.benwoodworth.fastcraft.core.api.gui

import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcChestInventory
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * A user interface for in-game players.
 *
 * @param TFcItem the item type
 */
class Gui<TFcItem : FcItem<*>>(
        private val inventory: FcChestInventory<TFcItem>
) : GuiLayout<TFcItem>(inventory.width, inventory.height) {

    /**
     * Update the inventory to reflect the GUI.
     */
    private fun updateInventory() {
        for (x in 0 until width) {
            for (y in 0 until height) {
                inventory.setItem(x, y, getButton(x, y)?.buttonItem)
            }
        }
    }
}
