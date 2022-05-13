package de.pog;

import net.dv8tion.jda.api.entities.Emoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.selections.SelectionMenu;

public class Command extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getMessage().getContentStripped().startsWith(Main.prefix + "informations")) {
            event.getChannel().sendMessage("Informationen:").setActionRow(sendServerInformations()).queue();
        }

    }

    private static SelectionMenu sendServerInformations() {
        return SelectionMenu.create("infos")
                .setPlaceholder("Nichts ausgewählt!")
                .addOption("Owner", "owner", "Klicke um diese Option zu wählen!", Emoji.fromMarkdown("\uD83D\uDC51"))
                .addOption("Mitglieder", "member", "Klicke um diese Option zu wählen!", Emoji.fromMarkdown("\uD83D\uDC65"))
                .addOption("Erstellungsdatum", "date", "Klicke um diese Option zu wählen!", Emoji.fromMarkdown("\uD83D\uDCC5"))
                .addOption("IP", "mc", "Klicke um diese Option zu wählen!", Emoji.fromMarkdown("❓"))
                .addOption("Booster", "booster", "Klicke um diese Option zu wählen!", Emoji.fromMarkdown("\uD83C\uDF89"))
                .setRequiredRange(1, 4)
                .build();
    }

}
