package week4.AdventureGame;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(String name, int id,int damage,int price) {
        this.damage = damage;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList =new Weapon[3];
        weaponList[0] = new Weapon("Tabanca " ,1,2,15);
        weaponList[1] = new Weapon("Kılıç\t" , 2,3,35);
        weaponList[2] = new Weapon("Tüfek\t" ,3,7,45);
        return weaponList;
    }

    public static Weapon getWeaponObjByID(int id) {
        for (Weapon w : Weapon.weapons()) {
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
