package week4.adventure;

import java.util.Scanner;

public abstract class Location extends Game {
    private Player player;
    private String name;
    public static Scanner scanner = new Scanner(System.in);

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    abstract boolean onLocation();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }

}
