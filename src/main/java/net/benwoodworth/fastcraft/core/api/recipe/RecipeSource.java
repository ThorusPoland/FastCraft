package net.benwoodworth.fastcraft.core.api.recipe;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A source of recipes. (Bukkit, Sponge, plugins, etc.)
 *
 * @param <TItem> The native item type.
 */
public interface RecipeSource<TItem> {

    /**
     * Get this recipe source's crafting recipe.
     */
    @NotNull
    List<FcRecipe<TItem>> getCraftingRecipes();
}
