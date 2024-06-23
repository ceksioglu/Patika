package week4.AdventureGame;

public class Forest extends week4.AdventureGame.BattelLoc {

    public Forest (Player player) {
        super("Orman" , player , new week4.AdventureGame.Vampire(), "odun",3);
    }

    @Override
    public boolean allEnemiesDefeated() {
        return false;
    }
}
