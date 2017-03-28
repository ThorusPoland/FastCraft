package net.benwoodworth.fastcraft.core.api.gui.buttons

import net.benwoodworth.fastcraft.core.api.gui.events.EventGuiButtonClick
import net.benwoodworth.fastcraft.core.api.gui.layouts.GuiLayout
import net.benwoodworth.fastcraft.core.dependencies.event.EventListener
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * A button in a GUI.
 *
 * @param TFcItem the item type
 */
class GuiButton<TFcItem : FcItem<*>>(

        /** The item representing this button */
        val buttonItem: TFcItem? = null
) : GuiLayout<TFcItem>(1, 1) {

    /** This button's click listener */
    val clickListener = EventListener<EventGuiButtonClick<TFcItem>>()
}
