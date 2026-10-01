package demo;
 import java.util.ArrayList;

import students.Student;

public class ArrayAndArrayListDemo {

    public static void main(String[] args) {

        int[] x = new int[3];

        x[0] = 1;
        x[1] = 2;
        x[2] = 3;

        System.out.println("Original array:");

        for (int value : x) {
            System.out.println(value);
        }


        int[] y = new int[10];

        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }

        y[3] = 23;

        System.out.println("\nLarger array:");

        for (int value : y) {
            System.out.println(value);
        }


        // Question:
        //
        // Wouldn't it be nice if Java could manage
        // this resizing for us?


        Student[] students = new Student[3];

        students[0] = new Student("Alice", 123, 4.0f);
        students[1] = new Student("Bob", 113, 4.0f);
        students[2] = new Student("Blake", 101, 4.0f);


        System.out.println("\nStudents in the array:");

        for (Student student : students) {
            System.out.println(student);
        }


        // Again, the size is fixed.

        System.out.println(
                "Number of spaces in students array: "
                + students.length
        );


        ArrayList<Student> other_students = new ArrayList<>();


        Student bob = new Student(
                "Bob",
                222,
                3.97f
        );


        other_students.add(bob);

        other_students.add(
                new Student("Bobby", 21102, 3.17f)
        );

        other_students.add(
                new Student("Allison", 1133, 2.7f)
        );


        // System.out.println("\nArrayList after adding students:");

        // for (Student student : other_students) {
        //     System.out.println(student);
        // }


        //  System.out.println(
        //         "\nNumber of students: "
        //         + other_students.size()
        // );


        
        Student firstStudent = other_students.get(0);

        System.out.println(
                "\nStudent at index 0: "
                + firstStudent
        );


        
        // other_students.set(
        //         1,
        //         new Student("Charlie", 555, 3.5f)
        // );


        // System.out.println("\nAfter set(1, ...):");

        // for (Student student : other_students) {
        //     System.out.println(student);
        // }

        // other_students.add(
        //         1,
        //         new Student("David", 444, 3.2f)
        // );


        // System.out.println("\nAfter inserting David at index 1:");

        // for (Student student : other_students) {
        //     System.out.println(student);
        // }



        // =========================================================
        // PART 4: REMOVE
        // =========================================================


        // Student removedStudent = other_students.remove(1);

        // System.out.println(
        //         "\nRemoved student: "
        //         + removedStudent
        // );


        // System.out.println("\nAfter remove(1):");

        // for (Student student : other_students) {
        //     System.out.println(student);
        // }



        // boolean removed = other_students.remove(bob);
                
        // System.out.println(
        //         "\nWas Bob removed? "
        //         + removed
        // );


        // System.out.println("\nAfter removing Bob:");

        // for (Student student : other_students) {
        //     System.out.println(student);
        // }

        /*
        Try removing the student nemed 'David'>> 
        //boolean removed = other_students.remove(new Student("David", 444, 3.2f));

        */

        
    }
}