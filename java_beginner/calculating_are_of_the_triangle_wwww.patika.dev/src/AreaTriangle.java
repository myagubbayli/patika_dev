import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        // Define variables
        int a, b, c, trianglePerimeter;
        double u, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Give first edge: ");
        a = input.nextInt();

        System.out.print("Give second edge: ");
        b = input.nextInt();

        System.out.print("Give third edge: ");
        c = input.nextInt();

        trianglePerimeter = a + b + c;

        u = trianglePerimeter / 2.0;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Your triangle area is: " + area);

    }
}
