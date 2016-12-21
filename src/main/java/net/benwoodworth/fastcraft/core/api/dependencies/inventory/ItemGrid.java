package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;

/**
 * A grid of items.
 *
 * @param <T> the type of item in the grid
 */
public interface ItemGrid<T> {

    /**
     * The width of the item grid.
     *
     * @return the width of the item grid
     */
    int getWidth();

    /**
     * The height of the item grid.
     *
     * @return the height of the item grid
     */
    int getHeight();

    /**
     * Get an item from the item grid.
     *
     * @param x the x-coordinate within the grid, where 0 is the left column
     * @param y the y-coordinate within the grid, where 0 is the top row
     * @return the item at the specified coordinates
     */
    @NotNull
    T getItem(int x, int y);
}
