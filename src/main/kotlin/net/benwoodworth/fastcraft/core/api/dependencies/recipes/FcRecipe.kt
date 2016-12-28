package net.benwoodworth.fastcraft.core.api.dependencies.recipes

import net.benwoodworth.fastcraft.core.api.dependencies.event.events.FcCraftEvent
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem
import net.benwoodworth.fastcraft.core.api.dependencies.permissions.Permission
import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayer

/**
 * Adapts a recipe from the native implementation.
 *
 * @param TItem the native item type used in this recipe
 */
abstract class FcRecipe<TItem> {

    /** The ingredients in the recipe. */
    abstract val ingredients: List<FcItem<TItem>>

    /** The results of the recipe. */
    abstract val results: List<FcItem<TItem>>

    /** The permissions required to craft the recipe. */
    abstract val permissions: List<Permission>

    /**
     * Simulate the crafting of this item with this recipe.
     *
     * @param player the [FcPlayer] crafting the recipe
     * @return the resulting crafting event
     */
    abstract fun simulateCraft(player: FcPlayer<TItem>): FcCraftEvent<*, TItem>

    /**
     * Check if this recipe is equal to another.
     *
     * @param recipe the [FcRecipe] to compare to
     * @return `true` if the recipe are equal
     */
    abstract fun equals(recipe: FcRecipe<TItem>): Boolean

    /**
     * Checks if this recipe is equal to an object.
     *
     * @return `false`
     */
    override fun equals(other: Any?) = false

    /**
     * Generates a hash code for this recipe.
     *
     * @return the hash code
     */
    final override fun hashCode(): Int {
        var hash: Int = javaClass.canonicalName.hashCode()

        for (ingredient in ingredients)
            hash = hash * 7 + ingredient.hashCode()

        for (result in results)
            hash = hash * 11 + result.hashCode()

        for (permission in permissions)
            hash = hash * 13 + permission.hashCode()

        return hash
    }
}
