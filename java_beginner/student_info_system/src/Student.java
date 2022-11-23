public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int matWritten, int matOral, int physicsWritten, int physicsOral, int chemistryWritten, int chemistryOral) {
        if (matWritten >= 0 && matWritten <= 100 && matOral >= 0 && matOral <= 100) {
            this.mat.note = matWritten;
            this.mat.oralNote = matOral;
            this.mat.totalNote = (int) (0.80 * this.mat.note + 0.20 * this.mat.oralNote);
        }
        if (physicsWritten >= 0 && physicsWritten <= 100 && physicsOral >= 0 && physicsOral <= 100) {
            this.physics.note = physicsWritten;
            this.physics.oralNote = physicsOral;
            this.physics.totalNote = (int) (0.80 * this.physics.note + 0.20 * this.physics.oralNote);
        }
        if (chemistryWritten >= 0 && chemistryWritten <= 100 && chemistryOral >= 0 && chemistryOral <= 100) {
            this.chemistry.note = chemistryWritten;
            this.chemistry.oralNote = chemistryOral;
            this.chemistry.totalNote = (int) (0.80 * this.chemistry.note + 0.20 * this.chemistry.oralNote);
        }
    }

    public void isPass() {
        if(this.mat.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average: " + this.average);
            if (this.isPass) {
                System.out.println("Passed the class! ");
            } else {
                System.out.println("Failed the class!");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.mat.totalNote + this.physics.totalNote + this.chemistry.totalNote) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("==============================");
        System.out.println("Student: " + this.name);
        System.out.println("Math Written Note (%80): " + this.mat.note + "|| Math Oral Note (%20): " + this.mat.oralNote);
        System.out.println("Math average note: " + this.mat.totalNote);
        System.out.println("Physics Written Note (%80): " + this.physics.note + "|| Physics Oral Note (%20): " + this.physics.oralNote);
        System.out.println("Physics average note: " + this.physics.totalNote);
        System.out.println("Chemistry Written Note (%80): " + this.chemistry.note + "|| Chemistry Oral Note (%20): " + this.chemistry.oralNote);
        System.out.println("Chemistry average note: " + this.chemistry.totalNote);
    }
}
