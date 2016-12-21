package net.benwoodworth.fastcraft.core.api.dependencies.recipes;

import org.jetbrains.annotations.NotNull;

/**
 * A custom recipe that adds extra functionality to a base recipe.
 *
 * @param <TItem> the native item type
 */
public abstract class FcCustomRecipe<TItem> extends FcRecipe<TItem> {

    @NotNull
    private final FcRecipe<TItem> baseRecipe;

    /**
     * Create a new instance of FcRecipe.
     *
     * @param baseRecipe the base recipe, overridden by this recipe
     */
    public FcCustomRecipe(@NotNull FcRecipe<TItem> baseRecipe) {
        this.baseRecipe = baseRecipe;
    }

    /**
     * Get the base recipe, overridden by this recipe.
     *
     * @return the base recipe, or null if there is none
     */
    @NotNull
    public FcRecipe<TItem> getOverriddenRecipe() {
        return baseRecipe;
    }
}
