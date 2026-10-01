package students;
public class Student{

    protected  String name;
    protected int id;
    protected float cgpa;

    public Student(String name, int id, float cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }


    public String toString() {
        return "name: " + name + "\n"  + "id: " + id;
    }

    public static void main(String[] args) {
        
        Student s1 = new Student("Alice", 111, 4.0f);
        Student s2 = new Student("Bob", 110, 4.0f);

        System.out.println(s1);
        System.out.println(s2);
    }


}