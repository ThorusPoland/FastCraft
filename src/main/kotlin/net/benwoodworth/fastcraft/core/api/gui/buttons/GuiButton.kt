package net.benwoodworth.fastcraft.core.api.gui.buttons

import net.benwoodworth.fastcraft.core.api.gui.events.GuiButtonClickEvent
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout
import net.benwoodworth.fastcraft.core.dependencies.event.EventListener
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * A button in a GUI.
 *
 * @param TFcItem the item type
 */
class GuiButton<TFcItem: FcItem<*>> : GuiLayout<TFcItem>() {

    /** This button's click listener */
    val clickListener = EventListener<GuiButtonClickEvent<TFcItem>>()

    /** The width of this button. (`1`) */
    override val width = 1

    /** The height of this button. (`1`) */
    override val height = 1
}
