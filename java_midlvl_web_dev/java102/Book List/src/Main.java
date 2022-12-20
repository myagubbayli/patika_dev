import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925"));
        books.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960"));
        books.add(new Book("Pride and Prejudice", 279, "Jane Austen", "1813"));
        books.add(new Book("The Catcher in the Rye", 214, "J.D. Salinger", "1951"));
        books.add(new Book("The Alchemist", 197, "Paulo Coelho", "1988"));
        books.add(new Book("The Little Prince", 111, "Antoine de Saint-Exupéry", "1943"));
        books.add(new Book("The Picture of Dorian Gray", 254, "Oscar Wilde", "1890"));
        books.add(new Book("The Death of Ivan Ilyich", 152, "Leo Tolstoy", "1886"));
        books.add(new Book("The Grapes of Wrath", 464, "John Steinbeck", "1939"));
        books.add(new Book("One Hundred Years of Solitude", 417, "Gabriel García Márquez", "1967"));

        for (Book book : books) {
            System.out.println(book.getName());
        }

        Map<String, String> authorToBookMap = books.stream()
                .collect(Collectors.toMap(Book::getAuthor, Book::getName));

        for (Map.Entry<String, String> entry : authorToBookMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        List<Book> longBooks = books.stream()
                .filter(book -> book.getPageNumber() > 100)
                .collect(Collectors.toList());

        for (Book book : longBooks) {
            System.out.println(book.getName());
        }
    }
}