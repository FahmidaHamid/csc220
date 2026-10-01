//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        try{
                int number = input.nextInt();
                System.out.println(100 / number);
        }catch(InputMismatchException e){
            System.out.println("Expect a valid integer, not a string");
           // System.out.print(e.getMessage());
        }catch(ArithmeticException e){
             System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
           
            input.close();
        }
        
        System.out.println("Will be printed anyway ...");
    
       
    }
    
}

/*
 * 
 * try {
 * System.out.print("Enter an integer: ");
 * int number = input.nextInt();
 * System.out.println(100 / number);
 * } catch (InputMismatchException e) {
 * System.out.println("You must enter an integer.");
 * // System.out.println(e.getMessage());
 * 
 * } catch (ArithmeticException e) {
 * System.out.println("Cannot divide by zero.");
 * //System.out.println(e.getMessage());
 * 
 * }finally{
 * input.close(); // close a resouce
 * }
 */

/*
 * 
 * later: we can check
 * 
 * 
 * // System.out.println("getMessage():");
 * // System.out.println(e.getMessage());
 * 
 * // System.out.println("\ne.toString():");
 * // System.out.println(e.toString());
 * 
 * // System.out.println("\nClass:");
 * // System.out.println(e.getClass().getSimpleName());
 * 
 * // System.out.println("\nStack trace:");
 * // e.printStackTrace();
 */