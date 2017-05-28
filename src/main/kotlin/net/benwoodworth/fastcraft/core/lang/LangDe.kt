package net.benwoodworth.fastcraft.core.lang

/**
 * German localization.
 *
 * Translated into German by CloudeLecaw:
 * https://www.spigotmc.org/members/cloudelecaw.34292/
 */
class LangDe : Lang("DE") {

    override fun gui_title() = "FastCraft"

    override fun gui_ingredients_label() = "§aZutaten:"
    override fun gui_ingredients_item(item: String, amount: Int) = "§b ${amount}x $item"

    override fun gui_results_label() = "§aErgebnisse:"
    override fun gui_results_item(item: String, amount: Int) = "§b ${amount}x $item"

    override fun gui_recipeHash_label() = "§7Hashcode:"
    override fun gui_recipeHash_code(hashcode: String) = "§7 <hash>"

    override fun gui_toolbar_prev_title(cur: Int, prev: Int, total: Int) = "§avorherige Seite"
    override fun gui_toolbar_prev_desc(cur: Int, prev: Int, total: Int) = listOf(
            "§bblätter auf Seite $prev/$total"
    )

    override fun gui_toolbar_next_title(cur: Int, next: Int, total: Int) = "§anachste Seite"
    override fun gui_toolbar_next_desc(cur: Int, next: Int, total: Int) = listOf(
            "§bblätter auf Seite $next/$total"
    )

    override fun gui_toolbar_refresh_title() = "§aaktualisieren"
    override fun gui_toolbar_refresh_desc() = listOf(
            "§bNeusoritierung der Gegenstände"
    )

    override fun gui_toolbar_multiplier_title(multiplier: Int) = "§aaktualisieren"
    override fun gui_toolbar_multiplier_desc(multiplier: Int) = listOf(
            "§bLinks/Rechtsklick - erhöhen/vermindern",
            "§bSHIFT-klick - um 1 erhöhen",
            "§bMittelklick - auf 1x zurückzusetzen"
    )

    override fun gui_toolbar_workbench_title() = "§aWerkbank"
    override fun gui_toolbar_workbench_desc() = listOf(
            "§bnormale 3x3 Werkbank",
            "§b/fc toggle zum deaktivieren."
    )

    override fun command_err_usage(commandUsage: String) = "§cNutzes des Befehl: $commandUsage"
    override fun command_err_noPerm(permission: String) = "§cDu hast nicht die benötigte Berechtigung für diesen Befehl: $permission"
    override fun command_err_playerOnly() = "§cDu musst ein Spieler sein um diesen Befehl benutzen zu können."
    override fun command_err_consoleOnly() = "§cDieser Befehl kann nur von der Konsole ausgeführt werden."
    override fun command_err_unknownPlayer(player: String) = "§cUnbekannter Spieler: $player"

    override fun command_fc_toggle_output_self_on() = "§aDas Interface von FastCraft wurde aktiviert."
    override fun command_fc_toggle_output_self_off() = "§aDas Interface von FastCraft wurde deaktiviert."
    override fun command_fc_toggle_output_other_on(player: String) = "§aDas Interface von FastCraft wurde für $player aktiviert."
    override fun command_fc_toggle_output_other_off(player: String) = "§aDas Interface von FastCraft wurde für $player deaktiviert."

    override fun command_fca_reload() = "§aDie FastCraft Konfigurationsdatein wurden neugeladen."
}
