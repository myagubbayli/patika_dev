import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src/patika.txt");
            // System.out.println("Usefull byte count: " + input.available());
            input.skip(10);
            int i = input.read();
            while (i != -1) {
                System.out.print((char)i);
                i = input.read();
            }
            input.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}