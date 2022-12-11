import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // a => 1723717231
        // b => 1283812382
        // f(x) = (x ^ 2) * xmod7 * lnx
        // f(5) = 12223
        // f(6) = 2213
        // h[1723717231] = a , f(a) => 1723717231
        
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(null);

        hSet.remove(10);
        // hSet.clear(); 
        // for (Integer number : hSet) {
        //     System.out.println(number);
        // }

        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
} 