import Location.*;
import Location.BattleLocation.Cave;
import Location.BattleLocation.Forest;
import Location.BattleLocation.Mine;
import Location.BattleLocation.River;
import Location.NormalLocation.SafeHouse;
import Location.NormalLocation.ToolStore;
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
        System.out.println("---------------------------------------------------------------");
        player.selectChar();
        
        Location location = null;

        while (true) {
            int rewardCounter = 0;

            player.printInfo();
            System.out.println("Regions: ");
            System.out.println("1 - SafeHouse --> This is a safe house for you, there are no enemies!");
            System.out.println("2 - Toolstore --> You can buy Weapon or Armor!");
            System.out.println("3 - Cave      --> <Present: Food>, be careful, the Zombie may appear!");
            System.out.println("4 - Forest    --> <Present: Firewood>, be careful, the Vampire may appear!");
            System.out.println("5 - River     --> <Present: Water>, be careful, the Bear may appear!");
            System.out.println("6 - Mine      --> <Present: Random>, be careful, the Snake may appear!");
            System.out.println("0 - EXIT      --> End the Game!");

            System.out.print("Please select the region you want to go to: ");
            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);   
                    break; 
                default:
                    System.out.println("Please enter a valid region!");
            }

            for (String reward : player.getInventory().getReward()) {
                if (reward != null) {
                    rewardCounter++;
                }
            }

            if (selectLoc == 1 && rewardCounter == 3) {
                System.out.println("CONGRATS! You won the game!");
                break;
            }
            

            if (location == null) {
                System.out.println("You quickly gave up on this dark and foggy island!");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
}
