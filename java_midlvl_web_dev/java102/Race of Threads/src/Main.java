import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of integers from 1 to 10000
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // Divide the list into 4 equal parts of 2500 elements
        int size = numbers.size() / 4;
        List<List<Integer>> parts = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i += size) {
            parts.add(
                numbers.subList(
                    i, 
                    Math.min(i + size, numbers.size())
                )
            );
        }

        // Create empty ArrayLists for even and odd numbers
        ArrayList<Integer>[] number_list = new ArrayList[2];
        number_list[0] = new ArrayList<>();
        number_list[1] = new ArrayList<>();

        // Create 4 threads to process the parts of the list 
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                // Process the part of the List assigned to this thread
                for (int j = 0; j < parts.get(threadIndex).size(); j++) {
                    int num = parts.get(threadIndex).get(j);
                    List<Integer> list_to_add = number_list[num % 2];

                    synchronized (list_to_add) {
                        list_to_add.add(num);
                    }
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < 4; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Even numbers: " + number_list[0]);
        System.out.println("Odd numbers: " + number_list[1]);


    }
}