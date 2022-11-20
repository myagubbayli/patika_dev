import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define variables
        int a;
        // scanner method
        Scanner input = new Scanner(System.in);
        // user inputs
        System.out.print("Give input number: ");
        a = input.nextInt();
        // loop
        for(int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}