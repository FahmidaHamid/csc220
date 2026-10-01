# File Structure
```text
.
|-- README.md
|-- CSC220_File_Operations_TODO.txt
|-- src
|   |-- FileDemo1.java
|   |-- FileDemo2.java
|   |-- FileDemo3.java
|   |-- FileDemo4.java
|   `-- FileDemo5.java
|-- students.txt
`-- students2.txt
```

# Compile

```javascript
javac -d bin src/FileDemo3.java
```
# Run
```javascript

java -cp bin FileDemo3 

```
# Zip/compress the files

```javascript

zip -r FileExamples.zip . -x "bin/*" "FileExamples.zip"

```

# Notes:

## PrintWriter: Overwrite vs. Append

`PrintWriter` has multiple **overloaded constructors**.  
Java selects the appropriate constructor based on the type of argument we provide.

| | Overwrite | Append |
|---|---|---|
| **Code** | `new PrintWriter(filename)` | `new PrintWriter(new FileWriter(filename, true))` |
| **Argument passed to PrintWriter** | `String` | `FileWriter` object |
| **PrintWriter constructor used** | `PrintWriter(String fileName)` | `PrintWriter(Writer out)` |
| **If the file exists** | Existing content is overwritten | New content is added to the end |
| **Main checked exception** | `FileNotFoundException` | `IOException` |
| **Use when** | Creating/replacing a file | Adding data without deleting existing data |

### Why are different constructors called?

Consider:
```java
    PrintWriter output = new PrintWriter(filename);
```
Here, `filename` is a `String`. Therefore, Java selects a `PrintWriter`
constructor that accepts a `String`.
```java
    PrintWriter(String fileName)
```
Now consider:
```java
    PrintWriter output =
        new PrintWriter(new FileWriter(filename, true));
```
First, Java creates a `FileWriter`:
```java
    FileWriter fw = new FileWriter(filename, true);
```
Then that `FileWriter` object is passed to `PrintWriter`:
```java
    PrintWriter output = new PrintWriter(fw);
```
Since `FileWriter` is a type of `Writer`, Java selects the `PrintWriter`
constructor that accepts a `Writer`.

### FileWriter's Append Option

`FileWriter` itself has an overloaded constructor:
```java
    new FileWriter(filename, true)
```
The second argument controls whether data is appended.

| Value | Behavior |
|---|---|
| `true` | Append new data to the existing file |
| `false` | Overwrite the existing file |

Therefore:
```java
    new FileWriter(filename, true)
```
means:

> Open the file for writing, but preserve the existing content and add
> new content at the end.

### Key Idea

These two statements both create a `PrintWriter`, but they use different
overloaded constructors:
```java
    new PrintWriter(filename)
                    ↑
                  String

    new PrintWriter(new FileWriter(filename, true))
                    ↑
                Writer object
```
**Constructor overloading:** Same constructor name, but different parameter
types or parameter lists determine which constructor Java calls.


## Another note:

* `PrintWriter` handles `FileNotFoundException` where as the overloaded version with `FileWriter` handles `IOException` because that's how they are defined in the Java API.

* Remember:
```text
Exception
    ↑
IOException
    ↑
FileNotFoundException
```
So `FileNotFoundException` **IS-A** `IOException`.

* Which checked exception we must handle or declare is determined by the method or constructor we are calling. Look at its API documentation and check its throws declaration.

* Check: https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html

=> **FileNotFoundException** is the main/most common checked exception we see. But conceptually, file writing can fail because of things like:

    -   invalid or inaccessible path
    -   no write permission
    -   disk/device problem
    -   file system failure

=> Many lower-level writing APIs express these problems through IOException.

