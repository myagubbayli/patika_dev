import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ankara");
        list.add("Istanbul");
        list.add("Amasya");
        list.add("Bolu");
        list.add("Siirt");

        // List<String> list2 = list.subList(2, 5);
        // System.out.println(list2);

        Object[] objectArr = list.toArray();
        String[] str = list.toArray(new String[0]);
        System.out.println(str[0]);
      
    }
}