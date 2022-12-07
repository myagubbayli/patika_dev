package Location.NormalLocation;

import Inventory.*;
import Player.Player;

public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the Store!");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Weapons");
            System.out.println("2 - Armors");
            System.out.println("3 - Exit");
            System.out.print("Your choice: ");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Invalid value, enter again: ");
                selectCase = input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("See you soon!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + " <Money: " +
                    w.getPrice() + ", Damage: " + w.getDamage() + ">");
        }
        System.out.println("Press 0 for Exit!");
    }

    public void buyWeapon() {
        System.out.print("Select a weapon: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Invalid value, enter again: ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You don't have enough money!");
                } else {
                    // The area where the purchase took place
                    System.out.println("You bought a gun " + selectedWeapon.getName());
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("Armors");
        for(Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() + " <Money : " + a.getPrice() +
                    ", Armor : " + a.getBlock() + " >");
        }
        System.out.println("Press 0 for Exit!");
    }

    public void buyArmor() {
        System.out.print("Choose an armor: ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Invalid value, enter again: ");
            selectArmorID = input.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You don't have enough money!");
                } else {
                    // The area where the purchase took place
                    System.out.println("You bought an armor " + selectedArmor.getName());
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your balance: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }

    }
}
