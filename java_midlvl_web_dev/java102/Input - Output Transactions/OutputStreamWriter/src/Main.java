import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        String data = "ĞÜŞİ";
        try {
            FileOutputStream fileOutput = new FileOutputStream("output.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput);

            // fileOutput.write(data.getBytes());
            fileWriter.write(data);
            fileWriter.close();
            fileOutput.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}