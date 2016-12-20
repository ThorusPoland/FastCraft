package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * An immutable Minecraft item.
 *
 * @param <TBase> The native item type.
 */
public abstract class FcItem<TBase> {

    @NotNull
    private final TBase baseItem;

    /**
     * Create a new immutable FcItem.
     *
     * @param baseItem The base item, which will not be modified externally.
     */
    protected FcItem(@NotNull TBase baseItem) {
        this.baseItem = baseItem;
    }

    /**
     * Construct an immutable FcItem from another FcItem.
     *
     * @param item The FcItem this will be based off.
     */
    public FcItem(@NotNull FcItem<TBase> item) {
        this(item.cloneBaseItem());
    }

    /**
     * Clone the base item being adapted.
     *
     * @return Returns a clone of the base item.
     */
    @NotNull
    public abstract TBase cloneBaseItem();

    /**
     * Get the Minecraft item type ID.
     */
    @NotNull
    public abstract String getTypeId();

    /**
     * Get the amount of items in this stack.
     */
    public abstract int getAmount();

    /**
     * Get the display name of this item.
     */
    @Nullable
    public abstract String getDisplayName();

    /**
     * Get a copy of this item's lore.
     *
     * @return Returns a lore.
     */
    @NotNull
    public abstract List<String> getLore();

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
