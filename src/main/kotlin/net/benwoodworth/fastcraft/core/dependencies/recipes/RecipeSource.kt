package net.benwoodworth.fastcraft.core.dependencies.recipes

import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * A source of recipes. (e.g. from plugins that register custom recipes)
 *
 * @param TFcItem the item type
 */
interface RecipeSource<TFcItem : FcItem<*>> {

    /**
     * Get this recipe source's crafting recipes.
     *
     * @return the crafting recipes
     */
    fun getCraftingRecipes(): List<FcModifiedRecipe<TFcItem>>
}
