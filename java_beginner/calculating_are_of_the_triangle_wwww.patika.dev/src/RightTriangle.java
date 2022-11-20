import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        // Define variables
        int a, b;
        double c;

        // Take values from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Give first edge: ");
        a = input.nextInt();
        System.out.print("Give second edge: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse: " + c);

    }
}