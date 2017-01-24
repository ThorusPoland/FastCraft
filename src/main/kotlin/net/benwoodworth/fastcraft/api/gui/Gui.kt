package net.benwoodworth.fastcraft.api.gui

import net.benwoodworth.fastcraft.core.dependencies.inventory.FcInventory
import net.benwoodworth.fastcraft.api.gui.layouts.GuiLayout

/**
 * A user interface for
 *
 * @param TItem
 */
class Gui<TItem>(
        /** The [GuiApi]. */
        val guiApi: GuiApi<TItem>,

        /** The containing inventory. */
        val inventory: FcInventory<TItem>
) : GuiLayout<TItem>() {

    /** TODO */
    override val width: Int
        get() = throw UnsupportedOperationException()

    /** TODO */
    override val height: Int
        get() = throw UnsupportedOperationException()

    // TODO
}
