package week4.AdventureGame;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String name) {
        super(name, player);
    }

    @Override
   public boolean onLocation() {
        return false;
    }
}
