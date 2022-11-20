import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int year;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Please enter year: ");
        year = input.nextInt();
        // Calculations
        if ((year / 100) % 4 != 0) {
            System.out.println(year + " is not an leap year!");
        } else if (year % 4 == 0){
            System.out.println(year + " is an leap year!");
        } else {
            System.out.println(year + " is not an leap year!");
        }
    }
}