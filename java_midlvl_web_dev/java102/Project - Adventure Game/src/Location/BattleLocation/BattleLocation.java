package Location.BattleLocation;
import Location.Location;
import Obstacle.Obstacle;
import Player.Player;
import Inventory.*;

import java.util.Random;

public class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    Random random = new Random();
    
    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        boolean mapStatus = true;

        for(String award : this.getPlayer().getInventory().getReward()) {
            if (award == this.getAward()) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Already won this battle, please choose another region!");
                System.out.println("-----------------------------------------------------------");
                mapStatus = false;
            }
            if (this.getAward() == "None")
                mapStatus = true;
        }

        if (mapStatus) {
            System.out.println("You in here now: " + this.getName());
            if (obsNumber == 1)
                System.out.println("Be aware! " + obsNumber + " " + this.getObstacle().getName() + " live here!");
            else
                System.out.println("Be aware! " + obsNumber + " " + this.getObstacle().getName() + "s" + " live here!");
            
            System.out.print("<F>ight or <R>un: ");
            String selectCase = input.nextLine().toUpperCase();
            if (selectCase.equals("F") && combat(obsNumber)) {
                    this.getPlayer().getInventory().setReward(this.getAward());
                    if (this.getObstacle().getName() == "Snake") 
                        System.out.println("Congratulations, the " + this.getName() + " is cleared");
                    else
                        System.out.println("Congratulations, the " + this.getName() + " is cleared, your award is: " + this.getAward());
                    return true;
            }
            if (this.getPlayer().getHealth() <= 0) {
                System.out.println("You died!");
                return false;
            }
        }
    
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);

            if (firstStrike()) {
                firstStrikePlayer();
                firstStrikeObstacle();

                while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                    System.out.print("<H>it or <R>un: ");
                    String selectCombat = input.nextLine().toUpperCase();
                    if (selectCombat.equals("H")) {
                        System.out.println("You hit !");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Monster hit you !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                }

            } else {
                while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                    firstStrikeObstacle();
                    firstStrikePlayer();
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("You defeated the enemy!");
                if (this.getObstacle().getName() == "Snake") {
                    snakeAward();
                } else {
                    System.out.println("You earn " + this.getObstacle().getAward() + " money!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                    System.out.println("Your current money: " + this.getPlayer().getMoney());
                } 
            } else {
                return false;
            }
        }
        return true;
    }

    public void snakeAward() {
        int randomAwardType = random.nextInt(100) + 1;

        if (randomAwardType < 15) {
            // Weapon
            int randomWeaponType = random.nextInt(100) + 1;
            if (randomWeaponType < 20) {
                snakeAwardWeapon(3);
            } else if (randomWeaponType >= 20 && randomWeaponType < 50) {
                snakeAwardWeapon(2);
            } else {
                snakeAwardWeapon(1);
            }

        } else if (randomAwardType >= 15 && randomAwardType < 30) {
            // Armor
            int randomArmorType = random.nextInt(100) + 1;
            if (randomArmorType < 20) {
                snakeAwardArmor(3);
            } else if (randomArmorType >= 20 && randomArmorType < 50) {
                snakeAwardArmor(2);
            } else {
                snakeAwardArmor(1);
            }
        } else if (randomAwardType >= 30 && randomAwardType < 55) {
            // coin
            int randomCoinType = random.nextInt(100) + 1;
            if (randomCoinType < 20) {
                this.getPlayer().setMoney(getPlayer().getMoney() + 10);
                System.out.println("You earn 10 money");
            } else if (randomCoinType >= 20 && randomCoinType < 50) {
                this.getPlayer().setMoney(getPlayer().getMoney() + 5);
                System.out.println("You earn 5 money");
            } else {
                this.getPlayer().setMoney(getPlayer().getMoney() + 1);
                System.out.println("You earn 1 money");
            }
            
        } else {
            System.out.println("You got nothing!");
        }
    }

    public void snakeAwardWeapon(int id) {
        Weapon weapon = Weapon.getWeaponObjByID(id);
        this.getPlayer().getInventory().setWeapon(weapon);
        System.out.println("You earn weapon: " + this.getPlayer().getInventory().getWeapon().getName());
    }

    public void snakeAwardArmor(int id) {
        Armor armor = Armor.getArmorObjByID(id);
        this.getPlayer().getInventory().setArmor(armor);
        System.out.println("You earn " + this.getPlayer().getInventory().getArmor().getName() + " Armor");
    }

    public boolean firstStrike() {
        int firstStrikeMove = random.nextInt(100) + 1;
        if (firstStrikeMove > 50)
            return true;
        else 
            return false;
    }

    public void firstStrikePlayer() {
        System.out.println("You hit !");
        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
        afterHit(); 
    }

    public void firstStrikeObstacle() {
        System.out.println("Monster hit you !");
        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
        if (obstacleDamage < 0) {
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit();
    }

    public void afterHit() {
        System.out.println("Your health: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Health is: " + this.getObstacle().getHealth());
        System.out.println();
    }
    public void playerStats() {
        System.out.println("Player values: ");
        System.out.println("--------------------------------------");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Blocking: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Money: " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Values");
        System.out.println("--------------------------------------");
        System.out.println("Health: " + this.getObstacle().getHealth());
        damageStats();
        if (this.getObstacle().getName() == "Snake") {
            System.out.println();
        } else {
            System.out.println("Reward: " + this.getObstacle().getAward());
            System.out.println();
        }
    }

    public void damageStats() {
        if (this.getObstacle().getName() == "Snake") {
            this.getObstacle().setDamage(randomDamageGenerate());
            System.out.println("Damage: " + this.getObstacle().getDamage());
        } else {
            System.out.println("Damage: " + this.getObstacle().getDamage());
        }
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public int randomDamageGenerate() {
        int randomDamage;
        randomDamage = random.nextInt(3) + 3;
        return randomDamage;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
