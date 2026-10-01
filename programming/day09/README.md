# File Structure:



# Compile (all the files):
    -  javac -d bin $(find src -name "*.java")
or,
    -  javac -d bin src/students/Student.java src/generics/Box.java src/demo/ArrayAndArrayListDemo.java src/demo/LinkedListDemo.java src/demo/GenericsDemo.java

# Run: 

- java -cp bin demo.ArrayAndArrayListDemo
- java -cp bin demo.LinkedListDemo
- java -cp bin demo.GenericsDemo

# Questions for us:

1. We often need to manage many objects. What structure should we use, and why?


# Array

- An Array is a basic, native Java data structure. Elements are stored in sequential, contiguous memory locations.

- **When to use:** Use when you know the exact size of the collection in advance and need ultra-fast direct index access.

- **Limitation:** Once initialized, its size cannot be changed. To resize, you must manually create a new array and copy elements over.

# ArrayList

- **easy explanation**: An ArrayList is a resizable array.

- An ArrayList is a class in the **Java Collections Framework** that wraps around a native array. 
- It automatically handles resizing by allocating a larger underlying array (usually 50% to 100% larger) and copying items over whenever it gets full.

- **When to use:** This should be your default choice for **an ordered collection**. It is ideal for scenarios where you read data often but rarely insert or delete items from the middle.

- **Limitation:** Inserting or deleting an element anywhere except the very end forces the array to shift all subsequent elements in memory, which is inefficient (O(n)).

# LinkedList

- A LinkedList stores its data as a chain of individual "nodes". 

- In Java, it is implemented as a doubly linked list, meaning each node contains the data, a pointer to the next node, and a pointer to the previous node.

- **When to use:** Use when you need to frequently add or remove elements at the beginning or middle of the list, or when implementing Queues and Deques. If you already have an iterator positioned at a specific node, insertion/deletion is instantaneous (O(1)).

- **Limitation:** It does not support random access. Finding an element at index 50 requires starting at the beginning (or end) and manually counting through 50 links (O(n)). It also suffers from poor CPU cache locality because nodes are scattered across memory.

# Relevant Information:

| Array                | ArrayList            |
| -------------------- | -------------------- |
| `Student[]`          | `ArrayList<Student>` |
| Fixed size           | Grows/shrinks        |
| `students[0]`        | `students.get(0)`    |
| `students[0] = s`    | `students.set(0, s)` |
| `students.length`    | `students.size()`    |
| No direct `add()`    | `students.add()`     |
| No direct `remove()` | `students.remove()`  |




# Reading References:

- https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
- https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
- https://www.geeksforgeeks.org/dsa/linked-list-data-structure/
- https://dev.to/turpp/a-little-about-arrays-arraylist-linkedlist-and-hashmaps-47i3
