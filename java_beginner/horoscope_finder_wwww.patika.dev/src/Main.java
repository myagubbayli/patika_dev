import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        int month, day;
        String horoscope = "";
        boolean isError = false;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Your birth month: ");
        month = input.nextInt();

        System.out.print("Your birth day: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "Aquarius";
                    } else {
                        horoscope = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                System.out.println("Invalid month!");
        }

        if (isError) {
            System.out.println("Your input is not correct! Please try again!");
        } else {
            System.out.println("Hi, your horoscope is: " + horoscope);
        }
    }
}