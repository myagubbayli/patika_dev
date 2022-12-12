import java.util.Scanner;

public class Store {
    Scanner scan = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("PatikaStore Product Management Panel!");
            System.out.println(" 1 - Notebook Transactions\n" +
                    " 2 - Mobile Phone Transactions\n" +
                    " 3 - List Brand\n" +
                    " 4 - Log out");
            System.out.print("Select the transaction number you want to do: ");

            switch (scan.nextInt()) {
                case 1:
                    Notebook notebook=new Notebook();
                    notebook.menu();
                    break;
                case 2:
                    MobilePhone mobilePhone=new MobilePhone();
                    mobilePhone.menu();
                    break;
                case 3:
                    Brand.printBrands();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz.");
                    break;
            }
        }
    }
}
