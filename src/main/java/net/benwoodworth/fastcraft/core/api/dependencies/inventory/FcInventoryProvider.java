package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Provides inventories and items for the plugin.
 *
 * @param <TItem> The native item type.
 */
public interface FcInventoryProvider<TItem> {

    /**
     * Create a new item.
     */
    @NotNull
    FcItemMutable<TItem> createItem(@NotNull String type, int amount);

    /**
     * Create a new grid inventory.
     *
     * @param height The height of the inventory.
     * @param title The title of the inventory.
     * @param carrier The carrier of the inventory.
     * @return A chest inventory with the specified height and title.
     */
    @NotNull
    FcInventory<TItem> createInventory(int height, @Nullable String title, @Nullable Object carrier);
}
