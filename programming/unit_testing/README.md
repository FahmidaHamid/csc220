# Topic: Unit Testing

=> Unit testing means checking a small part of a program independently to verify that it behaves as expected.

=> In Java, that small part is often a method.

```bash

public int add(int a, int b) {

    return a + b;

}

```
=> We can test it with specific inputs and compare the actual result with the expected result:

| Input | Expected result |
|------|------|
| `add(2, 3)` | `5` |
| `add(-2, 3)` | `1` |
| `add(0, 0)` | `0` |

=> A **unit test** automates this comparison. An **assertion** checks whether the actual result matches what we expect.

=> A **unit test** supplies inputs, performs an operation, and checks the outcome.


## Why is it important?

- **Find defects early:** Check individual methods before combining them into a larger application.

- **Check boundary and invalid cases:** For example, withdrawing the exact balance or dividing by zero.
- **Repeat checks automatically:** Run the same tests after every change.
- **Catch regressions:** Detect when a change breaks previously working behavior.
- **Document expectations:** A test shows how a method is supposed to behave.
- **Passing tests** give us confidence in the situations we checked; they do not prove that the entire program is correct.

```bash

assertEquals(9, Calculator.add(4, 5));

```
=> This checks whether `add(4, 5)` returns the expected value, `9`.

=> Tests can also check changes to an object or whether an operation throws an exception.

=> source: https://docs.junit.org/6.1.3/writing-tests/intro.html

## What is JUnit?

=> **JUnit** is the de facto standard testing framework for Java applications, used to write and execute repeatable automated unit tests.

=> It provides tools for identifying tests, checking outcomes, and reporting results. Our examples use JUnit Jupiter.

| Feature | Purpose |
|---|---|
| `@Test` | Identifies a test method |
| `assertEquals()` | Checks an expected value against an actual value |
| `assertTrue()` / `assertFalse()` | Checks a condition |
| `assertThrows()` | Checks an expected exception |

JUnit assertions automate the checks we would otherwise perform by inspecting printed output. docs.junit.org

=> source: https://docs.junit.org/6.0.3/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html

## Why write separate test cases?

Each test should check a specific behavior or scenario, with a name that explains it:

```bash

addsTwoPositiveNumbers()
addsTwoNegativeNumbers()
divideByZero()

```

=> Separate tests make failures easier to understand. If divideByZero() fails, we immediately know which behavior needs investigation.

=> They also allow other tests to run when one fails. Within a single test method, a failed assertion normally prevents the remaining statements from executing.

=> **Each test should be independent:** it should prepare what it needs and should not rely on another test running first. One test may contain multiple assertions when they check the same scenario—for example, a rejected withdrawal and its unchanged balance.

## When did JUnit become part of Java?

=> JUnit is not part of the Java language or the standard JDK. It is a separate dependency that we add to a project, as we did through Maven.

=> JUnit was created by Kent Beck and Erich Gamma in 1997 and became an established tool in the Java ecosystem.

# Setup

### Check Java and Maven

1. **Open VS Code Terminal and Run each Command:**

```bash

java -version
javac -version
mvn -version

```
**Basic Requirements:**

- JDK 17 or newer—your Java 26 installation works.
- Maven.
- VS Code, with **Microsoft’s Extension Pack for Java** installed. This includes **Test Runner** for Java.
- If needed, follow the JDK installation instructions or Maven installation instructions. Restart VS Code after installation.


**2. Create the project**

- Create a folder named UnitTesting.

- In VS Code, select File → Open Folder and open UnitTesting.

- Inside it, create a folder named src.

- Inside src, create two folders: main and test.

- Save the provided pom.xml in the UnitTesting root folder.

**3. Locate the application and test files**

Application files begin with:  

    ```bash
    
    package main;

    ```
Test files begin with:

    ```bash
    
    package test;
    
    ```

**4.Run the tests**

Save all files. 

In the terminal, from the folder containing `pom.xml`, run:

```bash

mvn test

```

Maven compiles the application and test code, then runs the JUnit tests.

A successful run reports:

```bash

Failures: 0, Errors: 0
and:
BUILD SUCCESS
```

If a test fails, look above BUILD FAILURE for the test name and the expected versus actual result.

**5. If VS Code still displays import errors**

If mvn test passes but the editor shows errors:
    1. Open the Command Palette: **Cmd + Shift + P** on macOS.
    2. Run Java: **Clean Java Language Server Workspace**.
    3. Confirm the restart and wait for project loading to finish.

# ToDo:

## In-Class Exercise: Add More Unit Tests

### Add three new JUnit test methods to each test class:
    - CalculatorTest.java: three additional tests for Calculator.
    - BankAccountTest.java: three additional tests for BankAccount.
    
    Your six new tests must check scenarios that are not already covered by the existing tests.

### Requirements:

- Give each test a descriptive name and annotate it with @Test.
- Include an appropriate assertion in every test.
- For BankAccount, include at least one invalid operation tested with assertThrows(). Also verify that the rejected operation leaves the balance unchanged.
- Make each test independent; create a fresh account when needed.

Before writing each test, identify the inputs or initial state, operation, and expected outcome.

### Run all tests using:
```bash

mvn test
```

- Be ready to explain what each new test checks and why that scenario matters.