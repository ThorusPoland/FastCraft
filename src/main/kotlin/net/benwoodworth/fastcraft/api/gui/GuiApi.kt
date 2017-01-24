package net.benwoodworth.fastcraft.api.gui

import net.benwoodworth.fastcraft.core.dependencies.Dependencies

/**
 * An API for creating [Gui]'s
 */
class GuiApi<TItem>(
        /** The plugin dependencies */
        val dependencies: Dependencies<TItem>
)
