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
) : GuiLayout<TFcItem>() {

    

    override val width: Int
        get() = inventory.width

    override val height: Int
        get() = inventory.height
}
