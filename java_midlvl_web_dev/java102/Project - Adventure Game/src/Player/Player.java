package Player;

import Inventory.Inventory;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public Player() {
        
    }

    public void selectChar() {
        // Since Player.GameChar is a superclass of Player.Samurai-Player.Knight-Player.Archer classes, we were able to use polymorphism here.
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        System.out.println("Characters: ");
        System.out.println("---------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID: " + gameChar.getId() + "\t Character: " + gameChar.getName() + "\t Damage: " + gameChar.getDamage() +
                    "\t Health: " + gameChar.getHealth() + "\t Money: " + gameChar.getMoney());
        }
        System.out.println("---------------------------------------------------------------");
        System.out.print("Please select a character: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Character: " + this.getName() + ", Damage: " + this.getDamage() +
                ", Health: " + this.getHealth() + ", Money: " + this.getMoney());
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());
    }

    public void printInfo() {
        System.out.print("Gun: " + this.getInventory().getWeapon().getName() +
                ", Armor: " + this.getInventory().getArmor().getName() +
                ", Defence: " + this.getInventory().getArmor().getBlock() +
                ", Damage: " + this.getTotalDamage() +
                ", Health: " + this.getHealth() +
                ", Money: " + this.getMoney());
        System.out.println();
        
        System.out.print("Award: ");

        for(String award : this.getInventory().getReward()) {
            if (award == null) {
                continue;
            } else {
                System.out.print(award + ", ");
            }
            
        }
        System.out.println();
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

}
