package net.benwoodworth.fastcraft.bukkit.bukkit_1_13_R01.item

import net.benwoodworth.fastcraft.bukkit.bukkit
import net.benwoodworth.fastcraft.platform.item.FcItem
import net.benwoodworth.fastcraft.platform.item.FcItemBuilder
import net.benwoodworth.fastcraft.platform.item.FcItemTypes
import net.benwoodworth.fastcraft.platform.locale.FcLocale
import net.benwoodworth.fastcraft.platform.text.FcTextBuilder
import net.benwoodworth.fastcraft.util.invoke
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import javax.inject.Inject
import javax.inject.Provider

class BukkitFcItemFactory @Inject constructor(
    private val itemTypes: FcItemTypes,
    private val buildText: Provider<FcTextBuilder>
) : BukkitFcItemFactory {

    override fun buildItem(copy: FcItem?, build: FcItemBuilder.() -> Unit): FcItem {
        val builder = when (copy) {
            null -> BukkitFcItemBuilder(
                base = null,
                type = itemTypes.air,
                amount = 1,
                displayName = null,
                lore = mutableListOf()
            )
            else -> BukkitFcItemBuilder(
                base = copy.bukkit
                    .copyBase(),
                type = copy.type,
                amount = copy.amount,
                displayName = copy.displayName,
                lore = copy.lore.toMutableList()
            )
        }

        return builder
            .apply { build(this) }
            .build()
    }

    fun fromItemStack(itemStack: ItemStack): FcItem {
        // TODO decode
        val displayName = itemStack.displayName
            ?.let { displayName ->
                buildText { text = displayName }
            }

        // TODO decode
        val lore = itemStack.lore
            ?.let { lore ->
                lore.map { line ->
                    buildText { text = line }
                }
            }
            ?: emptyList()

        return BukkitFcItem(
            base = itemStack,
            amount = itemStack.amount,
            type = BukkitFcItemType(itemStack.type),
            displayName = displayName,
            lore = lore
        )
    }

    fun toItemStack(item: FcItem, locale: FcLocale): ItemStack {
        val result = item.bukkit
            .copyBase()
            ?: ItemStack(Material.AIR)

        result.type = item.type.bukkit
            .material

        result.amount = item.amount

        result.displayName = item.displayName?.bukkit
            ?.toLegacy(locale)

        result.lore = item.lore
            .takeIf { it.any() }
            ?.map { line ->
                line.bukkit
                    .toLegacy(locale)
            }

        return result
    }
}
