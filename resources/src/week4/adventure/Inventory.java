package week4.adventure;

public class Inventory {

    private  Weapon weapon;
    boolean artifact, supplies, crystal;
    String weaponName, armorName;
    int weaponDamage, armorDefence;

    public Inventory() {
        this.weapon = new Weapon(0,"Fists",0,0);

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean isArtifact() {
        return artifact;
    }

    public void setArtifact(boolean artifact) {
        this.artifact = artifact;
    }

    public boolean isSupplies() {
        return supplies;
    }

    public void setSupplies(boolean supplies) {
        this.supplies = supplies;
    }

    public boolean isCrystal() {
        return crystal;
    }

    public void setCrystal(boolean crystal) {
        this.crystal = crystal;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}
