import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Make variables
        int math, physics, chemistry, turkish, history, music;

        // Scanner class
        Scanner inp = new Scanner(System.in);

        // Take grades from user
        System.out.print("Math Grade: ");
        math = inp.nextInt();

        System.out.print("Physics Grade: ");
        physics = inp.nextInt();

        System.out.print("Chemistry Grade: ");
        chemistry = inp.nextInt();

        System.out.print("Turkish Grade: ");
        turkish = inp.nextInt();

        System.out.print("History Grade: ");
        history = inp.nextInt();

        System.out.print("Music Grade: ");
        music = inp.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        double result = total / 6.0;
        String passing_class = result > 60.0 ? "Passed the Class":"Failed in Class";
        System.out.println(result + " " + passing_class);
    }
}
