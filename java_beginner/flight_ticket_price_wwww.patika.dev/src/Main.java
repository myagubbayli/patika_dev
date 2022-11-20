import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define variables
        int distance, age, tripType;
        double normalPrice = 0, ageDiscount = 0, priceWdiscount = 0, withReturn = 0, total = 0;
        boolean isError = false;
        // Scanner method
        Scanner input = new Scanner(System.in);
        // User inputs
        System.out.print("Please enter your distance: ");
        distance = input.nextInt();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.print("Trip type:\n1-One way\n2-With return\nPlease enter your trip type: ");
        tripType = input.nextInt();
        // Calculations
        normalPrice = distance * 0.10;

        if (distance > 0 && age > 0 && (tripType >= 1 && tripType <= 2)) {
            if (age < 12) {
                ageDiscount = normalPrice * 0.50;
                priceWdiscount = normalPrice - ageDiscount;
            } else if (age >= 12 && age < 24) {
                ageDiscount = normalPrice * 0.10;
                priceWdiscount = normalPrice - ageDiscount;
            } else if (age > 65) {
                ageDiscount = normalPrice * 0.30;
                priceWdiscount = normalPrice - ageDiscount;
            } else {
                total = normalPrice;
            }
            if (age > 65 || age < 24){
                if (tripType == 2) {
                    withReturn = priceWdiscount * 0.20;
                    total = (priceWdiscount - withReturn) * 2;
                } else {
                    total = priceWdiscount * 2;
                }
            }
            System.out.println("Your total price: " + total + " TL");
        } else {
            System.out.println("Your input is wrong!");
        }



    }
}