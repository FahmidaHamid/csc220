public class ExceptionDemo {


    public static void divide(int a, int b) throws ArithmeticException {
            System.out.println(a / b);
     }
    public static void main(String[] args) {

        int[] numbers = {10, 0, 30};
        try {

            divide(numbers[2], 0);
            // System.out.println(numbers[100]);
        } catch (ArithmeticException d) {
            System.out.println("Something went wrong.");
            System.out.println(d.getMessage());
        }
        System.out.println("Program completed.");
    }
}

// public static void divide(int a, int b) throws ArithmeticException {
    //         System.out.println(a / b);
    // }
 // try {
        //     System.out.println(numbers[5]);
        //     //divide(numbers[1], numbers[1]);
        // } catch (Exception e) {
           
        //     System.out.println("Something went wrong");
        //     System.out.println(e.getMessage());
        //     System.out.println(e.getClass().getSimpleName());
        // }
