package co.kepler.fastcraft.recipes.custom;

import co.kepler.fastcraft.config.RecipesConfig;
import co.kepler.fastcraft.recipes.Ingredient;
import org.bukkit.Material;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * A shaped recipe than supports ingredients with metadata.
 */
public class CustomShapedRecipe extends CustomRecipe {
    private final List<ItemStack> results;
    private final Ingredient[][] ingredientGrid; // [row][col]
    private final int rows, cols;
    private final ShapedRecipe recipe;
    private final ItemStack[] matrix;

    /**
     * Create a new instance of CustomShapedRecipe.
     *
     * @param result         The result of the recipe.
     * @param ingredientsMap The chars-ingredient map.
     * @param shape          The shape of the recipe.
     * @throws RecipesConfig.RecipeException Thrown when recipe is improperly configured.
     */
    public CustomShapedRecipe(ItemStack result, Map<Character, Ingredient> ingredientsMap,
                              List<String> shape) throws RecipesConfig.RecipeException {
        this.results = Collections.singletonList(result);

        // Get the number of rows and columns in the shape.
        rows = shape.size();
        if (rows < 1 || rows > 3)
            throw new RecipesConfig.RecipeException("The recipe's shape height must be between 1 and 3");
        cols = shape.get(0).length();
        if (cols < 1 || cols > 3)
            throw new RecipesConfig.RecipeException("The recipe's shape width must be between 1 and 3");

        // Ensure all rows are the same width
        for (String s : shape) {
            if (s.length() != cols)
                throw new RecipesConfig.RecipeException("All rows in the shape must be the same width");
        }

        // Copy ingredients to the matrix
        ingredientGrid = new Ingredient[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Ingredient ingredient = ingredientsMap.get(shape.get(row).charAt(col));
                ingredientGrid[row][col] = ingredient;
                addIngredient(ingredient);
            }
        }

        // Create Recipe
        recipe = new ShapedRecipe(result);
        String[] shapeArr = new String[shape.size()];
        recipe.shape(shape.toArray(shapeArr));
        for (Character key : ingredientsMap.keySet()) {
            recipe.setIngredient(key, ingredientsMap.get(key).getData());
        }

        // Create matrix
        matrix = new ItemStack[9];
        for (int row = 0; row < shapeArr.length; row++) {
            char[] chars = shapeArr[row].toCharArray();
            for (int col = 0; col < chars.length; col++) {
                Ingredient ingredient = ingredientsMap.get(chars[col]);
                if (ingredient == null) continue;
                matrix[row * 3 + col] = ingredient.clone();
            }
        }
    }

    @Override
    protected List<ItemStack> getResultsInternal() {
        return results;
    }

    @Override
    protected ShapedRecipe getRecipeInternal() {
        return recipe;
    }

    @Override
    protected ItemStack[] getMatrixInternal() {
        return matrix;
    }

    @Override
    public boolean matchesMatrix(ItemStack[] matrix) {
        return getMatrixOffset(matrix) != null;
    }

    @Override
    public void removeFromMatrix(CraftItemEvent event) {
        ItemStack[] matrix = event.getInventory().getMatrix();
        Offset offset = getMatrixOffset(matrix);
        if (offset == null) {
            // Unable to craft with ingredients in matrix
            event.setCancelled(true);
            return;
        }

        // If there aren't ingredients with amount > 1, let Bukkit handle item removal
        boolean multiIngredients = false;
        for (Ingredient i : getIngredients())
            if (multiIngredients = i.getAmount() > 1) break;
        if (!multiIngredients) return;

        // Don't handle shift-clicks for recipes with ingredients that have amount > 1
        if (event.isShiftClick()) {
            event.setCancelled(true);
            return; // TODO Add support for shift-clicking
        }

        // Remove items from matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                ItemStack item = matrix[offset.getIndex(col, row)];
                if (item == null) continue;
                int remove = ingredientGrid[row][col].getAmount() - 1;
                item.setAmount(item.getAmount() - remove);
            }
        }
    }

    /**
     * Get the offset of the matrix.
     *
     * @param matrix The matrix.
     * @return Returns the matrix offset, or null if it doesn't match.
     */
    private Offset getMatrixOffset(ItemStack[] matrix) {
        int size = (int) Math.sqrt(matrix.length);
        if (rows > size || cols > size) return null;

        // Flip the matrix, so flipped recipes can be matched
        ItemStack[] matrixFlip = new ItemStack[matrix.length];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                ItemStack curItem = matrix[x + (y * size)];
                if (curItem != null && curItem.getType() == Material.AIR) {
                    matrix[x + (y * size)] = null;
                }
                matrixFlip[(size - 1 - x) + (y * size)] = matrix[x + (y * size)];
            }
        }

        // Compare the shape to the matrices
        for (int dx = 0; dx <= size - cols; dx++) {
            for (int dy = 0; dy <= size - rows; dy++) {
                if (matchesMatrixOffset(matrix, dx, dy))
                    return new Offset(size, dx, dy, false);
                if (matchesMatrixOffset(matrixFlip, dx, dy))
                    return new Offset(size, dx, dy, true);
            }
        }

        // Doesn't match matrix
        return null;
    }

    /**
     * Compare a matrix offset by a certain x and y.
     *
     * @param matrix The matrix to check.
     * @param dx     The x offset of this recipe in the grid.
     * @param dy     The y offset of this recipe in the grid.
     * @return Returns true if the matrix matches this recipe.
     */
    private boolean matchesMatrixOffset(ItemStack[] matrix, int dx, int dy) {
        // Compare ingredients with items in the matrix
        int size = (int) Math.sqrt(matrix.length);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                ItemStack item = matrix[row * size + col];
                if (row < dy || col < dx || row >= dy + rows || col >= dx + cols) {
                    // If outside the current recipe
                    if (item != null && item.getType() != Material.AIR) return false;
                } else {
                    // If inside the current recipe
                    Ingredient ingredient = ingredientGrid[row - dy][col - dx];
                    if (ingredient == null) {
                        if (item != null) return false;
                    } else if (!matchesMatrixSlot(item, ingredient)) {
                        return false;
                    }
                }
            }
        }

        // None of the ingredients didn't match
        return true;
    }

    /**
     * Compare an item in the matrix to an ingredient.
     *
     * @param matrixItem The matrix item to compare.
     * @param ingredient The ingredient to compare.
     * @return Returns true if the items are the same, and if there is enough of the item.
     */
    private boolean matchesMatrixSlot(ItemStack matrixItem, Ingredient ingredient) {
        if (!ingredient.matchesItem(matrixItem)) return false;
        return matrixItem.getAmount() >= ingredient.getAmount();
    }

    /**
     * Stores the offset of a matrix.
     */
    private static class Offset {
        public final int size, dx, dy;
        public final boolean mirrored;

        public Offset(int size, int dx, int dy, boolean mirrored) {
            this.size = size;
            this.dx = dx;
            this.dy = dy;
            this.mirrored = mirrored;
        }

        /**
         * Get the matrix index for this offset.
         *
         * @param xRaw The raw x-value.
         * @param yRaw The raw y-value.
         * @return Returns the index in the matrix.
         */
        public int getIndex(int xRaw, int yRaw) {
            if (mirrored) xRaw = size - 1 - xRaw;
            xRaw += dx;
            yRaw += dy;
            return size * yRaw + xRaw;
        }
    }
}
