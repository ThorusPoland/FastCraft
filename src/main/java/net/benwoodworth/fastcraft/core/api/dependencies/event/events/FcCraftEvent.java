package net.benwoodworth.fastcraft.core.api.dependencies.event.events;

import net.benwoodworth.fastcraft.core.api.dependencies.event.Cancellable;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.ItemGrid;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Event for crafting items.
 *
 * @param <TBase> the base of this event
 * @param <TItem> the native item used in this event
 */
public interface FcCraftEvent<TBase, TItem> extends Cancellable {

    /**
     * Get the matrix that was used to craft an item.
     *
     * @return the crafting matrix
     */
    @NotNull
    ItemGrid<FcItem<TItem>> getMatrix(); // TODO Inventory instead of matrix.

    /**
     * The crafting item results.
     *
     * @return the crafting results
     */
    @NotNull
    List<FcItem<TItem>> getResults();
}
