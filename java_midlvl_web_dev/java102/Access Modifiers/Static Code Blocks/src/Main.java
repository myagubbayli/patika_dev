public class Main {
    public static void main(String[] args) {

        System.out.println("1. Program started! ");

        User u1 = new User("Mustafa Cetindag");
        User u2 = new User("Patika Dev");
        User u3 = new User("Kodluyoruz");

        System.out.println("Counter last value: " + User.counter);
        System.out.println("Program finished!");
    }
}