import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                return o1.compareTo(o2);
            }
            
        });

        q.add("Muhammed");
        q.add("Yagubbayli");
        q.add("Farid");
        q.add("Maryam");

        System.out.println(q.element());
    }
}