package net.benwoodworth.fastcraft.core.lang

/**
 * FastCraft localization.
 *
 * If you provide a localization, feel free to PM Kepler_ on spigotmc.org
 *
 * Use the section symbol (§) for formatting/color codes:
 * http://minecraft.gamepedia.com/Formatting_codes
 */
abstract class Lang(val localeId: String) {
    companion object {
        /**
         * All the Lang translations.
         */
        val all = listOf(
                LangEnUs()
        )

        /**
         * Get a Lang given a locale ID.
         */
        fun getLang(localeId: String) = all.single {
            it.localeId.toLowerCase() == localeId.toLowerCase()
        }
    }

    abstract fun gui_title(): String

    abstract fun gui_ingredients_label(): String
    abstract fun gui_ingredients_item(item: String, amount: Int): String

    abstract fun gui_results_label(): String
    abstract fun gui_results_item(item: String, amount: Int): String

    abstract fun gui_recipeHash_label(): String
    abstract fun gui_recipeHash_code(hashcode: String): String

    abstract fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int): String
    abstract fun gui_toolbar_prev_desc(cur: Int, prev: Int, total: Int): List<String>

    abstract fun gui_toolbar_next_title(cur: Int, next: Int, total: Int): String
    abstract fun gui_toolbar_next_desc(cur: Int, next: Int, total: Int): List<String>

    abstract fun gui_toolbar_refresh_title(): String
    abstract fun gui_toolbar_refresh_desc(): List<String>

    abstract fun gui_toolbar_multiplier_title(multiplier: Int): String
    abstract fun gui_toolbar_multiplier_desc(multiplier: Int): List<String>

    abstract fun gui_toolbar_workbench_title(): String
    abstract fun gui_toolbar_workbench_desc(): List<String>

    abstract fun command_err_usage(commandUsage: String): String
    abstract fun command_err_noPerm(permission: String): String
    abstract fun command_err_playerOnly(): String
    abstract fun command_err_consoleOnly(): String
    abstract fun command_err_unknownPlayer(player: String): String

    abstract fun command_fc_toggle_output_self_on(): String
    abstract fun command_fc_toggle_output_self_off(): String
    abstract fun command_fc_toggle_output_other_on(player: String): String
    abstract fun command_fc_toggle_output_other_off(player: String): String

    abstract fun command_fca_reload(): String
}