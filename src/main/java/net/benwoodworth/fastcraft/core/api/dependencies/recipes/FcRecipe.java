package net.benwoodworth.fastcraft.core.api.dependencies.recipes;

import net.benwoodworth.fastcraft.core.api.dependencies.event.events.FcCraftEvent;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem;
import net.benwoodworth.fastcraft.core.api.dependencies.permissions.Permission;
import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Adapts a recipe from the native implementation.
 *
 * @param <TItem> The native item type used in this recipe.
 */
public abstract class FcRecipe<TItem> {

    @Nullable
    private final FcRecipe<TItem> overriddenRecipe;

    /**
     * Create a new instance of FcRecipe.
     *
     * @param overriddenRecipe The recipe overridden by this recipe.
     */
    public FcRecipe(@Nullable FcRecipe<TItem> overriddenRecipe) {
        this.overriddenRecipe = overriddenRecipe;
    }

    /**
     * Get the recipe overridden by this recipe.
     *
     * @return Returns the overridden recipe, or null if there is none.
     */
    @Nullable
    public FcRecipe<TItem> getOverriddenRecipe() {
        return overriddenRecipe;
    }

    /**
     * Get the ingredients in this recipe.
     */
    @NotNull
    public abstract List<FcItem<TItem>> getIngredients();

    /**
     * Get the results of this recipe.
     */
    @NotNull
    public abstract List<FcItem<TItem>> getResults();

    /**
     * Get the permissions required to craft this recipe.
     */
    @NotNull
    public abstract List<Permission> getPermissions();

    /**
     * Simulate the crafting of this item with this recipe.
     *
     * @return Returns the resulting crafting event.
     */
    @NotNull
    public abstract FcCraftEvent<?, TItem> simulateCraft(@NotNull FcPlayer<TItem> player);

    /**
     * Checks if this recipe is equal to another.
     *
     * @return Returns true if the recipe are equal.
     */
    public abstract boolean equals(@NotNull FcRecipe<TItem> recipe);

    /**
     * Checks if this recipe is equal to an object.
     *
     * @return Always returns false.
     */
    @Override
    public final boolean equals(@Nullable Object other) {
        return false;
    }

    /**
     * Generates a hash code for this recipe.
     */
    @Override
    public final int hashCode() {
        int hash = this.getClass().getCanonicalName().hashCode();

        for (FcItem<TItem> ingredient : getIngredients())
            hash = hash * 7 + ingredient.hashCode();

        for (FcItem<TItem> result : getResults())
            hash = hash * 11 + result.hashCode();

        for (Permission permission : getPermissions())
            hash = hash * 13 + permission.hashCode();

        return hash;
    }
}
