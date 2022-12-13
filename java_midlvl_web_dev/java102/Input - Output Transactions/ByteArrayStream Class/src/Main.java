import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // ByteInputStream

        // byte[] series = {1, 2, 3, 54, 66};
        // ByteArrayInputStream input = new ByteArrayInputStream(series, 2, 2);
        // System.out.println("Useful byte count: " + input.available());
        // input.skip(2); 
        // int i = input.read();
        // while (i != -1) {
        //     System.out.println(i);
        //     i = input.read();
        // }

        // try {
        //     input.close();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        // ByteOutputStream

        String data = "Java 102 Dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByteArray = data.getBytes();

        try {
            output.write(dataByteArray);
            String newData = output.toString();
            System.out.println(newData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}