package net.benwoodworth.fastcraftplus.core.events

import net.benwoodworth.fastcraftplus.core.inventory.FcCraftingInventory

/**
 * Event for crafting items.
 *
 * @param TBase The type of base event from the native server platform.
 * @param TInventory The type of crafting inventory used this event.
 */
interface FcCraftEvent<TBase, out TInventory : FcCraftingInventory<*>> : FcEvent<TBase> {

    /**
     * The inventory that was used to craft an item.
     */
    val inventory: TInventory
}
