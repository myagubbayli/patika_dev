import Location.*;

import Player.Player;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Adventure Game!");
        System.out.println("Please enter a name: ");
        // String playerName = input.nextLine();
        Player player = new Player("Muhammed");
        System.out.println("Mr. " + player.getName() + ", Welcome to this dark and foggy island!");
        System.out.println("Everything that happens here is real!");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("Regions: ");
            System.out.println("1 - SafeHouse --> This is a safe house for you, there are no enemies!");
            System.out.println("2 - Toolstore --> You can buy Weapon or Armor!");
            System.out.print("Please select the region you want to go to: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
