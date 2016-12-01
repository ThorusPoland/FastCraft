package net.benwoodworth.fastcraftplus.core

import net.benwoodworth.fastcraftplus.core.api.FastCraftApi
import net.benwoodworth.fastcraftplus.core.inventory.InventoryProvider

abstract class FastCraftPlus(
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

