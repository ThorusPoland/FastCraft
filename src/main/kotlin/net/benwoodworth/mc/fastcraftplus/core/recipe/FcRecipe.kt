package net.benwoodworth.mc.fastcraftplus.core.recipe

import net.benwoodworth.mc.fastcraftplus.core.event.events.FcCraftEvent
import net.benwoodworth.mc.fastcraftplus.core.inventory.FcInventory
import net.benwoodworth.mc.fastcraftplus.core.inventory.FcItem
import net.benwoodworth.mc.fastcraftplus.core.permission.Permission
import net.benwoodworth.mc.fastcraftplus.core.player.FcPlayer

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
     * The permission required to craft this recipe.
     */
    abstract val permissions: Array<Permission>

    /**
     * Simulate the crafting of this item with this recipe.
     *
     * @return Returns the resulting crafting event.
     */
    abstract fun simulateCraft(player: FcPlayer<TItem>): FcCraftEvent<*, TItem>

    /**
     * Checks if this recipe is equal to another.
     *
     * @return Returns true if the recipe are equal.
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
