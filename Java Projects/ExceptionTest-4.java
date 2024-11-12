/*
Program: ExceptionTest.java
programmer: Anthony Chipner
Purpose: to showcase finally block along with 3 catch blocks
*/
package exceptiontest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static int results(int num1, int num2)throws ArithmeticException{ // Utilizing throw to manage arithmeticexception
        return num1/num2; // calculation to be examined for exception.
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       boolean continueApp = true;
       do{
           try{ // read user input and try the calculation.
               System.out.println("Please enter first integer to be divided: "); // requesting user input
               int num1 = input.nextInt(); // stored user input
               System.out.println("Please enter the second integer to be divided: "); // requesting user input
               int num2 = input.nextInt(); // stored user input
               
               int result = results(num1, num2); // calls the method results does the calculation and returns the results.
               System.out.printf("%nAnswer:%d/%d = %d%n", num1, num2, result); // prints results
               continueApp = false;
          } // end try block
           catch (InputMismatchException badInput){ // checks for bad user input. 
               System.err.printf("%nException: %s%n", badInput); // prints out name of exception
               input.nextLine();
               System.out.printf("You must enter an integer. Please try again. %n%n");
           } // end catch block
           catch (ArithmeticException arithmeticException){ // catch method to test for divide against zero. 
               System.err.printf("%n Exception: %s%n", arithmeticException); // prints the exception.
               System.out.printf("You cannot divide by zero! please try again.%n%n"); // prints the user instructions.
           }// end catch block
           catch(Exception generalException){ // general exception catch block
               System.out.printf("%n Exception %s%n", generalException);
               System.out.printf("Oops Something went wrong. Pleasetry again.%n%n");
           } // end catch block 
           
    } while(continueApp);
       
    }
    
}
