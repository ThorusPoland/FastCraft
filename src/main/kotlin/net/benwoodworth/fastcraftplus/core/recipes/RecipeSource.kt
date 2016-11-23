package net.benwoodworth.fastcraftplus.core.recipes

/**
 * A source of recipes.
 */
interface RecipeSource<TItem> {

    fun getCraftingRecipes(): Array<RecipeAdapter<TItem>>
}
