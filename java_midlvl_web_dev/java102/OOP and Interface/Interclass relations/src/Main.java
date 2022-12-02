public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mustafa", "Cetindag", "123", "AA", 85);
        Student st2 = new Student("Patika", "Dev", "2321", "BB", 85);
        Student st3 = new Student("Kodluyoruz", "Java102", "12312", "CC", 85);

        Instructor teacher = new Instructor("Mahmut", "Cetindag", "CENG");

        // Inheritance => is a
        // Composition, Aggregation
        // Course has a Instructor (A class has a teacher)
        Course math = new Course("MAT101", "MAT", teacher);
        System.out.println(math.getInstructor().getName());
        // Student[] stu = {st1, st2, st3};
        // System.out.println("Average: " + math.calcAverage(stu));
    }
}