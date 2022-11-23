public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "FZK101", "FZK");
        Course chemistry = new Course("Chemistry", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "140144015", mat, physics, chemistry);
        s1.addBulkExamNote(50, 20, 60, 90, 80, 30);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, physics, chemistry);
        s2.addBulkExamNote(30, 40, 60, 70, 20, 50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, physics, chemistry);
        s3.addBulkExamNote(45, 75, 85, 30, 55, 70);
        s3.isPass();
    }
}