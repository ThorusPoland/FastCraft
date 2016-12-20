package net.benwoodworth.fastcraft.core.api.dependencies;

import net.benwoodworth.fastcraft.core.api.dependencies.config.FcConfigProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcInventoryProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.permissions.FcPermissionService;
import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayerProvider;
import net.benwoodworth.fastcraft.core.api.dependencies.recipes.FcRecipeService;
import org.jetbrains.annotations.NotNull;

/**
 * An API other plugins can use to interface with FastCraft+.
 *
 * @param <TItem> The native item type.
 */
public class Dependencies<TItem> {
    @NotNull
    private final FcInventoryProvider<TItem> inventoryProvider;
    @NotNull
    private final FcPlayerProvider<TItem> playerProvider;
    @NotNull
    private final FcRecipeService<TItem> recipeService;
    @NotNull
    private final FcPermissionService permissionService;
    @NotNull
    private final FcConfigProvider configProvider;
    @NotNull
    private final FcTaskScheduler taskScheduler;

    public Dependencies(@NotNull FcInventoryProvider<TItem> inventoryProvider,
                        @NotNull FcPlayerProvider<TItem> playerProvider,
                        @NotNull FcRecipeService<TItem> recipeService,
                        @NotNull FcPermissionService permissionService,
                        @NotNull FcConfigProvider configProvider,
                        @NotNull FcTaskScheduler taskScheduler) {

        this.inventoryProvider = inventoryProvider;
        this.playerProvider = playerProvider;
        this.recipeService = recipeService;
        this.permissionService = permissionService;
        this.configProvider = configProvider;
        this.taskScheduler = taskScheduler;
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
    public FcRecipeService<TItem> getRecipeService() {
        return recipeService;
    }

    @NotNull
    public FcPermissionService getPermissionService() {
        return permissionService;
    }

    @NotNull
    public FcConfigProvider getConfigProvider() {
        return configProvider;
    }

    @NotNull
    public FcTaskScheduler getTaskScheduler() {
        return taskScheduler;
    }
}
