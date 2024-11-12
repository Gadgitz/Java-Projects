/*
* Program: FirstJavaApp.java
* Programmer: Anthony Chipner
* Purpose: Application to request and uses 2 ints to print thier sum,product,difference and quotient.
*/
package chaptertwo_exercise;
import java.util.Scanner; // program uses class Scanner
public class ChapterTwo_Exercise {
    // Main Method Begins
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Created a Scanner to obtain user input
        
        System.out.println("Please enter the first number."); // requesting for user to input the first number
        int num1 = input.nextInt();// read the first number from the user and store it
        
        System.out.println("Please enter the second number."); // requesting for user to input the second number
        int num2 = input.nextInt();// read the second number from the user and store it
        
        int sum = num1 + num2; // adding user input num1 and num2
        
        int product = num1 * num2; // multiplying user input num1 and num2
        
        int difference = num1 - num2; // subtracting user input num1 from num2
        
        int quotient = num1/num2; // dividing num1 by num2
        
        System.out.printf(" The sum is %d%n The Product is %d%n "
                + "The Difference is %d%n The quotient is %d%n", sum, product, 
                difference, quotient); // printed out all of the results
        
    } // end main method
    
} // end class ChapterTwo_Exercise
