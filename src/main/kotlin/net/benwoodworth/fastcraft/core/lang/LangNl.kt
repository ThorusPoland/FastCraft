package net.benwoodworth.fastcraft.core.lang

/**
 * Dutch localization.
 *
 * Translated into Dutch by funzo88:
 * https://www.spigotmc.org/members/funzo88.78211/
 */
class LangNl : Lang("NL") {

    override fun gui_title() = "FastCraft"

    override fun gui_ingredients_label() = "§aIngrediënten:"
    override fun gui_ingredients_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_results_label() = "§aResults:"
    override fun gui_results_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_recipeHash_label() = "§7Hashcode:"
    override fun gui_recipeHash_code(hashcode: String) = "§7 <hash>"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aVorige Pagina"
    override fun gui_toolbar_prev_desc(cur: Int, prev: Int, total: Int) = listOf(
            "§bGa naar pagina $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aVolgende Pagina"
    override fun gui_toolbar_next_desc(cur: Int, next: Int, total: Int) = listOf(
            "§bGa naar pagina $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aVervers"
    override fun gui_toolbar_refresh_desc() = listOf(
            "§bVervers de FastCraft interface"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aVervers"
    override fun gui_toolbar_multiplier_desc(multiplier: Int) = listOf(
            "§bLinker/rechter muisklik om te toenemen/afnemen",
            "§bShift klik om toe te nemen met 1",
            "§bMiddrl muisklik om te resetten naar 1x"
    )

    override fun gui_toolbar_workbench_title() = "§aWerkbank"
    override fun gui_toolbar_workbench_desc() = listOf(
            "§bOpen een 3x3 werkbank"
    )

    override fun command_err_usage(commandUsage: String) = "§cCommando gebruik: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cJe hebt geen permissie voor dit commando: $permission"
    override fun command_err_playerOnly() = "§cJe moet een speler zijn om dit commando te gebruiken."
    override fun command_err_consoleOnly() = "§cDit commando kan alleen gebruikt worden in de server console"
    override fun command_err_unknownPlayer(player: String) = "§cOnbekende speler: $player"

    override fun command_fc_toggle_output_self_on() = "§aFastCraft interface ingeschakeld."
    override fun command_fc_toggle_output_self_off() = "§aFastCraft interface uitgeschakeld."
    override fun command_fc_toggle_output_other_on(player: String) = "§aFastCraft interface ingeschakeld voor $player."
    override fun command_fc_toggle_output_other_off(player: String) = "§aFastCraft interface uitgeschakeld voor $player."

    override fun command_fca_reload() = "§aFastCraft configuratie bestanden herladen."
}
