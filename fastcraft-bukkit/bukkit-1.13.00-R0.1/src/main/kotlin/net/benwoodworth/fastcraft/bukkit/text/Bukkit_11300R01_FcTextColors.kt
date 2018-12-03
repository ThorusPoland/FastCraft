package net.benwoodworth.fastcraft.bukkit.text

import net.benwoodworth.fastcraft.platform.text.FcTextColor
import net.benwoodworth.fastcraft.platform.text.FcTextColors

@Suppress("ClassName")
class Bukkit_11300R01_FcTextColors : FcTextColors {

    override val black = Bukkit_11300R01_FcTextColor("black", "§0")
    override val darkBlue = Bukkit_11300R01_FcTextColor("dark_blue", "§1")
    override val darkGreen = Bukkit_11300R01_FcTextColor("dark_green", "§2")
    override val darkAqua = Bukkit_11300R01_FcTextColor("dark_aqua", "§3")
    override val darkRed = Bukkit_11300R01_FcTextColor("dark_red", "§4")
    override val darkPurple = Bukkit_11300R01_FcTextColor("dark_purple", "§5")
    override val gold = Bukkit_11300R01_FcTextColor("gold", "§6")
    override val gray = Bukkit_11300R01_FcTextColor("gray", "§7")
    override val darkGray = Bukkit_11300R01_FcTextColor("dark_gray", "§8")
    override val blue = Bukkit_11300R01_FcTextColor("blue", "§9")
    override val green = Bukkit_11300R01_FcTextColor("green", "§a")
    override val aqua = Bukkit_11300R01_FcTextColor("aqua", "§b")
    override val red = Bukkit_11300R01_FcTextColor("red", "§c")
    override val lightPurple = Bukkit_11300R01_FcTextColor("light_purple", "§d")
    override val yellow = Bukkit_11300R01_FcTextColor("yellow", "§e")
    override val white = Bukkit_11300R01_FcTextColor("white", "§f")
    override val default = Bukkit_11300R01_FcTextColor("reset", "§r")

    fun fromId(id: String): FcTextColor {
        return when (id) {
            "black" -> black
            "dark_blue" -> darkBlue
            "dark_green" -> darkGreen
            "dark_aqua" -> darkAqua
            "dark_red" -> darkRed
            "dark_purple" -> darkPurple
            "gold" -> gold
            "gray" -> gray
            "dark_gray" -> darkGray
            "blue" -> blue
            "green" -> green
            "aqua" -> aqua
            "red" -> red
            "light_purple" -> lightPurple
            "yellow" -> yellow
            "white" -> white
            "reset" -> default
            else -> throw IllegalArgumentException("Invalid color ID: $id")
        }
    }
}
