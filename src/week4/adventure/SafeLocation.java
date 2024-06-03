package week4.adventure;

public abstract class SafeLocation extends Location{
    public SafeLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
