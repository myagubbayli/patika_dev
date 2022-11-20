import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int k;
        // scanner method
        Scanner input = new Scanner(System.in);
        // user input
        System.out.print("Enter edge number: ");
        k = input.nextInt();
        // loop
        for(int i = 1; i <= k; i *= 2) {
            System.out.println(i);
        }

    }
}