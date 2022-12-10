import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Your age is not acceptable!");
        }

        System.out.println("Your age is acceptable!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Age unacceptable!");
            System.out.println(e.toString());
        }
        
        System.out.println("Program ended!");
    }
}