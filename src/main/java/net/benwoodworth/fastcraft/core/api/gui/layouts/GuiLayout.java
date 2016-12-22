package net.benwoodworth.fastcraft.core.api.gui.layouts;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * The layout of a GUI.
 * Layouts are composite, so they're made up of other layouts.
 *
 * @param <TItem> The native item type.
 */
public abstract class GuiLayout<TItem> {

    @NotNull
    private List<LayoutCoordinate> innerLayouts = new ArrayList<>();

    /**
     * Get the width of this {@link GuiLayout}.
     *
     * @return the width of this {@link GuiLayout}
     */
    public abstract int getWidth();

    /**
     * Get the height of this {@link GuiLayout}.
     *
     * @return the height of this {@link GuiLayout}
     */
    public abstract int getHeight();

    /**
     * Add an inner layout or button at the specified location.
     *
     * @param layout the layout to add
     */
    public final void addLayout(@NotNull GuiLayout<TItem> layout, int x, int y) {
        innerLayouts.add(new LayoutCoordinate(layout, x, y));

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
    @NotNull
    public final LayoutCoordinate layoutAtPoint(int x, int y) {
        for (LayoutCoordinate layoutCoord : innerLayouts) {
            if (x >= layoutCoord.x && y >= layoutCoord.y
                    && x < layoutCoord.x + layoutCoord.layout.getWidth()
                    && x < layoutCoord.y + layoutCoord.layout.getHeight()) {

                // If (x, y) is within this inner layout...
                int newX = x - layoutCoord.layout.getWidth();
                int newY = y - layoutCoord.layout.getHeight();
                return layoutCoord.layout.layoutAtPoint(newX, newY);
            }
        }

        // No inner layout at point
        return new LayoutCoordinate(this, x, y);
    }

    /**
     * Contains a layout, and a coordinate pair.
     */
    public class LayoutCoordinate {
        @NotNull
        final GuiLayout<TItem> layout;
        final int x, y;

        LayoutCoordinate(@NotNull GuiLayout<TItem> layout, int x, int y) {
            this.layout = layout;
            this.x = x;
            this.y = y;
        }
    }
}
