package week4.adventure;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    private Player player;
    private Location location;

    public Game() {
    } //Geçiçi

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Game(Player player, Location location) {
        this.player = player;
        this.location = location;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    void start() {
        System.out.println("Ready for an old school adventure?");
        System.out.println("Please enter name :");
        //String playerName = scanner.nextLine();
        Player player = new Player("Can");
        System.out.println("'" + player.getName() + "'" + " has been selected for your name!");
        System.out.println("Welcome to Lost in Space!");
        System.out.println("Please select a class for your chracter: ");

        player.selectChar();

        Location location = null;
        while (true) {
            System.out.println();
            System.out.println("----- Locations -----");
            System.out.println();
            System.out.println("1 - Ship Quarters [+]");
            System.out.println("2 - Traveling Merchant");
            System.out.println();
            System.out.println("Please select the location you wish to go :");
            int selectLocation = scanner.nextInt();
            location = switch (selectLocation) {
                case 1 -> new SafeHouse(player);
                case 2 -> new TravelingMerchant(player);
                default -> new SafeHouse(player);
            };

            if (!location.onLocation()) {
                System.out.println("YOU DIED");
                break;
            }
        }

    }
}
