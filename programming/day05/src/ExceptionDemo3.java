import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo3 {

public static void readFile(String filename) throws FileNotFoundException {

        Scanner fileInput = new Scanner(new File(filename));

        while (fileInput.hasNextLine()) {
            System.out.println(fileInput.nextLine());
        }

        fileInput.close();
    }



    public static void main(String[] args) {

        
        try {
            readFile("sample1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file could not be found.");
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

} 
    

