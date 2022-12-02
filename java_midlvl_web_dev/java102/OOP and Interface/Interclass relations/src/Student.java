public class Student {
    private String name;
    private String username;
    private String idno;
    private String address;
    private int note;

    public Student(String name, String username, String idno, String address, int note) {
        this.name = name;
        this.username = username;
        this.idno = idno;
        this.address = address;
        if (note > 100 || note < 0) {
            note = 0;
        }
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note > 100 || note < 0) {
            note = 0;
        }
        this.note = note;
    }
}
