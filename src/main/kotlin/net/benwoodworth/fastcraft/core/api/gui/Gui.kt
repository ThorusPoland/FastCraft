package net.benwoodworth.fastcraft.core.api.gui

import net.benwoodworth.fastcraft.core.FastCraft
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout

/**
 * A user interface for in-game players.
 *
 * @param TFcItem the item type
 */
abstract class Gui<TFcItem> : GuiLayout<TFcItem>() {

    /** TODO */
    override val width: Int
        get() = throw UnsupportedOperationException()

    /** TODO */
    override val height: Int
        get() = throw UnsupportedOperationException()
}
