import java.util.Scanner;

public class CoursePassExercise {
    public static void main(String[] args) {
        // Define variables
        int math, physics, turkish, chemistry, music;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Math score: ");
        math = input.nextInt();
        if (math < 0 || math > 100) {
            math = 0;
        }

        System.out.print("Physics score: ");
        physics = input.nextInt();
        if (physics < 0 || physics > 100) {
            physics = 0;
        }

        System.out.print("Turkish score: ");
        turkish = input.nextInt();
        if (turkish < 0 || turkish > 100) {
            turkish = 0;
        }

        System.out.print("Chemistry score: ");
        chemistry = input.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            chemistry = 0;
        }

        System.out.print("Music score: ");
        music = input.nextInt();
        if (music < 0 || music > 100) {
            music = 0;
        }
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