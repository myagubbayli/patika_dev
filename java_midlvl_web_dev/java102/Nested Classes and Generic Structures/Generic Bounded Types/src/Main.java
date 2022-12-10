public class Main {
    public static void main(String[] args) {
        // Integer, Double, Float extends Number

        A aObject = null;
        Nullable<A> n1 = new Nullable<>(aObject);
        // below example is not allowed bcs of bounded type for integer from extend Number
        // Nullable<String> n1 = new Nullable<>(str);
        n1.run(); 
    }
}