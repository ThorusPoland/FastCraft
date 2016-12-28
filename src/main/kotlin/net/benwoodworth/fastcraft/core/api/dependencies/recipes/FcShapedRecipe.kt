package net.benwoodworth.fastcraft.core.api.dependencies.recipes

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.ItemGrid

/**
 * A shaped recipe.
 *
 * @param TItem the native item type
 */
abstract class FcShapedRecipe<TItem> : FcRecipe<TItem>() {

    /** The recipe's shape. */
    abstract val recipeShape: ItemGrid<FcItem<TItem>>
}
