import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrates how to read structured data from a text file using Scanner.
 *
 * Each record in the input file contains a student's name and score.
 * The program reads these values using next() and nextInt() and displays
 * them on the console.
 *
 * This example also demonstrates:
 * - opening a file using Scanner and File
 * - processing file contents with a loop
 * - using the throws keyword
 * - handling FileNotFoundException, a checked exception
 * - closing the file after reading
 *
 * @author Fahmida Hamid
 * @version 1.0
 */


public class FileDemo1 {

    public static void readFile(String filename)
            throws FileNotFoundException {

        Scanner input = new Scanner(new File(filename));

        while (input.hasNextLine()) {
            // String line = input.nextLine();
            // System.out.println(line);

            String name = input.next();
            int score = input.nextInt();

        System.out.println(name + " -> " + score);
        }

        input.close();
    }

    public static void main(String[] args) {

        try {
            readFile("students2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to find the file.");
        }
    }
}

/* Example 1
 *  File structure is simple: each line contains one information
 *  while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        } 
 */

/*
Example 02: file structure is slightly complicated. it may contain more than
one information (or more than one type of information)

Alice 92
Bob 85
Carlos 97
Diana 78

while (input.hasNextLine()) {
            String name = input.next();
            int score = input.nextInt();

        System.out.println(name + " -> " + score);


*/