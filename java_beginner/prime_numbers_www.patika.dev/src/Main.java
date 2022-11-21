import java.util.Scanner;

public class Main {

    static int prime(int n, int k) {
        if (k == 1) {
            return 1;
        } else {
            if (n % k == 0) {
                return 0;
            } else {
                return prime(n, k - 1);
            }
        }
    }

    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int primeControl = prime(number, number / 2);

        if (primeControl == 1) {
            System.out.println(number + " is Prime number!");
        } else {
            System.out.println(number + " is not Prime number!");
        }
    }
}