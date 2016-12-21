package net.benwoodworth.fastcraft.core.api.dependencies.inventory;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A mutable Minecraft item.
 *
 * @param <TBase> the native item type
 */
public abstract class FcItemMutable<TBase> extends FcItem<TBase> {

    /**
     * Construct a mutable FcItem.
     *
     * @param baseItem the base item
     */
    public FcItemMutable(@NotNull TBase baseItem) {
        super(baseItem);
    }

    /**
     * Construct a mutable FcItem from another FcItem.
     *
     * @param item the FcItem this will protectedbe based off
     */
    public FcItemMutable(FcItem<TBase> item) {
        this(item.cloneBaseItem());
    }

    /**
     * Get the base item.
     *
     * @return the base item
     */
    public TBase getBaseItem() {
        return baseItem;
    }

    /**
     * Set the Minecraft item type ID.
     *
     * @param typeId the type ID to set
     */
    public abstract void setTypeId(@NotNull String typeId);

    /**
     * Set the amount of items in this stack.
     *
     * @param amount the amount of items
     */
    public abstract void setAmount(int amount);

    /**
     * Set the display name of this item.
     *
     * @param displayName the display name
     */
    public abstract void setDisplayName(@Nullable String displayName);

    /**
     * Set this item's lore.
     *
     * @param lore the lore to set
     */
    public abstract void setLore(@NotNull List<String> lore);

    /**
     * Add an enchantment to the item.
     *
     * @param enchantmentId the Minecraft enchantment ID
     * @param level the enchantment level
     */
    public abstract void addEnchantment(@NotNull String enchantmentId, int level);
}
