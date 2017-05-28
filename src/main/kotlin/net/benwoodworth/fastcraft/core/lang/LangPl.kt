package net.benwoodworth.fastcraft.core.lang

/**
 * Polish localization.
 *
 * Translated into Polish by TheoMarque:
 * https://github.com/TheoMarque
 */
class LangPl : Lang {

    override fun gui_ingredients_label() = "§aSkladniki:"

    override fun gui_results_label() = "§aProdukty:"

    override fun gui_recipeHash_label() = "§7Hashcode:"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aPoprzednia strona"
    override fun gui_toolbar_prev_lore(cur: Int, prev: Int, total: Int) = listOf(
            "§bIdz do strony $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aNastepna strona"
    override fun gui_toolbar_next_lore(cur: Int, next: Int, total: Int) = listOf(
            "§bIdz do strony $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aOdswiez"
    override fun gui_toolbar_refresh_lore() = listOf(
            "§bOdswiez interfejs FastCraft"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aOdswiez"
    override fun gui_toolbar_multiplier_lore(multiplier: Int) = listOf(
            "§bLewy/prawy przycisk myszy by zwiekszyc/zmniejszyc",
            "§bZ SHIFT rosnie o 1",
            "§bSrodkowy mnozy o 1"
    )

    override fun gui_toolbar_workbench_title() = "§aStol rzemieslniczy"
    override fun gui_toolbar_workbench_lore() = listOf(
            "§bOtworz zwykly stol rzemieslniczy (3x3)",
            "§bUzyj §a/fc toggle§b by wylaczyc FastCraft"
    )

    override fun command_err_usage(commandUsage: String) = "§cUzycie polecenia: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cNie masz uprawnien aby uzyc polecenia, potrzebne uprawnienia: $permission"
    override fun command_err_playerOnly() = "§cMusisz byc graczem aby uzyc tego polecenia"
    override fun command_err_consoleOnly() = "§cPolecenie dostepne tylko z konsoli"
    override fun command_err_unknownPlayer(player: String) = "§cNieznany gracz: $player"

    override fun command_fc_toggle_output_self_on() = "§aInterfejs FastCraft aktywny."
    override fun command_fc_toggle_output_self_off() = "§aInterfejs FastCraft nieaktywny."
    override fun command_fc_toggle_output_other_on(player: String) = "§aInterfejs FastCraft aktywny dla gracza $player."
    override fun command_fc_toggle_output_other_off(player: String) = "§aInterfejs FastCraft nieaktywny dla gracza $player."

    override fun command_fca_reload() = "§aFastCraft - konfiguracja przeladowana."
}
