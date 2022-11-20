import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int b, total = 0;
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number != 0) {
            b = number % 10;
            total += b;
            number /= 10;
        }
        System.out.println("Total: " + total);
    }
}