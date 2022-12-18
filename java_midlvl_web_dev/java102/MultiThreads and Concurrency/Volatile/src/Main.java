public class Main {
    private volatile int counter = 0;

    public void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        final Main example = new Main();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    example.incrementCounter();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    example.incrementCounter();
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // Handle exception
            System.out.println(e.getMessage());
        }

        // Print the final value of the counter
        System.out.println(example.getCounter());
    }
}