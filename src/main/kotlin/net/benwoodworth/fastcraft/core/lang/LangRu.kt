package net.benwoodworth.fastcraft.core.lang

/**
 * Russian localization.
 *
 * Translated into Russian by RusIK:
 * https://www.spigotmc.org/members/rusik.189845/
 */
class LangRu : Lang("RU") {

    override fun gui_title() = "FastCraft"

    override fun gui_ingredients_label() = "§aИнгредиенты:"
    override fun gui_ingredients_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_results_label() = "§aResults:"
    override fun gui_results_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_recipeHash_label() = "§7Хеш:"
    override fun gui_recipeHash_code(hashcode: String) = "§7 <hash>"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aПредыдущая страница"
    override fun gui_toolbar_prev_desc(cur: Int, prev: Int, total: Int) = listOf(
            "§bНа страницу $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aСледующая страница"
    override fun gui_toolbar_next_desc(cur: Int, next: Int, total: Int) = listOf(
            "§bНа страницу $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aОбновить"
    override fun gui_toolbar_refresh_desc() = listOf(
            "§bОбновить интерфейс FastCraft"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aОбновить"
    override fun gui_toolbar_multiplier_desc(multiplier: Int) = listOf(
            "§bПравый/левый клик для увеличения/уменьшения",
            "§bНажми Shift для увеличения на 1",
            "§bНажми на колёсико мыши для сброса до 1"
    )

    override fun gui_toolbar_workbench_title() = "§aСтандартный верстак"
    override fun gui_toolbar_workbench_desc() = listOf(
            "§bОткрыть сетку крафта 3x3"
    )

    override fun command_err_usage(commandUsage: String) = "§cИспользуй команду: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cУ тебя нет прв для использования данной команды: $permission"
    override fun command_err_playerOnly() = "§cТы должен быть игроком, чтобы использовать эту команду."
    override fun command_err_consoleOnly() = "§cThis command can only be executed in the server console"
    override fun command_err_unknownPlayer(player: String) = "§cUnknown player: $player"

    override fun command_fc_toggle_output_self_on() = "§aИнтерфейс FastCraft включён."
    override fun command_fc_toggle_output_self_off() = "§aИнтерфейс FastCraft выключен."
    override fun command_fc_toggle_output_other_on(player: String) = "§aИнтерфейс FastCraft включён для игрока $player."
    override fun command_fc_toggle_output_other_off(player: String) = "§aИнтерфейс FastCraft выключён для игрока $player."

    override fun command_fca_reload() = "§aКонфигурация FastCraft перезагружена."
}
