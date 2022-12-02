public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematic", "MAT101", 70);
        Course physics = new Course("Physics", "PHY101", 20);
        Course chemistry = new Course("Chemistry", "CHE101", 100);

        int[] myNotes = {math.note, physics.note, chemistry.note};

        Calculate.calculateAverage(myNotes);
    }
}