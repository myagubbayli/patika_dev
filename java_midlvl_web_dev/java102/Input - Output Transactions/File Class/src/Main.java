import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File directory = new File("test");
        String[] list = directory.list();

        for (String li : list) {
            System.out.println(li);
        }

        // File directory = new File("patika/test");
        // System.out.println(directory.mkdirs());


        // File file = new File("test/patika.txt");
        // try {
        //     if (file.createNewFile()) {
        //         System.out.println(file.getName() + " created!");
        //     } else {
        //         System.out.println(file.getName() + " already exist!");
        //     }
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     System.out.println(e.getMessage());
        // }
        // file.delete();
    
    }
}