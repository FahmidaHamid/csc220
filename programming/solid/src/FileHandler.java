import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileHandler {

    public static void saveToFile(String path , Student s) {

        String fileName = path + "/" + s.name + "_" + s.id + ".txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Student Name: " + s.name);
            writer.println("Student ID: " + s.id);
            writer.println("Student Email: " + s.email);
            writer.println("Current CGPA: " + s.cgpa);

            System.out.println("Student information saved to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the file.");
        }
    }

}
