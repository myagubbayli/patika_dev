import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        double height, weight, index;
        // Scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Input your height: ");
        height = input.nextDouble();
        System.out.print("Input your weight: ");
        weight = input.nextDouble();
        // Calculations
        index = (weight) / (height * height);
        // Output
        System.out.print("Your body mass index is: " + index);

    }
}