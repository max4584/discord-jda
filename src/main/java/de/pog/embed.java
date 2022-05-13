package de.pog;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class embed extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent ereignis) {
        if (ereignis.isFromGuild()){

            if (ereignis.getMessage().getContentStripped().equals("/test")){

                EmbedBuilder bauplan = new EmbedBuilder();
                bauplan.setTitle("Hallo test 123");
                bauplan.setDescription("Dies ist ein Test");
                bauplan.setFooter("1");

                bauplan.addField("YouTube" , "Das ist ein test" , true);
                bauplan.addField("Test" , "Das ist ein test" , true);

                bauplan.setColor(0x202787);
                bauplan.setAuthor("Amperia" , "https://discord.gg/WUWZpfwJGQ" , "https://cdn.discordapp.com/attachments/866092527311781916/974408893662920754/wp6505585.jpg");

                ereignis.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            }
        }
    }
}
