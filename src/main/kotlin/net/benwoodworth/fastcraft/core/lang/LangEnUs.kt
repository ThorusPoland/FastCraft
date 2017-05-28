package net.benwoodworth.fastcraft.core.lang

/**
 * English localization.
 */
class LangEnUs : Lang {

    override fun gui_ingredients_label() = "§aIngredients"

    override fun gui_results_label() = "§aResults:"

    override fun gui_recipeHash_label() = "§aHashCode:"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aPrevious Page"
    override fun gui_toolbar_prev_lore(cur: Int, prev: Int, total: Int) = listOf(
            "§bGo to page $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aNext Page"
    override fun gui_toolbar_next_lore(cur: Int, next: Int, total: Int) = listOf(
            "§bGo to page $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aRefresh"
    override fun gui_toolbar_refresh_lore() = listOf(
            "§bRefresh the FastCraft interface"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aCrafting Multiplier (${multiplier}x)"
    override fun gui_toolbar_multiplier_lore(multiplier: Int) = listOf(
            "§bLeft/right click to increase/decrease",
            "§bShift click to adjust by 1",
            "§bMiddle click to reset to 1x"
    )

    override fun gui_toolbar_workbench_title() = "§aCrafting Grid"
    override fun gui_toolbar_workbench_lore() = listOf(
            "§bOpen a 3x3 crafting grid",
            "§bUse §a/fc toggle §bto disable FastCraft"
    )

    override fun command_err_usage(commandUsage: String) = "§cCommand usage: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cYou don't have the required permission for this command: $permission"
    override fun command_err_playerOnly() = "§cYou must be a player to use this command."
    override fun command_err_consoleOnly() = "§cThis command can only be executed in the server console"
    override fun command_err_unknownPlayer(player: String) = "§cUnknown player: $player"

    override fun command_fc_toggle_output_self_on() = "§aEnabled FastCraft+ interface."
    override fun command_fc_toggle_output_self_off() = "§aDisabled FastCraft+ interface."
    override fun command_fc_toggle_output_other_on(player: String) = "§aEnabled FastCraft+ interface for $player."
    override fun command_fc_toggle_output_other_off(player: String) = "§aDisabled FastCraft+ interface for $player."

    override fun command_fca_reload() = "§aFastCraft+ config files reloaded."
}
