import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Enter number N: ");
        int n = input.nextInt();
        double result = 0.0;

        for(double i = 1; i <= n; i++) {
            result += (1/i);
        }

        System.out.println(result);
    }
}