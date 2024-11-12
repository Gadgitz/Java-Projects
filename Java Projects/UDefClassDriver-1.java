/*
* Program: UDefClassDriver.java
* Programmer: Anthony Chipner
* Purpose: Application that takes a user defined class and tests it. 
*/
package udefclass; // begin package
import java.util.*; // import all classes in java API library.
public class UDefClassDriver { // begin class
    public static void main(String[] args) { // main method
        Random newRand = new Random();
        int num1 = newRand.nextInt(10); // first random number
        int num2 = newRand.nextInt(10); // second random number
        UDefClass newNum = new UDefClass(); // created object of class UDefClass
            newNum.checknum(num1, num2); // testing both random numbers
            System.out.printf("The sum of %d + %d numbers is: %d%n",num1, num2, newNum.GetSum()); // printing out the sum.
        
        
    }// end main method
    
} // end class
