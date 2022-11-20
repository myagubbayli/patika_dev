import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        int math, physics, turkish, chemistry, music;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Math score: ");
        math = input.nextInt();

        System.out.print("Physics score: ");
        physics = input.nextInt();

        System.out.print("Turkish score: ");
        turkish = input.nextInt();

        System.out.print("Chemistry score: ");
        chemistry = input.nextInt();

        System.out.print("Music score: ");
        music = input.nextInt();
        // Calculations
        double average = (math + physics + turkish + chemistry + music) / 5;
        if (average <= 55) {
            System.out.println("You can't pass the class, see you next year!");
        } else {
            System.out.println("Congrats you passed the class!");
        }

        System.out.println("Your average score: " + average);
    }
}