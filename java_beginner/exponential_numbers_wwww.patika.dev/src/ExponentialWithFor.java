import java.util.Scanner;

public class ExponentialWithFor {
    public static void main(String[] args) {
        // define variables
        int n, k;
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Number which gonna be exponential: ");
        n = input.nextInt();
        System.out.print("Number which gonna be in upper of exponential: ");
        k = input.nextInt();
        int total = 1;

        for(int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Result: " + total);
    }
}