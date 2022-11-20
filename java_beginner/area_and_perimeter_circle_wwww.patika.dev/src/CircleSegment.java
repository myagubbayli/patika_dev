import java.util.Scanner;

public class CircleSegment {
    public static void main(String[] args) {
        // Define variables
        int radius, angle_alfa;
        double circle_sector, pi = 3.14;
        // Scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Please give radius: ");
        radius = input.nextInt();
        System.out.print("Please give measure of the central angle: ");
        angle_alfa = input.nextInt();
        // Calculations
        circle_sector = (pi * (radius * radius) * angle_alfa) / 360;

        System.out.print("Area of the circle sector: " + circle_sector);
    }
}
