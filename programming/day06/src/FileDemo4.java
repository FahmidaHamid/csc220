import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileDemo4 {

    public static void main(String[] args) {

        try {

            List<String> lines =
                    Files.readAllLines(
                            Path.of("/Users/fhamid/Desktop/students.txt")
                    );

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(
                    "Unable to read the file."
            );
        }
    }
}
