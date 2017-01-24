package net.benwoodworth.fastcraft.core.dependencies.recipes

import net.benwoodworth.fastcraft.core.dependencies.player.FcPlayer

/**
 * An event allowing other plugins to prepare/modify a crafting recipe.
 *
 * @param TItem the native item type
 */
interface FcPrepareRecipeEvent<TItem> {

    /** The player crafting the item. */
    val player: FcPlayer<TItem>

    /** The recipe being prepared. */
    val recipe: FcRecipe<TItem>

    /** The prepared recipe. */
    val preparedRecipe: FcRecipe<TItem>
}
