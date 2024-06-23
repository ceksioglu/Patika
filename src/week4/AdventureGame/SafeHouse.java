package week4.AdventureGame;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----- Güvenli evdesiniz ! Canınız yenilendi:) -----");
        this.getPlayer().setHealthy(this.getPlayer().getOrjHealth());
        return true;
    }
}


