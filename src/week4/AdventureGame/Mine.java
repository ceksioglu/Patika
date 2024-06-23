package week4.AdventureGame;

import java.util.Random;

public class Mine extends BattelLoc {
    public Mine(Player player) {
        super("Maden", player, new Snake(), null, 5);
    }

    @Override
    public boolean allEnemiesDefeated() {
        return false;
    }

    @Override
    public boolean combat(int obsNumber) {
        Random rand = new Random();
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);

            boolean playerStarts = rand.nextBoolean(); // %50 şans ile oyuncu veya canavar başlar

            while (this.getPlayer().getHealthy() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat = input.nextLine().toUpperCase();

                if (selectCombat.equals("V")) {
                    if (playerStarts) {
                        // Oyuncu vurur
                        System.out.println("Siz vurdunuz!");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println("Canavar size vurdu!");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamage);
                            afterHit();
                        }
                    } else {
                        // Canavar vurur
                        System.out.println("Canavar size vurdu!");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamage);
                        afterHit();

                        if (this.getPlayer().getHealthy() > 0) {
                            System.out.println("Siz vurdunuz!");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }
                    // Bir sonraki turda ilk hamleyi diğer taraf yapar
                    playerStarts = !playerStarts;
                } else {
                    return false; // Kaçmayı seçti
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealthy()) {
                System.out.println("Düşmanı yendiniz!");
                awardPlayer();
            } else {
                return false; // Oyuncu öldü
            }
        }
        return true; // Tüm canavarlar yenildi
    }

    private void awardPlayer() {
        Random rand = new Random();
        int chance = rand.nextInt(100);

        if (chance < 25) {
            // Para kazanma ihtimali
            chance = rand.nextInt(100);
            int money = 0;
            if (chance < 50) {
                money = 1;
            } else if (chance < 80) {
                money = 5;
            } else {
                money = 10;
            }
            System.out.println(money + " para kazandınız!");
            this.getPlayer().setMoney(this.getPlayer().getMoney() + money);
        } else if (chance < 70) {
            // Silah kazanma ihtimali
            chance = rand.nextInt(100);
            Weapon weapon = null;
            if (chance < 50) {
                weapon = Weapon.getWeaponObjByID(1); // Tabanca
            } else if (chance < 80) {
                weapon = Weapon.getWeaponObjByID(2); // Kılıç
            } else {
                weapon = Weapon.getWeaponObjByID(3); // Tüfek
            }
            System.out.println(weapon.getName() + " kazandınız!");
            this.getPlayer().getInventory().setWeapon(weapon);
        } else if (chance < 85) {
            // Zırh kazanma ihtimali
            chance = rand.nextInt(100);
            Armor armor = null;
            if (chance < 50) {
                armor = Armor.getArmorObjByID(1); // Hafif Zırh
            } else if (chance < 80) {
                armor = Armor.getArmorObjByID(2); // Orta Zırh
            } else {
                armor = Armor.getArmorObjByID(3); // Ağır Zırh
            }
            System.out.println(armor.getName() + " kazandınız!");
            this.getPlayer().getInventory().setArmor(armor);
        } else {
            System.out.println("Hiçbir şey kazanamadınız.");
        }
    }
}

