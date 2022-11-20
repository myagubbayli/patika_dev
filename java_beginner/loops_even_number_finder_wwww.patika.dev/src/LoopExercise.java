import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        // define variable
        int k, total = 0, total_number = 0;
        double average = 0.0;
        // scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Give number: ");
        k = input.nextInt();

        for(int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4== 0) {
                if (i == 0) continue;
                total += i;
                total_number++;
            }
        }
        average = total / total_number;
        System.out.println("Average: " + average);
    }
}
