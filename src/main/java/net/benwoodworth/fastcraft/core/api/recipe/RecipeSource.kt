package net.benwoodworth.fastcraft.core.api.recipe

/**
 * A source of recipes. (Bukkit, Sponge, plugins, etc.)
 */
interface RecipeSource<TRecipe : FcRecipe<*>> {

    /**
     * Get this recipe source's crafting recipe.
     */
    fun getCraftingRecipes(): Array<TRecipe>
}
