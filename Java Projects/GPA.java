/* Program: GPA.java
* The programmer: Anthony Chipner
* Date: 09/10/2023
* Purpose: Evaluates 5 numbers entered and then finds the GPA and produces grade based on GPA
*/
package gpa;
import java.util.*; // imports all classes for Java Library.
public class GPA { // begins GPA class.
    public static void main(String[] args) { // begins Main Method.
        Scanner input = new Scanner(System.in); // creates a new object of scanner class.
        double gpaTotal = 0; // initialize variable for GPA total.
        for(int i = 0; i < 5; i++){ // for loop to get letter grades.
            System.out.println("Please enter a letter grade."); // requesting letter grade from user.
            String grade = input.nextLine(); // stores the grade entered by user.
            
            switch(grade){ // switch statement to sort the grades. 
                case "A": gpaTotal += 4.0; // case that assigns 4.0 to the letter grade A and then adds it to the gpaTotal variable.
                break; // break statement if this is true.
                case "B": gpaTotal += 3.0; // case that assigns 4.0 to the letter grade B and then adds it to the gpaTotal variable.
                break;
                case "C": gpaTotal += 2.0; // case that assigns 4.0 to the letter grade C and then adds it to the gpaTotal variable.
                break;
                case "D": gpaTotal += 1.0; // case that assigns 4.0 to the letter grade D and then adds it to the gpaTotal variable.
                break;
                case "F": gpaTotal += 0.0; // case that assigns 4.0 to the letter grade F and then adds it to the gpaTotal variable.
            } // end of case statement
        }// end of for loop
        System.out.printf(" Your GPA is: %.1f%n ", gpaTotal/5.0); // calculates and prints out GPA.
    } // end of main method.

} // end of class.
