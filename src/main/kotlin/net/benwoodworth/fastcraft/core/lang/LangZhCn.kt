package net.benwoodworth.fastcraft.core.lang

/**
 * Chinese (Simplified, PRC) localization.
 *
 * Translated into Chinese (Simplified, PRC) by Mars:
 * http://www.isotopestudio.cc/minecraft.html
 */
class LangZhCn : Lang {

    override fun gui_ingredients_label() = "§a配方:"

    override fun gui_results_label() = "§a获得:"

    override fun gui_recipeHash_label() = "§7哈希码:"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§a上一页"
    override fun gui_toolbar_prev_lore(cur: Int, prev: Int, total: Int) = listOf(
            "§b回到 $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§a下一页"
    override fun gui_toolbar_next_lore(cur: Int, next: Int, total: Int) = listOf(
            "§b前往 $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§a刷新"
    override fun gui_toolbar_refresh_lore() = listOf(
            "§b刷新 快速合成"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§a刷新"
    override fun gui_toolbar_multiplier_lore(multiplier: Int) = listOf(
            "§b左键来增加/右键来减少",
            "§b按住Shift增加1",
            "§b中键回到1x"
    )

    override fun gui_toolbar_workbench_title() = "§a合成台"
    override fun gui_toolbar_workbench_lore() = listOf(
            "§b打开 3x3 合成台",
            "§b使用 §a/fc toggle§b 来关闭快速合成"
    )

    override fun command_err_usage(commandUsage: String) = "§c正确的使用方式: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§c你没有权限: $permission"
    override fun command_err_playerOnly() = "§c玩家才能使用."
    override fun command_err_consoleOnly() = "§c控制台才能使用"
    override fun command_err_unknownPlayer(player: String) = "§c未知玩家: $player"

    override fun command_fc_toggle_output_self_on() = "§a开启快速合成."
    override fun command_fc_toggle_output_self_off() = "§a关闭快速合成."
    override fun command_fc_toggle_output_other_on(player: String) = "§a开启 $player 的快速合成."
    override fun command_fc_toggle_output_other_off(player: String) = "§a关闭 $player 的快速合成."

    override fun command_fca_reload() = "§a重载快速合成 的配置文件."
}
