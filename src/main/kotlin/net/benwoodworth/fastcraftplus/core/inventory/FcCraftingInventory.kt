package net.benwoodworth.fastcraftplus.core.inventory

import net.benwoodworth.fastcraftplus.core.recipes.FcRecipe

/**
 * A crafting inventory.
 */
interface FcCraftingInventory<TItem> {

    /**
     * The ingredient matrix in this crafting inventory.
     */
    val matrix: ItemGrid<TItem>

    /**
     * The resulting item of this crafting inventory.
     */
    var result: FcItem<TItem>

    /**
     * The recipe in this crafting inventory.
     */
    var recipe: FcRecipe<TItem>?
}
