import java.util.Scanner;

public class Main {
    static int exponential(int base, int exp) {
        if (exp == 0) return 1;
        return base * exponential(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give base number: ");
        int base = input.nextInt();
        System.out.print("Give exponent number: ");
        int exp = input.nextInt();

        System.out.println("Result: " + exponential(base, exp));
    }
}