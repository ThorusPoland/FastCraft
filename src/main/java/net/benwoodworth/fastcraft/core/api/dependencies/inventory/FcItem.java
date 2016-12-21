package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * An immutable Minecraft item.
 *
 * @param <TBase> the native item type
 */
public abstract class FcItem<TBase> {

    @NotNull
    protected final TBase baseItem;

    /**
     * Create a new immutable FcItem.
     *
     * @param baseItem the base item
     */
    protected FcItem(@NotNull TBase baseItem) {
        this.baseItem = baseItem;
    }

    /**
     * Construct an immutable FcItem from another FcItem.
     *
     * @param item the FcItem this will be based off
     */
    public FcItem(@NotNull FcItem<TBase> item) {
        this(item.cloneBaseItem());
    }

    /**
     * Clone the base item being adapted.
     *
     * @return a clone of the base item
     */
    @NotNull
    public abstract TBase cloneBaseItem();

    /**
     * Get the Minecraft item type ID.
     *
     * @return the item type ID
     */
    @NotNull
    public abstract String getTypeId();

    /**
     * Get the amount of items in this stack.
     *
     * @return the amount
     */
    public abstract int getAmount();

    /**
     * Get the display name of this item.
     *
     * @return the item display name, or {@code null} if there is none
     */
    @Nullable
    public abstract String getDisplayName();

    /**
     * Get a copy of this item's lore.
     *
     * @return a copy of the lore
     */
    @NotNull
    public abstract List<String> getLore();

    /**
     * Get the maximum size of this stack.
     *
     * @return the maximum stack size
     */
    public abstract int getMaxStackSize();

    /**
     * Whether this item, as an ingredient, matches any item of the same type, regardless of data.
     *
     * @return {@code true} if the item has wild card data
     */
    public abstract boolean hasWildCardData();

    /**
     * Compare equality of this base item to another, ignoring amount.
     *
     * @param item the {@link FcItem} to compare to
     * @return {@code true} if the items are similar
     */
    public abstract boolean isSimilar(@NotNull FcItem<TBase> item);

    /**
     * Checks if this item can be used as an ingredient in a recipe.
     * Ingredient can have wildcard data.
     *
     * @param ingredient the ingredient of a recipe
     * @return {@code true} if this item can be used as the ingredient
     */
    public abstract boolean matchesIngredient(@NotNull FcItem<TBase> ingredient);

    /**
     * A hash code for this item.
     *
     * @return the item's hash code
     */
    @Override
    public abstract int hashCode();

    /**
     * Compare equality to an object that isn't an FcItem<T>.
     *
     * @return {@code false}
     */
    @Override
    public final boolean equals(@Nullable Object other) {
        return false;
    }

    /**
     * Checks if the items are similar, and have the same amount.
     *
     * @return {@code true} if the items are equal
     */
    public final boolean equals(@NotNull FcItem<TBase> other) {
        return getAmount() == other.getAmount() && isSimilar(other);
    }
}
