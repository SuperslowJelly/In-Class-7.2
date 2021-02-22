package io.github.superslowjelly.inclass72;

import io.github.superslowjelly.inclass72.CommandSources.Console;
import io.github.superslowjelly.inclass72.CommandSources.Player;
import io.github.superslowjelly.inclass72.Commands.Message;
import io.github.superslowjelly.inclass72.Commands.SendToSpawn;

public class Main {

    public static void main(String[] args) {
        Server.players.add(new Player("Frank", true));
        Server.players.add(new Player("Nate", new int[]{500, 72, -250}, true));
        Server.players.add(new Player("Jelly", new int[]{-420, 69, 420}));
        Server.players.add(new Player("MarinaTheFreak"));
        Server.players.add(new Player("Herobrine"));

        Console console = new Console();

        new SendToSpawn().execute(console, new String[]{"MarinaTheFreak"});

        new SendToSpawn().execute(Server.players.get(0), new String[]{"Herobrine"});

        new Message().execute(console, new String[]{"Herobrine", "What the fuck??"});

        new Message().execute(Server.players.get(2), new String[]{"Frank", "Stop banning people!!"});

        new SendToSpawn().execute(Server.players.get(3), new String[]{"Jelly"}); // MarinaTheFreak does not have op, so they do not have permission to run this command.

        new SendToSpawn().execute(console, new String[]{"Babadooie"}); // Babadooie does not exist.

        new Message().execute(console, new String[] {""}); // Incorrect number of arguments.
    }

}
