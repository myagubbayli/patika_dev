import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        int heat;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Input temperature: ");
        heat = input.nextInt();
        // Calculations
        if (heat < 5) {
            System.out.println("You can do ski!");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("You can go to the Cinema!");
            }
            if (heat >= 10){
                System.out.println("You can go to the Picnic!");
            }
        } else {
            System.out.println("You can go to the Swim!");
        }
    }
}