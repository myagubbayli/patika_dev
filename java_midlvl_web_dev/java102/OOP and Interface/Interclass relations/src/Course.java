public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;

    public Course(String courseName, String courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    // Course uses a Student (Course Class is dependent on Student Class)

    public double calcAverage(Student[] students) {
        Student st4 = new Student("", "", "", "", 123);
        double average = 0.0;
        for (Student student : students) {
            average += student.getNote();
        }
        return average / students.length;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
