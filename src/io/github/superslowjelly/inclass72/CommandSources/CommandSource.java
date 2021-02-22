package io.github.superslowjelly.inclass72.CommandSources;

public interface CommandSource {

    String getName();

    void sendMessage(String message);

    boolean isOperator();

}
