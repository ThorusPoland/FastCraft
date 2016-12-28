package net.benwoodworth.fastcraft.core.api.gui.buttons

import net.benwoodworth.fastcraft.core.api.dependencies.event.EventListener
import net.benwoodworth.fastcraft.core.api.gui.events.GuiButtonClickEvent
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout

/**
 * A button in a GUI.
 *
 * @param TItem the native item type
 */
class GuiButton<TItem> : GuiLayout<TItem>() {

    /** This button's click listener */
    val clickListener = EventListener<GuiButtonClickEvent<TItem>>()

    /** The width of this button. (`1`) */
    override val width = 1

    /** The height of this button. (`1`) */
    override val height = 1
}
