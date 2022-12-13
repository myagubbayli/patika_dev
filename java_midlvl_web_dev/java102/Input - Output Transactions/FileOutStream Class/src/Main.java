import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String writing = "\nOutput ogreniyorum.\nPatika dev";
        try {
            File file = new File("patika.txt");
            FileOutputStream output = new FileOutputStream(file, true);
            byte[] writingByte = writing.getBytes();
            output.write(writingByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}