import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length n: ");
        int[] arrayN = new int[input.nextInt()];

        int arrayLength = arrayN.length;
        int[] sortedArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Enter array element " + (i + 1) + ":");
            Scanner arrayElement = new Scanner(System.in);
            sortedArray[i] = arrayElement.nextInt();
        }
        Arrays.sort(sortedArray);

        System.out.print("Arrangement: ");
        for (int n: sortedArray) {
            System.out.print(n + " ");
        }

    }
}