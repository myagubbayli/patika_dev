import java.util.Scanner;

public class WithWhile {
    public static void main(String[] args) {
        // greatest common divisor and lowest common multiple exercises
        // lowest common multiple = (n1 * n2) / greatest common divisor

        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Enter the number n1: ");
        int n1 = input.nextInt();

        System.out.print("Enter the number n2: ");
        int n2 = input.nextInt();
        int gcd = 1, k = n1;

        while(k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
                System.out.println("greatest common divisor: " + gcd);
                break;
            }
            k--;
        }
        int lcm = (n1 * n2) / gcd;
        System.out.println("lowest common multiple: " + lcm);

    }
}