package Location;

import Player.Player;

public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the Store!");
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
                break;
            case 3:
                System.out.println("See you soon!");
                return true;
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + " <Money: " +
                    w.getPrice() + ", Damage: " + w.getDamage() + ">");
        }
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Invalid value, enter again: ");
            selectWeaponID = input.nextInt();
        }

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

    public void printArmor() {
        System.out.println("Armors");
    }
}
