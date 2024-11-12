//Program: Exceptiontest.java
// Programmer: Anthony Chipner
// Purpose: to show examples of arithemetic exceptions.
package exceptiontest; // package name
import java.util.*; // imports all classes from java Util API.
public class ExceptionTest { // begin class 
    public static void main(String[] args) { // begin main method
        Scanner scanner = new Scanner(System.in); // creating and initializing scanner object for user input.
        try{ // begin try statement.
        System.out.println("Please enter a number to Divide: "); // prompting customer to enter a number.
        int num1 = scanner.nextInt(); // grabbing and storing user entered information.
        System.out.println("Please enter a whole number to Divide: "); // prompting customer to enter a number.
        int num2 = scanner.nextInt(); // grabbing and storing user entered information.
        
        int answer = num1/num2; // printing total after calculations are complete.
        
        System.out.println("Total is: " + answer);
        } // end of try statement. 
            catch(ArithmeticException BadMath){
            System.out.println("You cannot Divide by zero! Please try again."); // catch statement to catch arithmetic exception divde by zero.
            
            System.out.println("Please enter a number to Divide: "); // prompting customer to enter a number.
            int num1 = scanner.nextInt(); // grabbing and storing user entered information. 
            System.out.println("Please enter a whole number to Divide: ");// prompting customer to enter a number.
            int num2 = scanner.nextInt(); // grabbing and storing user entered information.

            int answer = num1/num2; // arithmetic to divide the numbers and push out the total.

            System.out.println("Total is: " + answer); // printing total after calculations are complete.
        } // end catch for 

        catch(InputMismatchException BadInput){ // miss match catch beginning. 
            // printing out an exception and letting the user know what to do next.
            System.out.println("Invalid entry please try again and enter a valid number. "); 
            
              System.out.println("Please enter a number to Divide: "); // prompting customer to enter a number.
            int num1 = scanner.nextInt(); // grabbing and storing user entered information. 
            System.out.println("Please enter a whole number to Divide: ");// prompting customer to enter a number.
            int num2 = scanner.nextInt(); // grabbing and storing user entered information.

            int answer = num1/num2; // arithmetic to divide the numbers and push out the total.

            System.out.println("Total is: " + answer); // printing total after calculations are complete.
        } // end mismatch catch block
        finally{ // final block that will always run to close the scanner
            scanner.close();
        } // end finally block
    } // end main method
    
}// end class 
