import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program started !");
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 20;
        int c;
        int[] arr = new int[2];
        try {
            System.out.println("Dividing");
            System.out.println(b / a);
            System.out.println("Dividing ended");
            c = input.nextInt();
            arr[10] = 11;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error catched");
            System.out.println(e.getMessage()); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This part is definately going to work!");
        }
        System.out.println("Program ended !");
    }
}