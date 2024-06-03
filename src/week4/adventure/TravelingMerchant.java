package week4.adventure;

public class TravelingMerchant extends SafeLocation {
    public TravelingMerchant(Player player) {
        super(player, "Traveling Merchant");
    }

    @Override
    boolean onLocation() {

        System.out.println("As you navigate your starship through the asteroid belt, a shimmering vessel comes into view.");
        System.out.println("An enigmatic figure, cloaked in shimmering fabrics, hails you from the deck of the spaceship.");
        System.out.println("\"Greetings, traveler of the stars,\" the figure says, their voice echoing through the communicator. \"I am Marlowe, a purveyor of rare galactic treasures.\"");
        System.out.println("\"Please, dock with my vessel and explore my extraordinary wares.\"");

        System.out.println("\nMarlowe's Galactic Emporium:");
        System.out.println("1. Weapons");
        System.out.println("2. Armor");
        System.out.println("3. Exit");
        int selectOption = scanner.nextInt();
        while (selectOption < 1 || selectOption > 3) {
            System.out.println("Incorrect input, please enter the correct number:");
            selectOption = scanner.nextInt();
        }
        switch (selectOption) {
            case 1:
                printWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("You decided to leave without buying anything. The merchant is visibly annoyed.");
                return true;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons: \n");
        System.out.println("--------------------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(
                    w.getId() + " : " +
                            w.getName() +
                            " Price: " + w.getPrice() +
                            " Damage: " + w.getDamage());
        }
        System.out.println("Choose a weapon to purchase: ");
        int selectWeapon = scanner.nextInt();
        while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {

            System.out.println("Invalid choice, please choose the correct number.");
            selectWeapon = scanner.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponById(selectWeapon);
        if ( selectedWeapon != null){
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Times are rough. Not enough money.");
            } else {
                System.out.println("You purchased: " +selectedWeapon.getName());
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Remaining money : " + this.getPlayer().getMoney());
            }
        }


    }
    public void printArmor () {
        System.out.println();
    }
}
