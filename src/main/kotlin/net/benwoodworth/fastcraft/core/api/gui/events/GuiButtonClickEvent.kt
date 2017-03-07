package net.benwoodworth.fastcraft.core.api.gui.events

import net.benwoodworth.fastcraft.core.api.gui.Gui
import net.benwoodworth.fastcraft.core.api.gui.buttons.GuiButton
import net.benwoodworth.fastcraft.core.dependencies.event.Cancellable
import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

/**
 * An event triggered when a [GuiButton] is clicked.
 *
 * @param TFcItem the item type
 */
class GuiButtonClickEvent<TFcItem : FcItem<*>>(
        /** The [Gui] in which the button was clicked. */
        val gui: Gui<TFcItem>,

        /** The [GuiButton] that was clicked. */
        val button: GuiButton<TFcItem>,

        /** The [FcPlayer] who clicked the button. */
        val player: FcPlayer<TFcItem>
) : Cancellable {

    override var cancelled = false
}
