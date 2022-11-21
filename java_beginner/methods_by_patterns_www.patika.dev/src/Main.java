import java.util.Scanner;

public class Main {

    static void pattern(int number_N, boolean flag, int fix){
        System.out.print(number_N + " ");
        int result = 0;
        if (flag) {
            if (number_N <= 0) {
                flag = false;
                pattern(number_N + 5, flag, fix);
            } else {
                pattern(number_N - 5, flag, fix);
            }
        } else {
            if (fix == number_N) {
                return;
            } else {
                pattern(number_N + 5, flag, fix);
            }

        }

    }

    public static void main(String[] args) {
        // scanner method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int numberN = input.nextInt();
        boolean flag = true;
        int fix = numberN;

        pattern(numberN, flag, fix);

    }
}