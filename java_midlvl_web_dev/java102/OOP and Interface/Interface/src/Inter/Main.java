package Inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.print("Give amount: ");
        double amount = info.nextDouble();

        System.out.print("Card no: ");
        String cardNumber = info.next();

        System.out.print("Expire date: ");
        String expireDate = info.next();

        System.out.print("Security code: ");
        String cvc = info.next();

        System.out.println("1. Bank A");
        System.out.println("2. Bank B");
        System.out.println("3. Bank C");
        System.out.print("Select Bank: ");
        int selectBank = info.nextInt();

        switch (selectBank) {
            case 1:
                ABank aPos = new ABank("Bank A", "8372372397283", "38273283728");
                aPos.connect("127.1.1.1");
                aPos.payment(amount, cardNumber, expireDate, cvc);
                break;
            case 2:
                BBank bPos = new BBank("Bank B", "8372372397283", "38273283728");
                bPos.connect("127.1.1.1");
                bPos.payment(amount, cardNumber, expireDate, cvc);
                break;
            default:
                System.out.println("Give valid bank!");
        }


    }
}