import java.io.FileWriter;
import java.io.IOException;

// import java.io.FileReader;
// import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try {
        //     FileReader readFile = new FileReader("patika.txt");

        //     int i = readFile.read();

        //     while (i != -1) {
        //         System.out.print((char) i);
        //         i = readFile.read();
        //     }
        //     readFile.close();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        String data = "JAVA ÖĞRENİYORUM !";

        try {
            FileWriter writerFile = new FileWriter("output.txt");
            writerFile.write(data);
            writerFile.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}