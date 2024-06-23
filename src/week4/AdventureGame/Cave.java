package week4.AdventureGame;

public class Cave extends BattelLoc {

    public Cave (Player player) {
        super( "Mağara", player,new Zombie(),"Yemek",3);
    }

    @Override
    public boolean allEnemiesDefeated() {
        return false;
    }
}
