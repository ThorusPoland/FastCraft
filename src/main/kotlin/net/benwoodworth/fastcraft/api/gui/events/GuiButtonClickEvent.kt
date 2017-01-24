package net.benwoodworth.fastcraft.api.gui.events

import net.benwoodworth.fastcraft.core.dependencies.event.Cancellable
import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer
import net.benwoodworth.fastcraft.api.gui.Gui
import net.benwoodworth.fastcraft.api.gui.buttons.GuiButton

/**
 * An event triggered when a [GuiButton] is clicked.
 *
 * @param TItem the native item type
 */
class GuiButtonClickEvent<TItem>(
        /** The [Gui] in which the button was clicked. */
        val gui: Gui<TItem>,

        /** The [GuiButton] that was clicked. */
        val button: GuiButton<TItem>,

        /** The [FcPlayer] who clicked the button. */
        val player: FcPlayer<TItem>
) : Cancellable {

    override var cancelled = false
}
