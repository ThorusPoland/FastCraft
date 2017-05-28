package net.benwoodworth.fastcraft.core.lang

/**
 * Vietnamese localization.
 *
 * Translated into Vietnamese by AnhCraft:
 * https://www.spigotmc.org/members/anhcraft.252895/
 */
class LangVi : Lang {

    override fun gui_ingredients_label() = "§aCác thành phần:"

    override fun gui_results_label() = "§aCác kết quả:"

    override fun gui_recipeHash_label() = "§7Mã băm:"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§aTrang trước"
    override fun gui_toolbar_prev_lore(cur: Int, prev: Int, total: Int) = listOf(
            "§bTới trang $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§aTrang sau"
    override fun gui_toolbar_next_lore(cur: Int, next: Int, total: Int) = listOf(
            "§bTới trang $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aLàm mới"
    override fun gui_toolbar_refresh_lore() = listOf(
            "§bLàm mới giao diện FastCraft"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aLàm mới"
    override fun gui_toolbar_multiplier_lore(multiplier: Int) = listOf(
            "§bChuột trái/phải để tăng/giảm",
            "§bGiữ Shift để tăng 1",
            "§bChuột giữa để trở về 1x"
    )

    override fun gui_toolbar_workbench_title() = "§aBàn chế tạo"
    override fun gui_toolbar_workbench_lore() = listOf(
            "§bMở bàn chế tạo 3x3",
            "§bDùng §a/fc toggle§b để tắt FastCraft"
    )

    override fun command_err_usage(commandUsage: String) = "§cSử dụng lệnh: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cBạn không có quyền hạn để dùng lệnh này: $permission"
    override fun command_err_playerOnly() = "§cBạn phải là một người để dùng lệnh này."
    override fun command_err_consoleOnly() = "§cLệnh này chỉ có thể được thực hiện trong giao diện điều khiển (console) của mày chủ"
    override fun command_err_unknownPlayer(player: String) = "§cKhông tìm thấy người chơi: $player"

    override fun command_fc_toggle_output_self_on() = "§aBật giao diện FastCraft."
    override fun command_fc_toggle_output_self_off() = "§aTắt giao diện FastCraft."
    override fun command_fc_toggle_output_other_on(player: String) = "§aBật giao diện FastCraft cho người chơi $player."
    override fun command_fc_toggle_output_other_off(player: String) = "§aTắt giao diện FastCraft cho người chơi $player."

    override fun command_fca_reload() = "§aTệp tin cấu hình FastCraft đã được nạp lại."
}
