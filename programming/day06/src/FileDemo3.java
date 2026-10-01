import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo3 {


    public static void writeFile(String filename)
            throws IOException {

        PrintWriter output =
                new PrintWriter(new FileWriter(filename, true));

        output.println("New line added.");

        output.close();
    }

    public static void main(String[] args) {

        try {
            writeFile("report.txt");
        } catch (IOException e) {
            System.out.println("Unable to write to the file.");
            System.out.println(e.getMessage());
        }
    }
   
}
