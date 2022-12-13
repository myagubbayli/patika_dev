import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// import java.io.FileInputStream;
// import java.io.BufferedInputStream;

public class Main {
    public static void main(String[] args) {

        // BufferedInputStream

        // try {
        //     FileInputStream fileInput = new FileInputStream("patika.txt");
        //     BufferedInputStream buffInput = new BufferedInputStream(fileInput);

        //     int i = buffInput.read();

        //     while (i != -1) {
        //         System.out.print((char) i);
        //         i = buffInput.read();
        //     }
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // BufferedOutputStream

        String data = "Java 102 Patika";

        try {
            FileOutputStream file = new FileOutputStream("patika.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(file);
            
            byte[] byteArray = data.getBytes();

            buffOutput.write(byteArray);
            buffOutput.close();
            file.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}