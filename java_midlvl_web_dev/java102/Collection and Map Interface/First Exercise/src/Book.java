import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String name;
    private int length;
    private String writer;
    private int releaseDate;

    public Book(String name, int length, String writer, int releaseDate) {
        this.name = name;
        this.length = length;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }
}