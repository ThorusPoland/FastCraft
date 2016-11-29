package net.benwoodworth.fastcraftplus.core.recipes

import net.benwoodworth.fastcraftplus.core.inventory.FcItem
import net.benwoodworth.fastcraftplus.core.permissions.Permission

/**
 * Adapts a recipe from the native implementation.
 */
abstract class FcRecipe<TItem : FcItem<*>> {

    /**
     * The ingredients in this recipe.
     */
    abstract val ingredients: Array<TItem>

    /**
     * The results of this recipe.
     */
    abstract val results: Array<TItem>

    /**
     * The permissions required to craft this recipe.
     */
    abstract val permissions: Array<Permission>

    /**
     * Checks if this recipe is equal to another.
     *
     * @return Returns true if the recipes are equal.
     */
    abstract fun equals(recipe: FcRecipe<TItem>): Boolean

    /**
     * Checks if this recipe is equal to an object.
     *
     * @return Always returns false.
     */
    final override fun equals(other: Any?) = false

    /**
     * Generates a hash code for this recipe.
     */
    final override fun hashCode(): Int {
        var hash = this.javaClass.canonicalName.hashCode()

        ingredients.forEach { hash = hash * 7 + it.hashCode() }
        results.forEach { hash = hash * 11 + it.hashCode() }
        permissions.forEach { hash = hash * 13 + it.hashCode() }

        return hash
    }
}
