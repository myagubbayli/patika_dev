public class Calculate {
    public static void calculateAverage(int[] notes) {
        double total = 0;
        for (int i : notes) {
            total += i;
        }

        double average = total / notes.length;

        System.out.println("Your average: " + average);
    }
}
