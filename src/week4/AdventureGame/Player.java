package week4.AdventureGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private String name;
    private int money;
    private int healthy;
    private int orjHealth;
    private int damage;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private List<Food> foods;
    private List<Firewood> firewoods;
    private List<Water> waters;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
        this.foods = new ArrayList<>();
        this.firewoods = new ArrayList<>();
        this.waters = new ArrayList<>();

    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(),new Archer(),new Knight()};
        System.out.println("Karakterler");
        System.out.println("=============================================================================");
        for(GameChar gameChar : charList) {
            System.out.println("ID :" + gameChar.getId() +
                    "\t\tKarakter:" + gameChar.getName() +
                    "\t\t Hasar: "+ gameChar.getDamage() +
                    "\t\t Sağlık:"+ gameChar.getHealth()+
                    "\t\t Para:"  + gameChar.getMoney());
        }
        System.out.println("=============================================================================");
        System.out.print("Lütfen bir karakter seçiniz: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        /* System.out.println("Karakteriniz: " + this.getCharName() +
                ", Hasar : " + this.getDamage() +
                ", Sağlık : " + this.getHealthy() +
                ", Para : " + this.getMoney());

         */

        System.out.println("=============================================================================");

    }


    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealth());
        this.setOrjHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());

    }
    public void printInfo(){
        System.out.println("Silah : " + this. getInventory().getWeapon().getName() +
                           ", Zırh : " + this. getInventory().getArmor().getName() +
                           ", Bloklama : " + this. getInventory().getArmor().getBlock()+
                           ", Hasarınız : " + this.getTotalDamage() +
                           ", Sağlık : " + this.getHealthy() +
                           ", Para : " + this.getMoney());

    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


    public int getTotalDamage(){
        return damage + this. getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }



    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }

    public void addFood(Food food) {
        this.foods.add(food);
    }

    // Odun ekleme
    public void addFirewood(Firewood firewood) {
        this.firewoods.add(firewood);
    }

    // Su ekleme
    public void addWater(Water water) {
        this.waters.add(water);
    }
}




