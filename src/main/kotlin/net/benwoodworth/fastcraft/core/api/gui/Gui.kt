package net.benwoodworth.fastcraft.core.api.gui

import net.benwoodworth.fastcraft.core.FastCraft
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout

/**
 * A user interface for in-game players.
 *
 * @param fastCraft an instance of FastCraft
 * @param height the height of the GUI
 * @param title the inventory title
 * @param TItem the native item type
 * @param TInventory the native inventory type
 */
class Gui<TItem, TInventory>(
        fastCraft: FastCraft<TItem, TInventory>,
        height: Int,
        title: String? = null
) : GuiLayout<TItem>() {

    /** The inventory containing this GUI. */
    private val inventory = fastCraft.dependencies.inventoryProvider.createChestInventory(height, title, this)

    /** TODO */
    override val width: Int
        get() = throw UnsupportedOperationException()

    /** TODO */
    override val height: Int
        get() = throw UnsupportedOperationException()

    // TODO
}
