package net.benwoodworth.fastcraft.core.api.dependencies.recipes;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Provides recipe from the server.
 *
 * @param <TItem> The native item type.
 */
public interface FcRecipeService<TItem> {

    /**
     * Get recipe sources.
     */
    @NotNull
    List<RecipeSource<TItem>> getRecipeSources();

    /**
     * Get the recipes provided by the native server.
     */
    @NotNull
    List<FcRecipe<TItem>> getServerCraftingRecipes();
}
