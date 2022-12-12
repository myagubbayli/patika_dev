import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> sortByLetter = new TreeSet<>();

        Book book1 = new Book("CALI KUŞU", 406, "H.EDİP ADIVAR", 1922);
        Book book2 = new Book("GENİŞ ZAMANLAR", 114, "AYŞE KULİN", 1998);
        Book book3 = new Book("YAPRAK DÖKÜMÜ", 134, "R.NURİ GÜNTEKİN", 1930);
        Book book4 = new Book("INTİBAH", 176, "NAMIK KEMAL", 1874);

        sortByLetter.add(book1);
        sortByLetter.add(book2);
        sortByLetter.add(book3);
        sortByLetter.add(book4);

        for (Book books : sortByLetter) {
            System.out.println("Book name : " + books.getName() +
                               ", Book length: " + books.getLength() + 
                               ", Book author: " + books.getWriter() +
                               ", Book release date: " + books.getReleaseDate());
        }
        System.out.println("==================================================================================================");

        TreeSet<Book> sortByLength = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getLength() == o2.getLength()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getLength() - o2.getLength();
            }
            
        });

        sortByLength.add(book1);
        sortByLength.add(book2);
        sortByLength.add(book3);
        sortByLength.add(book4);

        for (Book booksPageNumber : sortByLength) {
            System.out.println("Book name : " + booksPageNumber.getName() +
                               ", Book length: " + booksPageNumber.getLength() + 
                               ", Book author: " + booksPageNumber.getWriter() +
                               ", Book release date: " + booksPageNumber.getReleaseDate());
        }


    }
}
