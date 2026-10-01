import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveDataToAFile{

    public static void saveDataToAFile(String path, String filename, Student sdata) {

        String fileName = path + "/" + filename + ".txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Student Name: " + sdata.name);
            writer.println("Student ID: " + sdata.id);
            writer.println("Student Email: " + sdata.email);
            writer.println("Current CGPA: " + sdata.cgpa);

            System.out.println("Information saved to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the file.");
        }
    }
}

