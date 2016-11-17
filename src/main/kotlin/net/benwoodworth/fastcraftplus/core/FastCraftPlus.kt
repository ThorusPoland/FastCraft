package net.benwoodworth.fastcraftplus.core

import net.benwoodworth.fastcraftplus.core.inventory.InventoryProvider

abstract class FastCraftPlus(
        val logger: ConsoleLogger,
        val inventoryProvider: InventoryProvider<Any> //,
//        val api: FastCraftPlusApi,
//
//        val configProvider: ConfigProvider,
//        val lang: LangProvider
) {

    abstract fun pluginStart()

//    fun pluginStop()
//
//    fun pluginReload()

}

