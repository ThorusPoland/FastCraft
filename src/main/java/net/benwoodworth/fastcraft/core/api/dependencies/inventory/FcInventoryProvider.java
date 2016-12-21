package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Provides inventories and items for the plugin.
 *
 * @param <TItem> the native item type
 */
public interface FcInventoryProvider<TItem> {

    /**
     * Create a new empty item.
     *
     * @return a new empty item
     */
    @NotNull
    FcItemMutable<TItem> createItem();

    /**
     * Create a new grid inventory.
     *
     * @param height the height of the inventory
     * @param title the title of the inventory
     * @param carrier the carrier of the inventory
     * @return a chest inventory with the specified height and title
     */
    @NotNull
    FcInventory<TItem> createInventory(int height,
                                       @Nullable String title,
                                       @Nullable Object carrier);
}
