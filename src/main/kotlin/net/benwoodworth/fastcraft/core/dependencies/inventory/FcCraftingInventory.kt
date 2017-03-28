package net.benwoodworth.fastcraft.core.dependencies.inventory

import net.benwoodworth.fastcraft.core.dependencies.recipes.FcRecipe

/**
 * A Minecraft crafting inventory.
 *
 * @param TFcItem the item type
 */
interface FcCraftingInventory<TFcItem : FcItem<*>> {

    /** The crafting inventory's crafting matrix */
    val matrix: ItemGrid<FcItem<TFcItem>>

    /** The item in the result slot of the crafting inventory */
    val result: FcItem<TFcItem>

    /** The current recipe in the crafting inventory */
    val recipe: FcRecipe<TFcItem>
}
