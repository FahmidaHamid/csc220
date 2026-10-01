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
        this.email = EmailGenerator.generateEmail(name);
    }

    public void printInfo() {
        System.out.println(name + " - " + id);
        System.out.println("email: " + email);
        System.out.println(" Your current cgpa is:" + cgpa);

    }

    

    public static void main(String[] args) {

        Student s1 = new Student("Bob", 1211, 3.8f);
        Student s2 = new Student("Alice", 1222, 3.95f);

        s1.printInfo();
        FileHandler.saveToFile("student_data",s1);

        s2.printInfo();
        FileHandler.saveToFile("student_data", s2);
    }
}