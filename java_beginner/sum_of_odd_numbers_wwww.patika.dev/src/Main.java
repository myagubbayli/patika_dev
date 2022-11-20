import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int n;
        int total = 0;
        // scanner method
        Scanner input = new Scanner(System.in);
        // loop
        do {
            System.out.println("Enter number:");
            n = input.nextInt();
            if (n % 2 == 1){
                total += n;
            }
        } while (n > 0);
        System.out.println("Total: " + total);
    }
}