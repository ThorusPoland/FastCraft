package net.benwoodworth.fastcraft.core.api.gui

import net.benwoodworth.fastcraft.core.FastCraft
import net.benwoodworth.fastcraft.core.dependencies.inventory.InventoryFactory
import javax.inject.Inject

/**
 * Created by Ben on 3/7/2017.
 */
class GuiFactory<TFcItem> @Inject constructor(
        fastCraft: FastCraft<TFcItem>,
        inventoryFactory: InventoryFactory<TFcItem>
) {

}
