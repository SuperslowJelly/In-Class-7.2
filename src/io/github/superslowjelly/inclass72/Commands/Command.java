package io.github.superslowjelly.inclass72.Commands;

import io.github.superslowjelly.inclass72.CommandSources.CommandSource;

public interface Command {

    void execute(CommandSource source, String[] arguments);

}
