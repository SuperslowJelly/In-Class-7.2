package io.github.superslowjelly.inclass72.CommandSources;

public class Player implements CommandSource {

    public Player(String name) {
        this.name = name;
        this.location = new int[]{0, 0, 0};
        this.operator = false;
    }

    public Player(String name, int[] location) {
        this.name = name;
        this.location = location;
        this.operator = false;
    }

    public Player(String name, boolean operator) {
        this.name = name;
        this.location = new int[]{0, 0, 0};
        this.operator = operator;
    }

    public Player(String name, int[] location, boolean operator) {
        this.name = name;
        this.location = location;
        this.operator = operator;
    }

    private int[] location;

    public void setLocation(int[] location) {
        this.location = location;
    }

    public int[] getLocation() {
        return location;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    private boolean operator;

    public void setOperator(boolean operator) {
        this.operator = operator;
    }

    @Override
    public boolean isOperator() {
        return operator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("[Player] " + name + " > " + message);
    }

}
