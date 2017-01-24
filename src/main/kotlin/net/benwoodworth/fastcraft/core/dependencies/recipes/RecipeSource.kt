package net.benwoodworth.fastcraft.core.dependencies.recipes

/**
 * A source of recipes. (e.g. from plugins that register custom recipes)
 *
 * @param TItem the native item type
 */
interface RecipeSource<TItem> {

    /**
     * Get this recipe source's crafting recipes.
     *
     * @return the crafting recipes
     */
    fun getCraftingRecipes(): List<FcCustomRecipe<TItem>>
}
