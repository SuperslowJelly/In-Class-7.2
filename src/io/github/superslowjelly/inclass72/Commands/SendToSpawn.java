package io.github.superslowjelly.inclass72.Commands;

import io.github.superslowjelly.inclass72.CommandSources.CommandSource;
import io.github.superslowjelly.inclass72.CommandSources.Player;
import io.github.superslowjelly.inclass72.Server;

public class SendToSpawn implements Command {

    @Override
    public void execute(CommandSource source, String[] arguments) {
        if (source.isOperator()) {
            String targetName;
            if (arguments.length == 1) {
                targetName = arguments[0];
                Player player;
                if ((player = Server.getPlayer(targetName)) != null) {
                    player.setLocation(new int[]{0, 72, 0});
                    System.out.println("[Server] SendToSpawn > " + source.getName() + " sent " + targetName + " to spawn!");
                } else System.err.println("[ERROR] SendToSpawn > Player, " + targetName + ",  could not be found!");
            } else System.err.println("[ERROR] SendToSpawn > Incorrect argument(s) supplied, please try again!");
        } else System.err.println("[ERROR] SendToSpawn > " + source.getName() + " does not have permission to run this command!");
    }

}
