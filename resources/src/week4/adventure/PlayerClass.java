package week4.adventure;

public abstract class PlayerClass {
    private String name;
    private int damage;
    private int heath;
    private int money;

    public PlayerClass(String name,int damage, int heath, int money) {
        this.damage = damage;
        this.heath = heath;
        this.money = money;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
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
}
