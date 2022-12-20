public class Book {
    private String name;
    private int pageNumber;
    private String author;
    private String publishedTime;

    // constructor to initialize the instance variables
    public Book(String name, int pageNumber, String author, String publishedTime) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publishedTime = publishedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

}
