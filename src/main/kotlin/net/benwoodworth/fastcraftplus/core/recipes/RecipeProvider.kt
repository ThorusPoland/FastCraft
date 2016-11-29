package net.benwoodworth.fastcraftplus.core.recipes

import kotlin.collections.MutableList

/**
 * Provides recipes from the server.
 */
abstract class RecipeProvider<TRecipe : FcRecipe<*>> {

    /**
     * Get recipe sources.
     */
    abstract fun getRecipeSources(): Array<RecipeSource<TRecipe>>

    /**
     * Get recipes on the server.
     */
    fun getServerCraftingRecipes(): List<TRecipe> {
        val recipes = arrayListOf<TRecipe>()

        getRecipeSources().forEach {
            recipes.addAll(it.getCraftingRecipes())
        }

        return recipes.toList()
    }
}
