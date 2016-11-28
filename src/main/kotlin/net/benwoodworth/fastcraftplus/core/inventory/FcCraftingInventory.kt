package net.benwoodworth.fastcraftplus.core.inventory

import net.benwoodworth.fastcraftplus.core.recipes.FcRecipe

/**
 * Created by bwoodworth on 11/28/2016.
 */
interface FcCraftingInventory<TItem> {

    /**
     * The ingredient matrix in this crafting inventory.
     */
    val matrix: ItemGrid<TItem>
        get

    /**
     * The resulting item of this crafting inventory.
     */
    var result: FcItem<TItem>
        get
        set

    var recipe: FcRecipe<TItem>
        get
        set
}
