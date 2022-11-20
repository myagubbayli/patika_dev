import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        String userName, password;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Username: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))){
            System.out.println("You logged in!");
        } else {
            System.out.println("Someting wrong!");
        }
    }
}