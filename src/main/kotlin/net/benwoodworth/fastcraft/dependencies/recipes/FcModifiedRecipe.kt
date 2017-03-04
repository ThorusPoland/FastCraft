package net.benwoodworth.fastcraft.dependencies.recipes

/**
 * A custom recipe that adds extra functionality to a base recipe.
 *
 * @param TItem the native item type
 */
interface FcModifiedRecipe<TItem> : FcRecipe<TItem> {

    /** The base recipe, overridden by this recipe */
    val baseRecipe: FcRecipe<TItem>
}
