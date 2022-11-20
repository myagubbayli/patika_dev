import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        int birthYear, module;
        String sign = "";
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Enter your birth year: ");
        birthYear = input.nextInt();
        // Calculations
        module = birthYear % 12;

        switch (module) {
            case 0:
                sign = "Monkey";
                break;
            case 1:
                sign = "Rooster";
                break;
            case 2:
                sign = "Dog";
                break;
            case 3:
                sign = "Pig";
                break;
            case 4:
                sign = "Rat";
                break;
            case 5:
                sign = "Ox";
                break;
            case 6:
                sign = "Kaplan";
                break;
            case 7:
                sign = "Rabbit";
                break;
            case 8:
                sign = "Dragon";
                break;
            case 9:
                sign = "Snake";
                break;
            case 10:
                sign = "Horse";
                break;
            case 11:
                sign = "Sheep";
                break;
        }
        System.out.println("Your Chinese Zodiac Sign: " + sign);
    }
}