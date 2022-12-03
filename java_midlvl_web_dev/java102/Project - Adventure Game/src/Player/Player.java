package Player;

import Location.*;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
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
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());
    }

    public void printInfo() {
        System.out.println("Gun: " + this.getInventory().getWeapon().getName() + ", Damage: " + this.getDamage() +
                ", Health: " + this.getHealth() + ", Money: " + this.getMoney());
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
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

    public void setCharName() {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
