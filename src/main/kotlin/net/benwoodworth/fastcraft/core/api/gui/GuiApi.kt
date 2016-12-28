package net.benwoodworth.fastcraft.core.api.gui

import net.benwoodworth.fastcraft.core.api.dependencies.Dependencies

/**
 * An API for creating [Gui]'s
 */
class GuiApi<TItem>(
        /** The plugin dependencies */
        val dependencies: Dependencies<TItem>
)
