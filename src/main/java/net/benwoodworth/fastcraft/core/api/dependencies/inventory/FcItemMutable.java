package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A mutable Minecraft item.
 *
 * @param <TBase> The native item type.
 */
public abstract class FcItemMutable<TBase> extends FcItem<TBase> {

    @NotNull
    private final TBase baseItem;

    /**
     * Construct a mutable FcItem.
     *
     * @param baseItem The base item.
     */
    public FcItemMutable(@NotNull TBase baseItem) {
        super(baseItem);
        this.baseItem = baseItem;
    }

    /**
     * Construct a mutable FcItem from another FcItem.
     *
     * @param item The FcItem this will be based off.
     */
    public FcItemMutable(FcItem<TBase> item) {
        this(item.cloneBaseItem());
    }

    /**
     * Set the Minecraft item type ID.
     *
     * @param typeId The type ID to set.
     */
    public abstract void setTypeId(@NotNull String typeId);

    /**
     * Set the amount of items in this stack.
     *
     * @param amount The amount of items.
     */
    public abstract void setAmount(int amount);

    /**
     * Set the display name of this item.
     *
     * @param displayName The display name.
     */
    public abstract void setDisplayName(@Nullable String displayName);

    /**
     * Set this item's lore.
     *
     * @param lore The lore to set.
     */
    public abstract void setLore(@NotNull List<String> lore);

    /**
     * Add an enchantment to the item.
     *
     * @param enchantmentId The Minecraft enchantment ID.
     * @param level The enchantment level.
     */
    public abstract void addEnchantment(@NotNull String enchantmentId, int level);
}
