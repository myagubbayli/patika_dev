import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        double pear, apple, tomatoes, banana, aubergine;
        double pear_price = 2.14, apple_price = 3.67, tomatoes_price = 1.11, banana_price = 0.95, aubergine_price = 5.00;
        double total_price;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // Inputs
        System.out.print("Kg of the pear: ");
        pear = input.nextDouble();
        System.out.print("Kg of the apple: ");
        apple = input.nextDouble();
        System.out.print("Kg of the tomatoes: ");
        tomatoes = input.nextDouble();
        System.out.print("Kg of the banana: ");
        banana = input.nextDouble();
        System.out.print("Kg of the aubergine: ");
        aubergine = input.nextDouble();
        // Calculations
        total_price = pear_price * pear + apple_price * apple + tomatoes_price * tomatoes + banana_price * banana +
                aubergine_price * aubergine;
        // Printing output
        System.out.print("Total price: " + total_price + " TL");
    }
}