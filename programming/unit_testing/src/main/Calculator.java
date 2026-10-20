package main;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static float divide(int a, int b) {
         if (b == 0) {
        throw new ArithmeticException(
            "Division by zero is not allowed."
        );
    }
        return a / b;
    }

    // public static void main(String[] args) {

    //     System.out.println(add(4, 5));
    //     System.out.println(add(-1, 5));
    //     System.out.println(add(0, 5));
    //     System.out.println(add(4, -5));
        

    // }

}
