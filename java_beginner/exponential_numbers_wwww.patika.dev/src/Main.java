import java.util.Scanner;

public class Main {
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

        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.println("Result: " + total);
    }
}