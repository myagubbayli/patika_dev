import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        // user input
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        // loops
        for(int i = 0; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * rows - (2 * i + 1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}