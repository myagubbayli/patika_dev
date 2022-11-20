import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please give price without VAT: ");
        int withoutVat = input.nextInt();
        float vatPercent = 0.18f, withVat, vatPrice;

        withVat = withoutVat + withoutVat * vatPercent;
        vatPrice = withoutVat * vatPercent;

        System.out.println("Our price without VAT: " + withoutVat);
        System.out.println("Our VAT percent: " + (vatPercent * 100) + " %");
        System.out.println("Our price with VAT: " + withVat);
        System.out.println("Our VAT price: " + vatPrice);

    }
}