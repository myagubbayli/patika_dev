package Inventory;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private String[] reward = new String[3];
    private int rewardCounter = 0;

    public Inventory() {
        // Initial values:
        this.weapon = new Weapon("Punch", -1,0, 0);
        this.armor = new Armor(-1, "Shred", 0,0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String[] getReward() {
        return reward;
    }

    public void setReward(String reward) {
       this.reward[rewardCounter] = reward;
       rewardCounter++;
    }

}
