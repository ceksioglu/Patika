package week4.adventure;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(int id,String name, int damage, int price) {
        this.id = id;
        this.damage = damage;
        this.price = price;
        this.name = name;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[6];
        weaponList[0] = new Weapon(1,"Stellar Revolver",5,60);
        weaponList[1] = new Weapon(2,"Photon Pistol",8,100);
        weaponList[2] = new Weapon(3,"Quantum Blaster",10,180);
        weaponList[3] = new Weapon(4,"Plasma Carbine",25,900);
        weaponList[4] = new Weapon(5,"Ion Pulse Rifle",60,3000);
        weaponList[5] = new Weapon(6,"Celestial Laser Cannon",100,5000);
        return weaponList;
    }

    public static Weapon getWeaponById(int id){
        for (Weapon w : Weapon.weapons()){
            if (w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
