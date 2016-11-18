package net.benwoodworth.fastcraftplus.core.inventory

import net.benwoodworth.fastcraftplus.core.players.PlayerAdapter
import org.junit.Assert
import org.junit.Test

class InventoryAdapterTests {

    fun testItem(base: String, amount: Int) = object : ItemAdapter<String>() {
        override var base = base
        override var amount = amount
        override var typeId = ""
        override var displayName: String? = ""
        override var lore = emptyArray<String>()

        override fun addEnchantment(enchantmentId: String, level: Int) = throw Exception()
        override fun isSimilar(item: ItemAdapter<String>) = item.base == base
        override fun matchesIngredient(ingredient: ItemAdapter<String>) = ingredient.base == base
        override fun hashCode(): Int = 0
    }

    fun testInventory(vararg contents: ItemAdapter<String>) = object : InventoryAdapter<String>() {
        override var height = 1
        override var title = "Title"
        override var contents = arrayOf(*contents)
        override var viewers = emptyArray<PlayerAdapter>()

        override fun getItem(x: Int, y: Int): ItemAdapter<String> = throw Exception()
        override fun setItem(x: Int, y: Int, item: ItemAdapter<String>) = throw Exception()
        override fun addItems(vararg items: ItemAdapter<String>): Array<ItemAdapter<String>> = throw Exception()
        override fun removeItems(vararg items: ItemAdapter<String>): Array<ItemAdapter<String>> = throw Exception()
    }

    @Test
    fun testContains() {
        Assert.assertTrue("True when contains more than enough items in one stack",
                testInventory(
                        testItem("A", 4)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertTrue("True when contains more than enough items in two stacks",
                testInventory(
                        testItem("A", 2),
                        testItem("A", 2)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertTrue("True when contains more than enough items with other items",
                testInventory(
                        testItem("B", 2),
                        testItem("A", 4),
                        testItem("B", 2)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertTrue("True when contains same amount of items",
                testInventory(
                        testItem("A", 3)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertTrue("True when contains same amount of items spread out",
                testInventory(
                        testItem("A", 1),
                        testItem("A", 1),
                        testItem("A", 1)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertFalse("False when contains no items",
                testInventory(
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertFalse("False when contains not enough items",
                testInventory(
                        testItem("A", 2)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertFalse("False when contains not enough items and other items",
                testInventory(
                        testItem("B", 3),
                        testItem("A", 2),
                        testItem("B", 3)
                ).contains(
                        testItem("A", 3)
                )
        )

        Assert.assertFalse("False when contains other items",
                testInventory(
                        testItem("B", 3),
                        testItem("B", 3)
                ).contains(
                        testItem("A", 3)
                )
        )
    }

    @Test
    fun failingExperimentalTest() {
        Assert.fail("This experimental test should make the Travis-CI build fail.")
    }
}
