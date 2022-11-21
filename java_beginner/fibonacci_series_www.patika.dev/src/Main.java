import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1, n1 = 1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("Give element of Fibonacci Series: ");
        int step = input.nextInt();
        int previous_number = 0, next_number = 1;
        System.out.print("0 ");
        for(int i = 1; i < step; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                n2 = n + n1;
                System.out.print(n2 + " ");
                n = n1;
                n1 = n2;
            }
        }
    }
}