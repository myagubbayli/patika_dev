import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Factorial number: ");
        int n = input.nextInt();
        int total = 1;

        for(int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println(n + ". Factorial = " + total);
    }
}