package demo;
import java.util.LinkedList;

import students.Student;

public class LinkedListDemo {

    public static void main(String[] args) {

        // =========================================================
        // PART 1: CREATE A LINKEDLIST
        // =========================================================

        LinkedList<Student> llst = new LinkedList<Student>();

        llst.add(new Student("Alice", 1, 2.5f));
        llst.add(new Student("Bob", 2, 3.5f));
        llst.add(new Student("Alison", 3, 1.5f));
        llst.add(new Student("Ali", 4, 2.5f));


        // =========================================================
        // PART 2: PRINT THE LINKEDLIST
        // =========================================================

        System.out.println("Original LinkedList:");

        for (Student student : llst) {
            System.out.println(student);
        }


        // =========================================================
        // PART 3: SIZE
        // =========================================================

        System.out.println("\nSize: " + llst.size());


        // =========================================================
        // PART 4: ACCESS AN ELEMENT USING AN INDEX
        // =========================================================

        Student student = llst.get(2);

        System.out.println("\nStudent at index 2:");
        System.out.println(student);


        /*
         * IMPORTANT:
         *
         * LinkedList supports indexes, but internally it is
         * NOT organized like an ArrayList.
         *
         * Conceptually:
         *
         * Alice <--> Bob <--> Alison <--> Ali
         *
         * To find an element, Java may have to travel through
         * the links/nodes.
         *
         * Therefore, LinkedList is not ideal when our program
         * frequently accesses elements by index.
         */


        // =========================================================
        // PART 5: INSERT AT A SPECIFIC INDEX
        // =========================================================

        llst.add(
                2,
                new Student("Charlie", 5, 3.0f)
        );

        System.out.println("\nAfter adding Charlie at index 2:");

        for (Student s : llst) {
            System.out.println(s);
        }


        /*
         * Before:
         *
         * Alice <--> Bob <--> Alison <--> Ali
         *
         *
         * After:
         *
         * Alice <--> Bob <--> Charlie <--> Alison <--> Ali
         *
         *
         * Unlike an ArrayList, we don't need to shift a block
         * of elements to make space.
         *
         * However, Java still needs to FIND the requested
         * position first.
         */


        // =========================================================
        // PART 6: ADD TO THE BEGINNING
        // =========================================================

        llst.addFirst(
                new Student("David", 6, 3.7f)
        );

        System.out.println("\nAfter addFirst():");

        for (Student s : llst) {
            System.out.println(s);
        }


        /*
         * addFirst() adds an element to the beginning.
         *
         * Conceptually:
         *
         * David <--> Alice <--> Bob <--> Charlie <--> Alison <--> Ali
         */


        // =========================================================
        // PART 7: ADD TO THE END
        // =========================================================

        llst.addLast(
                new Student("Eva", 7, 3.9f)
        );

        System.out.println("\nAfter addLast():");

        for (Student s : llst) {
            System.out.println(s);
        }


        /*
         * Conceptually:
         *
         * David <--> Alice <--> Bob <--> Charlie
         *       <--> Alison <--> Ali <--> Eva
         */


        // =========================================================
        // PART 8: GET FIRST AND LAST
        // =========================================================

        Student firstStudent = llst.getFirst();
        Student lastStudent = llst.getLast();

        System.out.println("\nFirst student:");
        System.out.println(firstStudent);

        System.out.println("\nLast student:");
        System.out.println(lastStudent);


        // =========================================================
        // PART 9: REMOVE FROM THE BEGINNING
        // =========================================================

        Student removedFirst = llst.removeFirst();

        System.out.println("\nRemoved from beginning:");
        System.out.println(removedFirst);


        System.out.println("\nAfter removeFirst():");

        for (Student s : llst) {
            System.out.println(s);
        }


        // =========================================================
        // PART 10: REMOVE FROM THE END
        // =========================================================

        Student removedLast = llst.removeLast();

        System.out.println("\nRemoved from end:");
        System.out.println(removedLast);


        System.out.println("\nAfter removeLast():");

        for (Student s : llst) {
            System.out.println(s);
        }


        // =========================================================
        // PART 11: REMOVE USING AN INDEX
        // =========================================================

        Student removedStudent = llst.remove(1);

        System.out.println("\nRemoved student at index 1:");
        System.out.println(removedStudent);


        System.out.println("\nAfter remove(1):");

        for (Student s : llst) {
            System.out.println(s);
        }


        // =========================================================
        // PART 12: INVALID INDEX
        // =========================================================

        /*
         * 
         *
         * What do you think will happen?
         */

        // Student invalidStudent = llst.get(100);

        /*
         * Result:
         *
         * IndexOutOfBoundsException
         *
         * This connects back to our previous discussion
         * about exceptions.
         */


        // =========================================================
        // SUMMARY
        // =========================================================

        /*
         *
         * Useful LinkedList operations:
         *
         * llst.add(student);
         * llst.add(index, student);
         *
         * llst.addFirst(student);
         * llst.addLast(student);
         *
         * llst.get(index);
         * llst.getFirst();
         * llst.getLast();
         *
         * llst.remove(index);
         * llst.removeFirst();
         * llst.removeLast();
         *
         * llst.size();
         *
         *
         * ---------------------------------------------------------
         *
         * ARRAYLIST
         *
         * Conceptually:
         *
         * [ref][ref][ref][ref]
         *   ↓    ↓    ↓    ↓
         *
         * References are stored in an underlying array.
         *
         * + Fast access using an index
         * + Usually memory efficient
         * + Good when we frequently read/access elements
         *
         * - Inserting/removing in the beginning or middle
         *   may require elements to shift
         *
         *
         * ---------------------------------------------------------
         *
         * LINKEDLIST
         *
         * Conceptually:
         *
         * Alice <--> Bob <--> Alison <--> Ali
         *
         * The nodes do NOT need to be next to each other
         * in memory.
         *
         * They are connected using references.
         *
         * + No shifting of a block of elements when links change
         * + Efficient operations at the beginning/end
         *
         * - Accessing an arbitrary index can require traveling
         *   through the chain
         *
         * - Each node requires extra references
         *   (previous and next), so LinkedList generally has
         *   more memory overhead than ArrayList.
         *
         *
         * MAIN TAKEAWAY:
         *
         * There is no universally "best" data structure.
         *
         * We choose a data structure based on the operations
         * that our program needs to perform frequently.
         *
         */
    }
}