import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveDataToAFile{

     /*
     * Notice that saveDataToAFile(...) no longer requires
     * a Student or Faculty object. Instead, it accepts any
     * object whose type is Savable.
     *
     * Therefore, this method can also work with future classes
     * such as Staff, Parent, Car, etc., as long as those classes
     * implement the Savable interface.
     *
     * This demonstrates the Open/Closed Principle:
     *
     * CLOSED for modification:
     * We do not need to modify this method when a new Savable
     * class is introduced.
     *
     * OPEN for extension:
     * We can extend our program by introducing new classes
     * that implement Savable, and this method can work with them.
     */
    
    public static void saveDataToAFile(String path, String filename, Savable sobj) {

        String fileName = path + "/" + filename + ".txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(sobj.getDataToSave());
            System.out.println("Information saved to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the file.");
        }
    }
}


