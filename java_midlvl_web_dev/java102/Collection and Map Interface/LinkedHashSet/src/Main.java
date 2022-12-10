import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> days = new LinkedHashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Friday");

        days.remove("Friday");

        for (String day : days) {
            System.out.println(day);
        }

    }
}
