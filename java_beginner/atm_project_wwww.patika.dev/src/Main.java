import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hi, Welcome to Kodluyoruz bank!");
                do {
                    System.out.println("1-Adding Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Balance Query\n" +
                            "4-Log out");
                    System.out.print("Please select the action you want to do: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Amount of money: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Amount of money: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Balance: " + balance);
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Tries: " + right);
                }
            }
        }
    }
}