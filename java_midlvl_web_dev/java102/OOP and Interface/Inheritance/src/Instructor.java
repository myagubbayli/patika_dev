public class Instructor extends Academician {
    private String doorNo;

    public Instructor(String nameLastName, String phoneNumber, String email, String department, String title, String doorNo) {
        super(nameLastName, phoneNumber, email, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    @Override
    public void enter() {
        System.out.println(this.getNameLastName() + " Instructor entered from door B!");
    }
}
