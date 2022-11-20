import java.util.Scanner;

public class CombinationExercise {
    public static void main(String[] args) {
        // formula: C(n, r) = n! / (r! * (n - r)!)

        long n, r, total_n = 1, total_r = 1, total_nr = 1;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Give number n: ");
        n = input.nextInt();

        System.out.print("Give number r: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total_n *= i;
        }
        for (int j = 1; j <= r; j++) {
            total_r *= j;
        }
        for (int k = 1; k <= (n-r); k++){
            total_nr *= k;
        }
        long combination = total_n / (total_r * total_nr);
        System.out.println("Result of combination = " + combination);
    }
}
