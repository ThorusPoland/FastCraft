package net.benwoodworth.fastcraft.core.dependencies.recipes

import net.benwoodworth.fastcraft.core.dependencies.inventory.FcItem

/**
 * A custom recipe that adds extra functionality to a base recipe.
 *
 * @param TFcItem the item type
 */
interface FcModifiedRecipe<TFcItem : FcItem<*>> : FcRecipe<TFcItem> {

    /** The base recipe, overridden by this recipe */
    val baseRecipe: FcRecipe<TFcItem>
}
