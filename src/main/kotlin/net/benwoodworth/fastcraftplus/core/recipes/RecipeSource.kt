package net.benwoodworth.fastcraftplus.core.recipes

/**
 * A source of recipes.
 */
interface RecipeSource<TRecipe : FcRecipe<*>> {

    /**
     * Get this recipe source's crafting recipes.
     */
    fun getCraftingRecipes(): Array<TRecipe>
}
