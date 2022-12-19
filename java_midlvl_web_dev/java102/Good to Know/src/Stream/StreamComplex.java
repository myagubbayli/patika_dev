package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComplex {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 20),
                new Person("Bob", 30),
                new Person("Charlie", 40),
                new Person("Dave", 50),
                new Person("Eve", 60));

        // Find the names of all people who are over 30 years old, sorted in ascending
        // order by age
        List<String> names = people.stream()
                .filter(p -> p.getAge() > 30)
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
