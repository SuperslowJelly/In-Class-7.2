package io.github.superslowjelly.inclass72;

import io.github.superslowjelly.inclass72.CommandSources.Player;

import java.util.ArrayList;

public class Server {

    public static ArrayList<Player> players = new ArrayList<>();

    public static Player getPlayer(String name) {
        for (Player player : players)
            if (player.getName().equalsIgnoreCase(name))
                return player;
        return null;
    }

}
