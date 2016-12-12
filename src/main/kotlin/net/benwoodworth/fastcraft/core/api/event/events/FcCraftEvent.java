package net.benwoodworth.fastcraft.core.api.event.events;

import net.benwoodworth.fastcraft.core.api.event.FcEvent;
import net.benwoodworth.fastcraft.core.api.inventory.FcItem;
import net.benwoodworth.fastcraft.core.api.inventory.ItemGrid;

import java.util.List;

/**
 * Event for crafting items.
 */
public interface FcCraftEvent<TBase, TFcItem extends FcItem<?>> extends FcEvent<TBase> {

    /**
     * The inventory that was used to craft an item.
     */
    ItemGrid<TFcItem> getMatrix();

    /**
     * The crafting item results.
     */
    List<TFcItem> getResults();
}
