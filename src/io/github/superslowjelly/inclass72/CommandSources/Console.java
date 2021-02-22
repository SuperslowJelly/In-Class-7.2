package io.github.superslowjelly.inclass72.CommandSources;

public class Console implements CommandSource {

    @Override
    public String getName() {
        return "Console";
    }

    @Override
    public void sendMessage(String message) {
        System.out.print("[Console] > " + message);
    }

    @Override
    public boolean isOperator() {
        return true;
    }

}
