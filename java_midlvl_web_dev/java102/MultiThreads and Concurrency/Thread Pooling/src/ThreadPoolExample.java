import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 5 worker threads
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // Submit multiple tasks for execution
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            threadPool.submit(new Runnable() {
                public void run() {
                    // Perform task with taskId
                    System.out.println(taskId);
                }
            });
        }

        // Shut down the thread pool
        threadPool.shutdown();
    }
}