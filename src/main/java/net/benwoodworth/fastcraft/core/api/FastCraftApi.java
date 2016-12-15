package net.benwoodworth.fastcraft.core.api;

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcInventoryProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.permissions.FcPermissionService;
import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayerProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.recipes.FcRecipeService;
import net.benwoodworth.fastcraft.core.api.gui.GuiApi;
import org.jetbrains.annotations.NotNull;

/**
 * An API other plugins can use to interface with FastCraft+.
 *
 * @param <TItem> The native item type.
 */
public class FastCraftApi<TItem> {
    private final FcInventoryProvider<TItem> inventoryProvider;
    private final FcPlayerProvider<TItem> playerProvider;
    private final FcRecipeService<TItem> recipeProvider;
    private final FcPermissionService permissionRegistry;

    private final GuiApi<TItem> guiApi;

    public FastCraftApi(FcInventoryProvider<TItem> inventoryProvider,
                        FcPlayerProvider<TItem> playerProvider,
                        FcRecipeService<TItem> recipeProvider,
                        FcPermissionService permissionRegistry) {

        this.inventoryProvider = inventoryProvider;
        this.playerProvider = playerProvider;
        this.recipeProvider = recipeProvider;
        this.permissionRegistry = permissionRegistry;

        guiApi = new GuiApi<>(this);
    }

    @NotNull
    public FcInventoryProvider<TItem> getInventoryProvider() {
        return inventoryProvider;
    }

    @NotNull
    public FcPlayerProvider<TItem> getPlayerProvider() {
        return playerProvider;
    }

    @NotNull
    public FcRecipeService<TItem> getRecipeProvider() {
        return recipeProvider;
    }

    @NotNull
    public FcPermissionService getPermissionRegistry() {
        return permissionRegistry;
    }

    @NotNull
    public GuiApi<TItem> getGuiApi() {
        return guiApi;
    }
}
