package net.benwoodworth.fastcraft.core.api.dependencies.recipes;

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.ItemGrid;
import org.jetbrains.annotations.NotNull;

/**
 * A shaped recipe.
 *
 * @param <TItem> The native item type.
 */
public abstract class FcShapedRecipe<TItem> extends FcRecipe<TItem> {

    /**
     * Get the recipe's shape.
     *
     * @return Returns the recipe's shape.
     */
    @NotNull
    public abstract ItemGrid<FcItem<TItem>> getRecipeShape();
}
