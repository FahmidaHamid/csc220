import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileDemo2 {

    public static void writeFile(String filename)
            throws FileNotFoundException {

        PrintWriter output = new PrintWriter(filename);

        output.println("CSC 220 Student Report");
        output.println("----------------------");
        output.println("Alice: 92");
        output.println("Bob: 85");

        output.close();
    }

    public static void main(String[] args) {

        try {
            writeFile("report.txt");
            System.out.println("File created successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Unable to create the file.");
            System.out.println(e.getMessage());
        }
    }
}