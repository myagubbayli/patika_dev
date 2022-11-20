import java.util.Scanner;

public class SumOfOddExercise {
    public static void main(String[] args) {
        // define variable
        int k = 0, total = 0;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // loop
        do {
            System.out.print("Give number: ");
            k = input.nextInt();
            if (k % 2 == 0 && k % 4 == 0) {
                total += k;
            }
        }while(k % 2 != 1);

        System.out.println("Result: " + total);
    }
}
