import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try {
        //     FileReader readfile = new FileReader("patika.txt");
        //     BufferedReader readBuff = new BufferedReader(readfile);
        //     String line = readBuff.readLine();
            
        //     while (line != null) {
        //         System.out.println(line);
        //         line = readBuff.readLine();
        //     }
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     System.out.println(e.getMessage());
        // }

        String data = "Java Öğreniyorum";
        File file = new File("output.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter fileBuff = new BufferedWriter(fileWriter);

            fileBuff.write(data);

            fileBuff.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}