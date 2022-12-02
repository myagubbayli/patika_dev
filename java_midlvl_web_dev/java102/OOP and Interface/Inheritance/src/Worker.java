public class Worker {
    private String nameLastName;
    private String phoneNumber;
    private String email;

    public Worker(String nameLastName, String phoneNumber, String email) {
        this.nameLastName = nameLastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void enter() {
        System.out.println(this.getNameLastName() + " entered to the university!");
    }

    public void enter(String enteringTime, String exitTime) {
        System.out.println(this.getNameLastName() + " entered at " + enteringTime + " and will exit at: " + exitTime);
    }

    public void exit() {
        System.out.println(this.getNameLastName() + " left the university!");
    }

    public void diningHall() {
        System.out.println(this.getNameLastName() + " entered to the dining hall!");
    }

}
