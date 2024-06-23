package week4.AdventureGame;

public class River extends BattelLoc {
    public River(Player player) {
        super("Nehir" , player , new Bear(), "su",2);
    }

    @Override
    public boolean allEnemiesDefeated() {
        return false;
    }
}
