package net.benwoodworth.fastcraftplus.core.recipes

/**
 * A source of recipes.
 */
interface RecipeSource<TRecipe : FcRecipe<*>> {

    fun getCraftingRecipes(): Array<TRecipe>
}
