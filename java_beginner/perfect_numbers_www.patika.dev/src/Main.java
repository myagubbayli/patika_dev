import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        int total = 0;

        for(int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                total += i;
            }
        }
        if (total == userInput) {
            System.out.println(userInput + " is Perfect number");
        } else {
            System.out.println(userInput + " is not Perfect number");
        }
    }
}