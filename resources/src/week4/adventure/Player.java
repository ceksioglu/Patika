package week4.adventure;

import java.util.Scanner;

public class Player extends Game {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charSelect;

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {

        Scanner scanner = new Scanner(System.in);
        PlayerClass[] classList = {new Engineer(), new CQC(), new Sniper()};

        System.out.println("Choose a class:");
        for (PlayerClass cl : classList) {
            System.out.println("Class: " + cl.getName() +
                    "\t Damage: " + cl.getDamage() +
                    "\tHealth: " + cl.getHeath() +
                    "\tMoney: " + cl.getMoney());
        }
        System.out.print("Input : ");
        byte input = scanner.nextByte();

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

    public String getCharSelect() {
        return charSelect;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCharSelect(String charSelect) {
        this.charSelect = charSelect;
    }

}
