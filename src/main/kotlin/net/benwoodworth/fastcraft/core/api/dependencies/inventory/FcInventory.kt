package net.benwoodworth.fastcraft.core.api.dependencies.inventory

import net.benwoodworth.fastcraft.core.api.dependencies.player.FcPlayer

import java.util.*

/**
 * Adapts items so they can be used by the plugin.
 *
 * @param TItem the native item type
 */
abstract class FcInventory<TItem> {

    /** The number of slots in the inventory. */
    abstract val size: Int

    /** The title of the inventory. */
    abstract val title: String?

    /** The player viewing the inventory. */
    abstract val viewers: List<FcPlayer<TItem>>

    /** The contents of the inventory. */
    protected abstract val contents: List<FcItem<TItem>>

    /** The grid of items in this inventory. */
    abstract val itemGrid: ItemGrid<FcItem<TItem>>

    /** The carrier of this inventory. */
    abstract val carrier: Any?

    /**
     * Add items to the inventory.
     *
     * @param items the items to add
     * @return items that could not be added to the inventory
     */
    abstract fun addItems(items: Collection<FcItem<TItem>>): List<FcItem<TItem>>

    /**
     * Remove items from the inventory.
     *
     * @param items the items to remove
     * @return items that could not be removed from the inventory
     */
    abstract fun removeItems(items: Collection<FcItem<TItem>>): List<FcItem<TItem>>

    /**
     * Remove ingredients from the inventory.
     *
     * @param ingredients the ingredients to remove
     * @return items that could not be removed from the inventory
     */
    abstract fun removeIngredients(ingredients: Collection<FcItem<TItem>>): List<FcItem<TItem>>

    /**
     * See if items are all in the inventory.
     *
     * @param items the items to see if the inventory contains
     * @return true if the inventory contains all the `items`
     */
    fun containsItems(items: Collection<FcItem<TItem>>): Boolean {
        return contains(items, FcItem<TItem>::isSimilar)
    }

    /**
     * See if ingredients are all in the inventory.
     *
     * @param ingredients the ingredients to see if the inventory contains
     * @return true if the inventory contains all the `ingredients`
     */
    fun containsIngredients(ingredients: Collection<FcItem<TItem>>): Boolean {
        val sorted = LinkedList<FcItem<TItem>>()

        // Compare wildcard items last, because they're less specific.
        for (item in ingredients) {
            if (item.hasWildCardData) {
                sorted.addLast(item)
            } else {
                sorted.addFirst(item)
            }
        }

        return contains(sorted, FcItem<TItem>::matchesIngredient)
    }

    /**
     * See if items are all in the inventory, using the specified
     * comparator to check for similarity between items.
     *
     * @param items the items to check the inventory against
     * @param comparator the comparator to check items with
     * @return true if all the items are contained according to the `comparator`
     */
    private fun contains(items: Collection<FcItem<TItem>>,
                         comparator: (FcItem<TItem>, FcItem<TItem>) -> Boolean): Boolean {
        // Keep track of the amount of the items
        val amounts = Array(contents.size) {
            contents[it].amount
        }

        // Loop through the provided items
        items@ for (item in items) {
            var remaining = item.amount

            // Subtract item amount from amounts
            for (i in 0..(contents.size + 1)) {
                // If looped through all, and haven't removed enough
                if (i == contents.size)
                    return false

                // If items don't match
                if (!comparator(item, contents[i]))
                    continue

                if (amounts[i] < remaining) {
                    remaining -= amounts[i]
                    amounts[i] = 0
                } else {
                    amounts[i] -= remaining
                    continue@items
                }
            }
        }

        // Was able to remove all items
        return true
    }
}
