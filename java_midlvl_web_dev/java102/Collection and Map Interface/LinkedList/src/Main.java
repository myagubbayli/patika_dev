import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Muhammed");
        list.add("Yagubbayli");
        list.add("Muhammed");
        list.add("Java");
        list.add("102");

        list.remove(2);

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (String str : list) {
            System.out.println(str);
        }
    }
}