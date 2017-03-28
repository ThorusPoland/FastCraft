package net.benwoodworth.fastcraft.core.api.gui.layouts

import java.util.*

/**
 * The layout of a GUI.
 * Layouts are composite, so they're made up of other layouts.
 *
 * @param TItem The native item type.
 */
abstract class GuiLayout<TItem> {

    /** The layouts that compose this layout. */
    private val innerLayouts = ArrayList<LayoutPosition<TItem>>()

    /** Get the width of this [GuiLayout]. */
    abstract val width: Int

    /** Get the height of this [GuiLayout]. */
    abstract val height: Int

    /**
     * Add an inner layout or button at the specified location.
     *
     * @param layout the layout to add
     */
    fun addLayout(layout: GuiLayout<TItem>, x: Int, y: Int) {
        innerLayouts += LayoutPosition(layout, x, y)

        // Register listeners
        // TODO
    }

    /**
     * Get the layout at a point.
     *
     * @param x the x-coordinate within this layout
     * @param y the y-coordinate within this layout
     * @return the layout at the specified point, and the coordinates
     *         within that layout that these coordinates point to
     */
    private fun layoutAtPoint(x: Int, y: Int): LayoutPosition<TItem> {
        for (layoutPosition in innerLayouts) {
            val xRange = (layoutPosition.x)..(layoutPosition.x + layoutPosition.layout.width)
            val yRange = (layoutPosition.y)..(layoutPosition.y + layoutPosition.layout.height)

            if (x in xRange && y in yRange) {
                val newX = x - layoutPosition.layout.width
                val newY = y - layoutPosition.layout.height
                return layoutPosition.layout.layoutAtPoint(newX, newY)
            }
        }

        // No inner layout at point
        return LayoutPosition(this, x, y)
    }

    /**
     * Contains a layout, and a coordinate pair.
     */
    private class LayoutPosition<TItem>(
            /** The layout. */
            val layout: GuiLayout<TItem>,

            /** The x-coordinate */
            val x: Int,

            /** The y-coordinate */
            val y: Int
    )
}
