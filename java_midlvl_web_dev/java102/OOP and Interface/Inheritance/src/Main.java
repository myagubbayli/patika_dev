public class Main {
    public static void main(String[] args) {
        Worker c1 = new Worker("Mustafa Cetindag", "0500000000", "info@patika.dev");

        Academician a1 = new Academician("Patika Dev", "5151115155", "bilgi@patika.dev", "CENG", "Dr.");
        Officer m1 = new Officer("Ali Veli", "45454354254", "a@patika.dev", "Data Processing", "09:00-18:00");

        Instructor in1 = new Instructor("Mahmut Cetindag", "0", "mahmut@patike.dev", "CENG", "Dr.", "110");

        // Method Overloading
        // in1.enter("10:00", "18:00");

        // Method Overriding
        in1.enter();
    }
}
