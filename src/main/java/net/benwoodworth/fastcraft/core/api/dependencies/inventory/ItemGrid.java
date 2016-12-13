package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;

/**
 * A grid of items.
 *
 * @param <T> The type of item in the grid.
 */
public interface ItemGrid<T> {

    /**
     * The width of the item grid.
     *
     * @return Returns the width of the item grid.
     */
    int getWidth();

    /**
     * The height of the item grid.
     *
     * @return Returns the height of the item grid.
     */
    int getHeight();

    /**
     * Get an item from the item grid.
     *
     * @param x The x-coordinate within the grid, where 0 is the left column.
     * @param y The y-coordinate within the grid, where 0 is the top row.
     */
    @NotNull
    T getItem(int x, int y);
}
