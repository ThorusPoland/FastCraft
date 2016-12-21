package net.benwoodworth.fastcraft.core.api.dependencies.recipes;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Provides recipe from the server.
 *
 * @param <TItem> the native item type
 */
public interface FcRecipeService<TItem> {

    /**
     * Get recipe sources.
     *
     * @return the recipe sources
     */
    @NotNull
    List<RecipeSource<TItem>> getRecipeSources();

    /**
     * Get the recipes provided by the native server.
     *
     * @return the server crafting recipes
     */
    @NotNull
    List<FcRecipe<TItem>> getServerCraftingRecipes();
}
