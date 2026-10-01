import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Student {

    protected String name;
    protected int id;
    protected float cgpa;
    protected String email;

    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.email = generateEmail();
    }

    public void printInfo() {
        System.out.println(name + " - " + id);
        System.out.println("email: " + email);
        System.out.println(" Your current cgpa is:" + cgpa);

    }

    public void saveToFile() {

        String fileName = "data/" + name + "_" + id + ".txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Student Name: " + name);
            writer.println("Student ID: " + id);
            writer.println("Student Email: " + email);
            writer.println("Current CGPA: " + cgpa);

            System.out.println("Student information saved to " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the file.");
        }
    }

    private String generateEmail() {
        int randomNumber = (int) (Math.random() * 100) % 10;
        String firstThree = name.substring(0, 3).toLowerCase();
        return firstThree + randomNumber + "@someuniv.edu";

    }

    public static void main(String[] args) {

        Student s1 = new Student("Bob", 1211, 3.8f);
        Student s2 = new Student("Alice", 1222, 3.95f);

        s1.printInfo();
        //s1.saveToFile();

        s2.printInfo();
        //s2.saveToFile();
    }
}