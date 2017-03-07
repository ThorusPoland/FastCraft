package net.benwoodworth.fastcraft.core

import net.benwoodworth.fastcraft.core.api.gui.GuiFactory
import javax.inject.Singleton

/**
 * Created by Ben on 3/6/2017.
 */
interface FastCraftComponent<TFcItem> {

    fun getFastCraft(): FastCraft<TFcItem>

    fun getGuiFactory(): GuiFactory<TFcItem>
}
