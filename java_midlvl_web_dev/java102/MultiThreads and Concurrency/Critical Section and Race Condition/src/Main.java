import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic = new OrderMatic();
        List<Thread> transactions = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(oMatic);
            transactions.add(t);
            t.start();
        }

        for (Thread t : transactions) {
            t.join();
        }

        System.out.println(oMatic.getOrderNo());
    }
}