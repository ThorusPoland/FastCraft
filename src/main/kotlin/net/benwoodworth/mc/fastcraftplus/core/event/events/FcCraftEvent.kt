package net.benwoodworth.mc.fastcraftplus.core.event.events

import net.benwoodworth.mc.fastcraftplus.core.event.FcEvent
import net.benwoodworth.mc.fastcraftplus.core.inventory.FcItem
import net.benwoodworth.mc.fastcraftplus.core.inventory.ItemGrid

/**
 * Event for crafting items.
 *
 * @param TBase The base event from the server platform.
 * @param TItem The type of item.
 */
interface FcCraftEvent<out TBase, out TItem : FcItem<*>> : FcEvent<TBase> {

    /**
     * The inventory that was used to craft an item.
     */
    val matrix: ItemGrid<TItem>

    /**
     * The crafting item results.
     */
    val results: List<TItem>
}
