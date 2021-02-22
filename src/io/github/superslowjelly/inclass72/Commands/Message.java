package io.github.superslowjelly.inclass72.Commands;

import io.github.superslowjelly.inclass72.CommandSources.CommandSource;
import io.github.superslowjelly.inclass72.CommandSources.Console;
import io.github.superslowjelly.inclass72.CommandSources.Player;
import io.github.superslowjelly.inclass72.Server;

public class Message implements Command {

    @Override
    public void execute(CommandSource source, String[] arguments) {
        if (arguments.length == 2) {
            String targetName = arguments[0],
                    message = arguments[1];
            Player target;
            if ((target = Server.getPlayer(targetName)) != null)
                // This could be shortened to just use source.getName() for both situations, but I needed an excuse to check for instanceof Console.
                if (source instanceof Console)
                    System.out.println("[Messaging] Console -> " + target.getName() + ": " + message);
                else
                    System.out.println("[Messaging] " + source.getName() + " -> " + target.getName() + ": " + message);
            else System.err.println("[ERROR] Message > Player, " + targetName + ", could not be found!");
        } else System.err.println("[ERROR] Message > Incorrect number of arguments provided, please try again!");
    }

}
