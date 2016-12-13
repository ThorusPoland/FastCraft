package net.benwoodworth.fastcraft.core.api.recipe;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides recipe from the server.
 *
 * @param <TItem> The native item type.
 */
public abstract class RecipeProvider<TItem> {

    /**
     * Get recipe sources.
     */
    @NotNull
    abstract List<RecipeSource<TItem>> getRecipeSources();

    /**
     * Get recipe on the server.
     */
    @NotNull
    public List<FcRecipe<TItem>> getServerCraftingRecipes() {
        List<FcRecipe<TItem>> recipes = new ArrayList<>();
        getRecipeSources().forEach(source ->
                recipes.addAll(source.getCraftingRecipes())
        );
        return recipes;
    }
}
