import java.util.Scanner;

public class IfElse {
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
        // If-else

        if (select == 1) {
            System.out.println("Adding total: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Subtract total: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Multiplication total: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Division total: " + (n1 / n2));
            } else {
                System.out.println("Division can't be by 0!");
            }
            
        } else {
            System.out.println("Your input isn't correct!");
        }

    }
}