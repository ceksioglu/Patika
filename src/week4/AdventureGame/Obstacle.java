package week4.AdventureGame;

public class Obstacle {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int award;
    private int orjinalHealth;



    public Obstacle(int id, String name,int damage, int health, int award) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.award = award;
        this.orjinalHealth = health;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health <0) {
            health=0;
        }
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
