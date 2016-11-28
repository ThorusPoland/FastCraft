package net.benwoodworth.fastcraftplus.core.recipes

import kotlin.collections.MutableList

/**
 * Provides recipes from the server.
 */
abstract class RecipeProvider<TItem> {

    /**
     * Get recipe sources.
     */
    abstract fun getRecipeSources(): Array<RecipeSource<TItem>>

    /**
     * Get recipes on the server.
     */
    fun getServerCraftingRecipes(): Array<RecipeAdapter<TItem>> {
        val recipes = arrayListOf<RecipeAdapter<TItem>>()

        getRecipeSources().forEach {
            recipes.addAll(it.getCraftingRecipes())
        }

        return recipes.toTypedArray()
    }
}
