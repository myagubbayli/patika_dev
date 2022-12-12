import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Polymorphism, Çok biçimlilik
        Queue<String> q = new LinkedList<>();
        q.add("Muhammed");
        q.add("Yagubbayli");
        q.offer("Patika");

        System.out.println(q.poll());

        Iterator<String> itr = q.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}