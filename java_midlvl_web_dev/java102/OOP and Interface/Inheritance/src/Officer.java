public class Officer extends Worker {
    private String squad;
    private String shift;

    public Officer(String nameLastName, String phoneNumber, String email, String squad, String shift) {
        super(nameLastName, phoneNumber, email);
        this.squad = squad;
        this.shift = shift;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getNameLastName() + " officer doing his work!");
    }
}
