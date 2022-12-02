public class Main {
    // Encapsulation
    // Inheritance
    // Polimorphism
    // Abstraction

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord Of The Rings", -100);
        lordOfTheRings.setPageNumber(100);
        System.out.println(lordOfTheRings.getPageNumber());
    }
}