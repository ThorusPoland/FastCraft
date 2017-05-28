package net.benwoodworth.fastcraft.core.lang

/**
 * Chinese (Traditional, Taiwan) localization.
 *
 * Translated into Chinese (Traditional, Taiwan) by HappyAreaBean from LavaApple Studio
 */
class LangZhTw : Lang("ZH-TW") {

    override fun gui_title() = "FastCraft"

    override fun gui_ingredients_label() = "§a配方:"
    override fun gui_ingredients_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_results_label() = "§a獲得:"
    override fun gui_results_item(item: String, amount: Int) = "§a ${amount}x $item"

    override fun gui_recipeHash_label() = "§7HashCode:"
    override fun gui_recipeHash_code(hashcode: String) = "§7 <hash>"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§a上一頁"
    override fun gui_toolbar_prev_desc(cur: Int, prev: Int, total: Int) = listOf(
            "§b回到 $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§a下一頁"
    override fun gui_toolbar_next_desc(cur: Int, next: Int, total: Int) = listOf(
            "§b前往 $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§a刷新"
    override fun gui_toolbar_refresh_desc() = listOf(
            "§b刷新 快速合成"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§a刷新"
    override fun gui_toolbar_multiplier_desc(multiplier: Int) = listOf(
            "§左鍵來增加/右鍵來減少",
            "§b按住Shift增加1",
            "§b中鍵回到1x"
    )

    override fun gui_toolbar_workbench_title() = "§a合成台"
    override fun gui_toolbar_workbench_desc() = listOf(
            "§b打開 3x3 合成台",
            "§b使用 §a/fc toggle §b 來關閉 FastCraft"
    )

    override fun command_err_usage(commandUsage: String) = "§c正確的使用方式: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§c你沒有權限: $permission"
    override fun command_err_playerOnly() = "§c玩家才能使用."
    override fun command_err_consoleOnly() = "§c控制台才能使用"
    override fun command_err_unknownPlayer(player: String) = "§c未知玩家: $player"

    override fun command_fc_toggle_output_self_on() = "§a開啟快速合成"
    override fun command_fc_toggle_output_self_off() = "§a關閉快速合成"
    override fun command_fc_toggle_output_other_on(player: String) = "§a開啟 $player 的快速合成."
    override fun command_fc_toggle_output_other_off(player: String) = "§a關閉 $player 的快速合成."

    override fun command_fca_reload() = "§a重載快速合成 的配置文件"
}
