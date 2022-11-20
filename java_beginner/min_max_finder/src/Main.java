import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int number;
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("How many numbers are you gonna enter:");
        number = input.nextInt();
        int max_num = 0, min_num = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Number: ");
            int enteredNumber = input.nextInt();

            if (i == 1) {
                max_num = enteredNumber;
                min_num = enteredNumber;
            } else {
                if (enteredNumber > max_num) {
                    max_num = enteredNumber;
                } else if (enteredNumber < min_num){
                    min_num = enteredNumber;
                }
            }
        }
        System.out.println("Maximum number: " + max_num);
        System.out.println("Minimum number: " + min_num);
    }
}