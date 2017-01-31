package net.benwoodworth.fastcraft.core.api.gui.layouts;

/**
 * The layout of a GUI.
 * Layouts are composite, so they're made up of other layouts.
 *
 * @param TItem the native item type
 */
class GuiLayoutBasic<TItem>(
        /** The width of the layout */
        override val width: Int,

        /** The height of the layout */
        override val height: Int
) : GuiLayout<TItem>()
