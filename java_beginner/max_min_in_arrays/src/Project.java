import java.util.Scanner;
import java.util.Arrays;

public class Project {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number, greaterNumber, lowerNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        number = input.nextInt();

        Arrays.sort(list);
        Arrays.toString(list);
        for (int i = 1; i < list.length; i++) {
            if (number > list[i - 1] && number < list[i]) {
                System.out.println("Closer lower number: " + list[i - 1]);
                System.out.println("Closer greater number: " + list[i]);
            }
        }
    }
}
