import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        // Define variables
        int radius;
        double circle_area, circle_perimeter, pi = 3.14;
        // Scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Give radius of the circle: ");
        radius = input.nextInt();
        // Calculations
        circle_area = pi * radius * radius;
        circle_perimeter = 2 * pi * radius;
        // Printing output
        System.out.println("Area of the circle: " + circle_area);
        System.out.print("Perimeter of the circle: " + circle_perimeter);
    }
}