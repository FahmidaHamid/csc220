# Project Structure

This is a good habit because later, when they have packages and many Java files, you can keep the same organization:

project/
├── src/      ← source code
└── bin/      ← compiled bytecode

# Compile
javac -d bin src/ExceptionDemo.java



# Run
java -cp bin ExceptionDemo

# Introduction

Up to now, we have mostly designed programs assuming that everything goes according to plan. But real programs receive bad input, missing files, invalid indices, null objects, network failures, and many other unexpected situations. A robust program needs a strategy for dealing with those situations.

Followings are some cases that need special attention:

Problem
 |
 +-- Compile-time error
 |      int x = "hello";
 |
 +-- Runtime exception
 |      numbers[10]
 |
 +-- Logical error
        incorrect formula

**Exception handling** is primarily about runtime situations, not fixing syntax errors.

- **exception handling** does not mean “prevent all errors”; it means respond appropriately when exceptional situations occur.

- **e.getMessage():** the exception message depends on how the exception object was constructed.

- Exception example, stack trace:

```text

main()
   ↓
Scanner.nextInt()
   ↓
Scanner.next()
   ↓
Scanner.throwFor()
   ↓
InputMismatchException thrown

```

# Some Common Exceptions:

| Exception                         | Typical cause                                            | Why useful for students                                              |
| --------------------------------- | -------------------------------------------------------- | -------------------------------------------------------------------- |
| `NullPointerException`            | Calling a method/accessing a field through `null`        | Extremely common Java runtime problem                                |
| `NumberFormatException`           | `Integer.parseInt("abc")`                                | Very natural with user/file input                                    |
| `InputMismatchException`          | `Scanner.nextInt()` receives `"hello"`                   | Good for interactive programs                                        |
| `ClassCastException`              | Invalid downcast                                         | **Excellent connection to your recent inheritance/casting material** |
| `IllegalArgumentException`        | Method receives an invalid argument                      | Good introduction to deliberately `throw`ing exceptions              |
| `FileNotFoundException`           | Opening a nonexistent file                               | Natural bridge into Thursday's file I/O                              |
| `IOException`                     | General failure during I/O                               | Introduces checked exceptions and `throws`                           |
| `NoSuchElementException`          | Reading from a `Scanner`/collection when nothing remains | Useful with input processing                                         |
| `NegativeArraySizeException`      | `new int[-5]`                                            | Easy to understand and diagnose                                      |
| `StringIndexOutOfBoundsException` | Invalid position in a `String`                           | Familiar indexing idea applied beyond arrays                         |

# try-catch-finally

```text
try
    → attempt the risky operation

catch
    → respond if something goes wrong

finally
    → perform cleanup that should happen either way

```

finally is often used for resource cleanup, such as:

Scanner
File
Database connection
Network connection

# throws

We write throws in a method declaration when the method may produce an exception but does not handle that exception itself. Instead, it passes responsibility to the method that called it.

