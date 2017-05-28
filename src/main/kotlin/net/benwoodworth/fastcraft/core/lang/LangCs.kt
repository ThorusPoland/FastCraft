package net.benwoodworth.fastcraft.core.lang

/**
 * Czech localization.
 *
 * Translated into Czech by MachisCZ:
 * https://www.spigotmc.org/members/machiscz.63328/
 */
class LangCs : Lang {

    override fun gui_ingredients_label() = "§aIngredience:"

    override fun gui_results_label() = "§aVýsledky:"

    override fun gui_recipeHash_label() = "§7Hashcode:"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aPredchozi stranka"
    override fun gui_toolbar_prev_lore(cur: Int, prev: Int, total: Int) = listOf(
            "§bJit na stranku $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aDalsi stranka"
    override fun gui_toolbar_next_lore(cur: Int, next: Int, total: Int) = listOf(
            "§bJit na stranku $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aZnovunacist"
    override fun gui_toolbar_refresh_lore() = listOf(
            "§bZnovu nacte predmety v menu."
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aZnovunacist"
    override fun gui_toolbar_multiplier_lore(multiplier: Int) = listOf(
            "§bLeve/prave kliknuti zvysuje/snizuje nasobic",
            "§bShift klik zvyuje nasobic o 1",
            "§bKliknuti kolecka vyresetuje nasobic na 1"
    )

    override fun gui_toolbar_workbench_title() = "§aPracovni stul"
    override fun gui_toolbar_workbench_lore() = listOf(
            "§bOtevre klasicky 3x3 stul"
    )

    override fun command_err_usage(commandUsage: String) = "§cSpravne pouziti prikazu: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cNemas dostatecna opravneni opravneni pro tento prikaz: $permission"
    override fun command_err_playerOnly() = "§cTento prikaz jde pouzit pouze ve hre."
    override fun command_err_consoleOnly() = "§cTento prikaz muze vyt pouzit pouze z konsole"
    override fun command_err_unknownPlayer(player: String) = "§cNeznamy hrac: $player"

    override fun command_fc_toggle_output_self_on() = "§aFastCraft interface zapnut."
    override fun command_fc_toggle_output_self_off() = "§aFastCraft interface vypnut."
    override fun command_fc_toggle_output_other_on(player: String) = "§aFastCraft interface zapnut pro hrace $player."
    override fun command_fc_toggle_output_other_off(player: String) = "§aFastCraft interface vypnut pro hrace $player."

    override fun command_fca_reload() = "§aFastCraft nastaveni znovu nacteno."
}
