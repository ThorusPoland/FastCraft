package net.benwoodworth.fastcraft.core.api.dependencies.recipes

/**
 * A custom recipe that adds extra functionality to a base recipe.
 *
 * @param TItem the native item type
 */
abstract class FcCustomRecipe<TItem>(
        /** The base recipe, overridden by this recipe */
        val overriddenRecipe: FcRecipe<TItem>
) : FcRecipe<TItem>()
