import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by SpizzyRich on 8/4/16.
 */

// Creating a method that reads a specific file.
public class ReadAFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader readThis = new FileReader("data.txt");
        System.out.println("We have made a FileReader");

        char[] data = new char[40];

        readThis.read(data);

        for (int i = 0; i < data.length; i++) {
// using print instead of println to string horizontally instead of vertically
            System.out.print(data[i]);
        }
// close a method to free up memory.
        readThis.close();
    }

}
