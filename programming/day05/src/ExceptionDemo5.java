import java.util.Scanner;

public class ExceptionDemo5 {
 
    public static void setAge(int age) {
    
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative.");
    }
    System.out.println("Age is " + age);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inputData = input.nextInt();

        try {
            setAge(inputData);
        } catch (IllegalArgumentException e) {
            System.out.println("Please provide positive input for the age");
            System.out.println(e.getMessage());
        }

        input.close();

    }


}
