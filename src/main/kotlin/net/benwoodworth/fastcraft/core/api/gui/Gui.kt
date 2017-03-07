package net.benwoodworth.fastcraft.core.api.gui

import net.benwoodworth.fastcraft.core.FastCraft
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout

/**
 * A user interface for in-game players.
 *
 * @param fastCraft an instance of FastCraft
 * @param height the height of the GUI
 * @param title the inventory title
 * @param TFcItem the item type
 */
class Gui<TFcItem>(
        fastCraft: FastCraft<TFcItem>,
        height: Int,
        title: String? = null
) : GuiLayout<TFcItem>() {

    /** The inventory containing this GUI. */


    /** TODO */
    override val width: Int
        get() = throw UnsupportedOperationException()

    /** TODO */
    override val height: Int
        get() = throw UnsupportedOperationException()

    // TODO
}
