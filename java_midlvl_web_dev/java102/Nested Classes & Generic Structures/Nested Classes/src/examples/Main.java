package src.examples;

public class Main {
    public static void main(String[] args) {
        Example1 example = new Example1();
        example.run();

        Example2 example2 = new Example2();
        example2.run();

        Example3.Inner inner = new Example3.Inner();
        inner.run();
    }
}
