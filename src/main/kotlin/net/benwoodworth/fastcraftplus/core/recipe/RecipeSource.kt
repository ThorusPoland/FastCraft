package net.benwoodworth.fastcraftplus.core.recipe

/**
 * A source of recipe.
 */
interface RecipeSource<TRecipe : FcRecipe<*>> {

    /**
     * Get this recipe source's crafting recipe.
     */
    fun getCraftingRecipes(): Array<TRecipe>
}
