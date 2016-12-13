package net.benwoodworth.fastcraft.core.api;

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcInventoryProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.permission.FcPermissionRegistrar;
import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayerProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.recipe.FcRecipeProvider;
import net.benwoodworth.fastcraft.core.api.gui.GuiApi;

/**
 * An API other plugins can use to interface with FastCraft+.
 *
 * @param <TItem> The native item type.
 */
public class FastCraftApi<TItem> {

    public final FcInventoryProvider<TItem> inventoryProvider;
    public final FcPlayerProvider<TItem> playerProvider;
    public final FcRecipeProvider<TItem> recipeProvider;
    public final FcPermissionRegistrar permissionRegistrar;

    public final GuiApi<TItem> guiApi;

    public FastCraftApi(FcInventoryProvider<TItem> inventoryProvider,
                        FcPlayerProvider<TItem> playerProvider,
                        FcRecipeProvider<TItem> recipeProvider,
                        FcPermissionRegistrar permissionRegistrar) {

        this.inventoryProvider = inventoryProvider;
        this.playerProvider = playerProvider;
        this.recipeProvider = recipeProvider;
        this.permissionRegistrar = permissionRegistrar;

        guiApi = new GuiApi<TItem>(this);
    }
}
