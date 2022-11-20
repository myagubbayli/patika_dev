import java.util.Scanner;

public class NumberPowersExercise {
    public static void main(String[] args) {
        // define variable
        int n;
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Give edge number: ");
        n = input.nextInt();

        for(int i = 1, j = 1; i < n || j < n; i *= 4, j *= 5) {
            if (i == 1) continue;
            if (i > n) continue;
            System.out.println("Powers of 4: " + i);
            if (j > n) continue;
            System.out.println("Powers of 5: " + j);
        }
    }
}
