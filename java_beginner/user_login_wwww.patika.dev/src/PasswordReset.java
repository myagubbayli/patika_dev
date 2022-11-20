import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        // Define variables
        String userName, password, passwordReset, newPassword;
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
            System.out.println("Do you want to reset your password?");
            System.out.println("1-Write yes\n2-Write no");
            passwordReset = input.nextLine();
            if (passwordReset.equals("yes")){
                System.out.print("Enter your new password: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Can't create new password, please give different password!");
                } else {
                    System.out.println("Your password created! ");
                }
            } else {
                System.out.println("Try another time, ty!");
            }
        }
    }
}