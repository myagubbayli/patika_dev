public class User {
    public String name;
    public static int counter;

    static {
        System.out.println("2. Static Code Block");
        int random = (int) (Math.random() * 10);
        System.out.println("3. Random number: " + random);
        counter = random;
        System.out.println("4. Counter value initial " + counter);
    }

    public User(String name) {
        this.name = name;
        counter++;
        System.out.println("New counter value: " + counter);
    }
}
