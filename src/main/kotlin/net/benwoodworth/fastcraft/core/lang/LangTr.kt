package net.benwoodworth.fastcraft.core.lang

/**
 * Turkish localization.
 *
 * Translated into Turkish by ByBartuzen:
 * https://www.spigotmc.org/members/bybartuzen.129255/
 */
class LangTr : Lang("TR") {

    override fun gui_title() = "FastCraft"

    override fun gui_ingredients_label() = "§aGerekenler:"
    override fun gui_ingredients_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_results_label() = "§aSonuç:"
    override fun gui_results_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_recipeHash_label() = "§7Değer:"
    override fun gui_recipeHash_code(hashcode: String) = "§7 <hash>"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aÖnceki Sayfa"
    override fun gui_toolbar_prev_desc(cur: Int, prev: Int, total: Int) = listOf(
            "§bSayfaya git $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aSonraki Sayfa"
    override fun gui_toolbar_next_desc(cur: Int, next: Int, total: Int) = listOf(
            "§bSayfaya git $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aYenile"
    override fun gui_toolbar_refresh_desc() = listOf(
            "§bArayüzü yenile"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aYenile"
    override fun gui_toolbar_multiplier_desc(multiplier: Int) = listOf(
            "§bSol/sağ tıklayarak artır/azalt",
            "§b1 artırmak için shifte basarak tıklayın",
            "§bSıfırlamak için farenin orta tuşuna tıkla"
    )

    override fun gui_toolbar_workbench_title() = "§aKlasik Üretim"
    override fun gui_toolbar_workbench_desc() = listOf(
            "§bKlasik üretim masasını aç"
    )

    override fun command_err_usage(commandUsage: String) = "§cKomut kullanımı: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cBunu için gerekli yetkin yok."
    override fun command_err_playerOnly() = "§cBu komutu sadece oyuncular kullanabilir."
    override fun command_err_consoleOnly() = "§cBu komutu sadece konsol kullanabilir."
    override fun command_err_unknownPlayer(player: String) = "§cBilinmeyen oyuncu: $player"

    override fun command_fc_toggle_output_self_on() = "§aFastCraft üretimi aktif hale getirildi."
    override fun command_fc_toggle_output_self_off() = "§aFastCraft üretimi pasif hale getirildi."
    override fun command_fc_toggle_output_other_on(player: String) = "§aFastCraft $player için aktif hale getirildi."
    override fun command_fc_toggle_output_other_off(player: String) = "§aFastCraft $player için pasif hale getirildi."

    override fun command_fca_reload() = "§aFastCraft ayar dosyası yenilendi."
}
