package net.benwoodworth.fastcraft.core.api.inventory

import net.benwoodworth.fastcraft.core.api.player.FcPlayer
import java.util.*

/**
 * Adapts items so they can be used by the plugin.
 */
abstract class FcInventory<TItem : FcItem<*>> {

    /**
     * The number of slots in the inventory.
     */
    abstract val size: Int

    /**
     * The title of the inventory.
     */
    abstract val title: String?

    /**
     * The player viewing the inventory.
     */
    abstract val viewers: List<FcPlayer<TItem>>

    /**
     * The contents of the inventory.
     */
    protected abstract val contents: List<FcItem<TItem>>

    /**
     * The grid of items in this inventory.
     */
    abstract val itemGrid: ItemGrid<TItem>

    /**
     * Add items to the inventory.
     *
     * @param items The items to add.
     * @return Items that could not be added to the inventory.
     */
    abstract fun addItems(vararg items: FcItem<TItem>): Array<FcItem<TItem>>

    /**
     * Remove items from the inventory.
     *
     * @param items The items to remove.
     * @return Items that could not be removed from the inventory.
     */
    abstract fun removeItems(vararg items: FcItem<TItem>): Array<FcItem<TItem>>

    /**
     * Remove ingredients from the inventory.
     *
     * @param ingredients The ingredients to remove.
     * @return Items that could not be removed from the inventory.
     */
    abstract fun removeIngredients(vararg ingredients: FcItem<TItem>): Array<FcItem<TItem>>

    /**
     * See if items are all in the inventory.
     */
    fun containsItems(vararg items: FcItem<TItem>): Boolean {
        return contains(items.asList(), FcItem<TItem>::isSimilar)
    }

    /**
     * See if ingredients are all in the inventory.
     */
    fun containsIngredients(vararg items: FcItem<TItem>): Boolean {
        val sorted = LinkedList<FcItem<TItem>>()

        // Compare wildcard items last, because they're less specific.
        for (item in items) {
            if (item.wildcardData) {
                sorted.addLast(item)
            } else {
                sorted.addFirst(item)
            }
        }

        return contains(sorted, FcItem<TItem>::matchesIngredient)
    }

    /**
     * See if items are all in the inventory, using the specified comparator to check for similarity between items.
     */
    private fun contains(items: Collection<FcItem<TItem>>,
                         comparator: (testItem: FcItem<TItem>, invItem: FcItem<TItem>) -> Boolean): Boolean {

        val amounts = Array(contents.size, {contents[it].amount})

        items@for (item in items) {
            var remaining = item.amount

            for (i in 0..contents.size) {
                if (i == contents.size) return false
                if (!comparator(item, contents[i])) continue

                if (amounts[i] < remaining) {
                    remaining -= amounts[i]
                    amounts[i] = 0
                } else {
                    amounts[i] -= remaining
                    continue@items
                }
            }
        }

        return true
    }
}
