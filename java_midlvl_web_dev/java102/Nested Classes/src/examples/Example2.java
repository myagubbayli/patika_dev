package src.examples;

public class Example2 {
    private int number = 10;
    
    public void run() {
        System.out.println(number);
        Inner inner = new Inner();
        inner.run();
        System.out.println(number);
    }

    class Inner {
        public void run() {
            number++;
        }
    }
}
