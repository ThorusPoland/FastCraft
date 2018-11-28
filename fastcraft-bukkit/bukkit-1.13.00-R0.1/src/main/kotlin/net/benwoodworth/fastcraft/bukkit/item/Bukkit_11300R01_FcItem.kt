package net.benwoodworth.fastcraft.bukkit.item

import net.benwoodworth.fastcraft.platform.item.FcItem
import net.benwoodworth.fastcraft.platform.item.FcItemType
import net.benwoodworth.fastcraft.platform.text.FcText
import org.bukkit.inventory.ItemStack

@Suppress("ClassName")
class Bukkit_11300R01_FcItem(
    private var base: ItemStack?,
    override var type: FcItemType,
    override var amount: Int,
    override var displayName: FcText?,
    override var lore: List<FcText>
) : FcItem {

    fun copyBase(): ItemStack? {
        return base?.clone()
    }
}
