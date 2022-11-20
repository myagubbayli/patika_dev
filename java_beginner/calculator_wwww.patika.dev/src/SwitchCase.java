import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Define variables
        int n1, n2, select;
        //Scanner method
        Scanner input = new Scanner(System.in);
        //Inputs
        System.out.print("Input first number: ");
        n1 = input.nextInt();
        System.out.print("Input second number: ");
        n2 = input.nextInt();
        System.out.println("1-Adding\n2-Subtract\n3-Multiplication\n4-Division");
        System.out.print("Your selection: ");
        select = input.nextInt();
        // Switch-Case

        switch (select) {
            case 1:
                System.out.println("Adding total: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtract total: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication total: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Division total: " + (n1 / n2));
                } else {
                    System.out.println("Division can't be by 0!");
                }
                break;
            default:
                System.out.println("Your input isn't correct!");
                break;
        }
    }
}