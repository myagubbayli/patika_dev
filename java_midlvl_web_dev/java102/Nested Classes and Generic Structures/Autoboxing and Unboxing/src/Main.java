public class Main {
    public static void main(String[] args) {
        // Boxing 
        // Unboxing

        int a = 10;

        // Autoboxing
        Integer b = a; // Integer.valueOf(a)

        // Boxing
        Integer c = Integer.valueOf(a);

        // AutoUnboxing
        int d = c; // c.intValue()

        // Unboxing
        int i = c.intValue();

        System.out.println(d);
    }
}
