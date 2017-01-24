package net.benwoodworth.fastcraft.api.gui.layouts

import java.util.*

/**
 * The layout of a GUI.
 * Layouts are composite, so they're made up of other layouts.
 *
 * @param TItem The native item type.
 */
abstract class GuiLayout<TItem> {

    /** The layouts that compose this layout. */
    private val innerLayouts = ArrayList<LayoutCoordinate<TItem>>()

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
        innerLayouts += LayoutCoordinate(layout, x, y)

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
    private fun layoutAtPoint(x: Int, y: Int): LayoutCoordinate<TItem> {
        for (layoutCoord in innerLayouts) {
            val xRange = (layoutCoord.x)..(layoutCoord.x + layoutCoord.layout.width)
            val yRange = (layoutCoord.y)..(layoutCoord.y + layoutCoord.layout.height)

            if (x in xRange && y in yRange) {
                val newX = x - layoutCoord.layout.width
                val newY = y - layoutCoord.layout.height
                return layoutCoord.layout.layoutAtPoint(newX, newY)
            }
        }

        // No inner layout at point
        return LayoutCoordinate(this, x, y)
    }

    /**
     * Contains a layout, and a coordinate pair.
     */
    private class LayoutCoordinate<TItem>(
            /** The layout. */
            val layout: GuiLayout<TItem>,

            /** The x-coordinate */
            val x: Int,

            /** The y-coordinate */
            val y: Int
    )
}
