package net.benwoodworth.fastcraft.core.api.dependencies.recipes;

import net.benwoodworth.fastcraft.core.api.dependencies.inventory.FcItem;
import net.benwoodworth.fastcraft.core.api.dependencies.inventory.ItemGrid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A shaped recipe.
 *
 * @param <TItem> The native item type.
 */
public abstract class FcRecipeShaped<TItem> extends FcRecipe<TItem> {

    /**
     * Create a new instance of FcRecipeShaped.
     *
     * @param overriddenRecipe The recipe overridden by this recipe.
     */
    public FcRecipeShaped(@Nullable FcRecipe<TItem> overriddenRecipe) {
        super(overriddenRecipe);
    }

    /**
     * Get the recipe's shape.
     *
     * @return Returns the recipe's shape.
     */
    @NotNull
    public abstract ItemGrid<FcItem<TItem>> getRecipeShape();
}
