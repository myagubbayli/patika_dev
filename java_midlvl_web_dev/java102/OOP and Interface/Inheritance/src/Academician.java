public class Academician extends Worker {
    private String department;
    private String title;
    public Academician(String nameLastName, String phoneNumber, String email, String department, String title) {
        super(nameLastName, phoneNumber, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public void enterLecture() {
        System.out.println(this.getNameLastName() + " entered the lecture!");
    }

    @Override
    public void enter() {
        System.out.println(this.getNameLastName() + " Academician entered from door A!");
    }
}
