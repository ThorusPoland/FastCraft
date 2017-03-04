package net.benwoodworth.fastcraft.dependencies.recipes

/**
 * Provides recipe from the server.
 *
 * @param TItem the native item type
 */
interface RecipeService<TItem> {

    /**
     * Get recipe sources.
     *
     * @return the recipe sources
     */
    fun getRecipeSources(): List<RecipeSource<TItem>>

    /**
     * Get the recipes provided by the native server.
     *
     * @return the server crafting recipes
     */
    fun getServerCraftingRecipes(): List<FcRecipe<TItem>>
}
