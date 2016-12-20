package net.benwoodworth.fastcraft.core.api.dependencies.event.events;

import net.benwoodworth.fastcraft.core.api.dependencies.event.Cancellable;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.ItemGrid;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Event for crafting items.
 *
 * @param <TBase> The base of this event.
 * @param <TItem> The native item used in this event.
 */
public interface FcCraftEvent<TBase, TItem> extends Cancellable {

    /**
     * Get the matrix that was used to craft an item.
     */
    @NotNull
    ItemGrid<FcItem<TItem>> getMatrix(); // TODO Inventory instead of matrix.

    /**
     * The crafting item results.
     */
    @NotNull
    List<FcItem<TItem>> getResults();
}
