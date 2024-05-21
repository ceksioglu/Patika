package week4.adventure;

public class SafeHouse extends SafeLocation{
    public SafeHouse(Player player) {
        super(player, "Ship Quarters");
    }

    @Override
    boolean onLocation() {
        System.out.println("SAFE ZONE \n You arrive to your ship to heal and get some rest.");
        return true;
    }
}
