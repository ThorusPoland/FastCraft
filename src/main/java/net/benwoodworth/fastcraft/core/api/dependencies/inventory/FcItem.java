package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A Minecraft item.
 *
 * @param <TBase> The item type from the native server platform.
 */
public abstract class FcItem<TBase> {
    /**
     * The base item being adapted.
     */
    @NotNull
    public abstract TBase getBase();

    /**
     * Get the Minecraft item type ID.
     */
    @NotNull
    public abstract String getTypeId();

    /**
     * Set the Minecraft item type ID.
     *
     * @param typeId The type ID to set.
     */
    public abstract void setTypeId(@NotNull String typeId);

    /**
     * Get the amount of items in this stack.
     */
    public abstract int getAmount();

    /**
     * Set the amount of items in this stack.
     *
     * @param amount The amount of items.
     */
    public abstract void setAmount(int amount);

    /**
     * Get the display name of this item.
     */
    @Nullable
    public abstract String getDisplayName();

    /**
     * Set the display name of this item.
     *
     * @param displayName The display name.
     */
    public abstract void setDisplayName(@Nullable String displayName);

    /**
     * Get a copy of this item's lore.
     *
     * @return Returns a lore.
     */
    @NotNull
    public abstract List<String> getLore();

    /**
     * Set this item's lore.
     *
     * @param lore The lore to set.
     */
    public abstract void setLore(@NotNull List<String> lore);

    /**
     * Get the maximum size of this stack.
     *
     * @return Returns the maximum stack size.
     */
    public abstract int getMaxStackSize();

    /**
     * Whether this item, as an ingredient, matches any item of the same type, regardless of data.
     *
     * @return Returns true if the item has wild card data.
     */
    public abstract boolean hasWildCardData();

    /**
     * Add an enchantment to the item.
     *
     * @param enchantmentId The Minecraft enchantment ID.
     * @param level The enchantment level.
     */
    public abstract void addEnchantment(@NotNull String enchantmentId, int level);

    /**
     * Compare equality of this base item to another, ignoring amount.
     *
     * @param item The item to compare to.
     * @return Returns true if the items are similar.
     */
    public abstract boolean isSimilar(@NotNull FcItem<TBase> item);

    /**
     * Checks if this item can be used as an ingredient in a recipe.
     * Ingredient can have wildcard data.
     *
     * @param ingredient The ingredient of a recipe.
     * @return Returns true if this item can be used as the ingredient.
     */
    public abstract boolean matchesIngredient(@NotNull FcItem<TBase> ingredient);

    /**
     * A hash code for this item.
     *
     * @return Returns the item's hash code.
     */
    @Override
    public abstract int hashCode();

    /**
     * Compare equality to an object that isn't an FcItem<T>.
     *
     * @return Returns false.
     */
    @Override
    public final boolean equals(@Nullable Object other) {
        return false;
    }

    /**
     * Checks if the items are similar, and have the same amount.
     *
     * @return Returns whether the items are equal.
     */
    public final boolean equals(@NotNull FcItem<TBase> other) {
        return getAmount() == other.getAmount() && isSimilar(other);
    }
}
