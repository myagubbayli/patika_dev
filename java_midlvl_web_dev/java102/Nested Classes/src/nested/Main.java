package src.nested;

public class Main {
    public static void main(String[] args) {
        // Nested Class 
        //     - Inner Class
        //         - static
        //         - non-static
        //     - Local Class
        //     - Anonymous Class

        // Out o = new Out();
        // Out.In inObject = o.getIn();
        // inObject.run();

        // Out.In.run();

        // Local l = new Local();
        // l.run();

        Anonymous a = new Anonymous() {
            @Override
            public void run() {
                System.out.println("An anonymously written run method");
                print();
            }

            public void print() {
                System.out.println("Print method");
            }
        };
        a.run(); 
    }
}
