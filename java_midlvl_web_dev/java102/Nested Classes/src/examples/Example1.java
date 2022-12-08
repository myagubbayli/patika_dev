package src.examples;

public class Example1 {
    
    public void run() {
        System.out.println("The method of the outer class worked");
        Inner inner = new Inner();
        inner.run();
    }

    class Inner {
        public void run() {
            System.out.println("The method of the inner class worked");
        }
    }
}
