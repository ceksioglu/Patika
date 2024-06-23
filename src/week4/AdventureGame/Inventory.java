package week4.AdventureGame;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private List<Food> foods;
    private List<Firewood> firewoods;
    private List<Water> waters;



    public Inventory() {
        this.weapon = new Weapon("Yumruk" ,-1,0,0);
        this.armor = new Armor(-1,"Paçavra",0,0);
        this.foods = new ArrayList<>();
        this.firewoods = new ArrayList<>();
        this.waters = new ArrayList<>();

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    // Yemek ekleme
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

