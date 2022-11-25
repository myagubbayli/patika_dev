import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Make your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter number between 0-100: ");
                if (isWrong) {
                    right++;
                    System.out.println("You make a lot of wrong entering. Remaining rights: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("You will be deducted from your next wrong entry..");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congrats, right guess! Your guess: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Your guess is wrong!");
                if (selected > number) {
                    System.out.println(selected + " number is greeter than hidden number.");
                } else {
                    System.out.println(selected + " number is lower than hidden number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining rights: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You loss! ");
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }

    }
}