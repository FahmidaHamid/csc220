import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileDemo5 {

    public static void main(String[] args) {

        List<String> report = List.of(
                "CSC 220 Report",
                "Alice: 92",
                "Bob: 85",
                "Carlos: 97"
        );

        try {

            Files.write(
                    Path.of("report5.txt"),
                    report
            );

        } catch (IOException e) {

            System.out.println(
                    "Unable to write the file."
            );
        }
    }
}
