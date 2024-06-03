package week4.adventure;

import java.util.Scanner;

public class Player extends Game {

    private int id;
    private int damage;
    private int health;
    private int money;
    private String name;        //User name
    private String charName;    //Player class name
    private int charSelect = 0;
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {

        PlayerClass[] classList = {new Engineer(), new CQC(), new Sniper()};

        System.out.println("Choose a class:");
        System.out.println("----------------------------");
        for (PlayerClass cl : classList) {
            System.out.println(cl.getId() + " " + cl.getName() +
                    "\t Damage: " + cl.getDamage() +
                    "\tHealth: " + cl.getHeath() +
                    "\tMoney: " + cl.getMoney());
        }
        System.out.println("----------------------------");

        boolean confirmed = false;
        while (!confirmed) {
            System.out.print("Input: ");
            charSelect = scanner.nextByte();
            scanner.nextLine();
            if (charSelect <= 0 || charSelect >= 4) {
                System.out.println("Wrong input, please choose the correct number.");
            } else {
                boolean innerLoop = true;
                while (innerLoop) {
                    switch (charSelect) {
                        case 1:
                            System.out.println("You have selected Engineer.");
                            System.out.print("Are you sure you want to select this character? (yes/no): ");
                            String response1 = scanner.nextLine().trim().toLowerCase();
                            if (response1.equals("yes")) {
                                initPlayer(new Engineer());
                                System.out.println(this.getId() + " : " + this.getCharName());
                                confirmed = true;
                                innerLoop = false;
                            } else if (response1.equals("no")) {
                                innerLoop = false;
                            } else {
                                System.out.println("Invalid input, please enter 'yes' or 'no'.");
                            }
                            break;
                        case 2:
                            System.out.println("You have selected CQC.");
                            System.out.print("Are you sure you want to select this character? (yes/no): ");
                            String response2 = scanner.nextLine().trim().toLowerCase();
                            if (response2.equals("yes")) {
                                initPlayer(new CQC());
                                System.out.println(this.getId() + " : " + this.getCharName());
                                confirmed = true;
                                innerLoop = false;
                            } else if (response2.equals("no")) {
                                innerLoop = false;
                            } else {
                                System.out.println("Invalid input, please enter 'yes' or 'no'.");
                            }
                            break;
                        case 3:
                            System.out.println("You have selected Sniper.");
                            System.out.print("Are you sure you want to select this character? (yes/no): ");
                            String response3 = scanner.nextLine().trim().toLowerCase();
                            if (response3.equals("yes")) {
                                initPlayer(new Sniper());
                                System.out.println(this.getId() + " : " + this.getCharName());
                                confirmed = true;
                                innerLoop = false;
                            } else if (response3.equals("no")) {
                                innerLoop = false;
                            } else {
                                System.out.println("Invalid input, please enter 'yes' or 'no'.");
                            }
                            break;
                    }
                }
            }
        }

        System.out.println(this.getCharName() + " Health : " + this.getHealth());
    }

    public void initPlayer(PlayerClass playerClass) {

        this.setId(playerClass.getId());
        this.setDamage(playerClass.getDamage());
        this.setHealth(playerClass.getHeath());
        this.setMoney(playerClass.getMoney());
        this.setCharName(playerClass.getName());
    }


    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCharSelect() {
        return charSelect;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCharSelect(int charSelect) {
        this.charSelect = charSelect;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
