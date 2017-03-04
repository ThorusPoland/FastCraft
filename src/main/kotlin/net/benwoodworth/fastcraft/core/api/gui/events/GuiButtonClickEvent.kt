package net.benwoodworth.fastcraft.core.api.gui.events

import net.benwoodworth.fastcraft.dependencies.event.Cancellable
import net.benwoodworth.fastcraft.dependencies.player.FcPlayer
import net.benwoodworth.fastcraft.core.api.gui.Gui
import net.benwoodworth.fastcraft.core.api.gui.buttons.GuiButton

/**
 * An event triggered when a [GuiButton] is clicked.
 *
 * @param TItem the native item type
 * @param TInventory the native inventory type
 */
class GuiButtonClickEvent<TItem, TInventory>(
        /** The [Gui] in which the button was clicked. */
        val gui: Gui<TItem, TInventory>,

        /** The [GuiButton] that was clicked. */
        val button: GuiButton<TItem, TInventory>,

        /** The [FcPlayer] who clicked the button. */
        val player: FcPlayer<TItem>
) : Cancellable {

    override var cancelled = false
}
