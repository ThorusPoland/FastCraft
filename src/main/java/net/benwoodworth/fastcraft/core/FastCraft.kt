package net.benwoodworth.fastcraft.core

import net.benwoodworth.fastcraft.core.api.FastCraftApi
import net.benwoodworth.fastcraft.core.api.inventory.InventoryProvider

abstract class FastCraft(
        val logger: ConsoleLogger,
        val inventoryProvider: InventoryProvider<*> //,
//        val api: FastCraftApi,
//
//        val configProvider: ConfigProvider,
//        val lang: LangProvider
) {

    val api = FastCraftApi(this)

    abstract fun pluginStart()

//    fun pluginStop()
//
//    fun pluginReload()

}

