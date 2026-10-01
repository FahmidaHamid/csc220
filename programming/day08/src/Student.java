public class Student implements Savable {

    protected String name;
    protected int id;
    protected float cgpa;
    protected String email;

    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.email = EmailGenerator.generateNewEmail(name, "callutheran");
    }

    @Override
    public String toString() {
        return "Student Name: " + name
                + "\nStudent ID: " + id
                + "\nEmail: " + email
                + "\nCurrent CGPA: " + cgpa;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Bob", 1211, 3.8f);
        Student s2 = new Student("Alice", 1222, 3.95f);

        System.out.println(s1);
        System.out.println(s2);
    }
}