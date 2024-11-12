/*
* Program: UDefClassDriver.java
* Programmer: Anthony Chipner
* Purpose: Application that takes a user defined class and tests it. 
*/
package udefclass; // begin package
import java.util.*; // import all classes in java API library.
public class UDefClassDriver { // begin class
    public static void main(String[] args) { // main method
        UDefClass newNum = new UDefClass(); // created object of class UDefClass
            newNum.checknum(1,5); // testing the good
            newNum.checknum(-1, 13); // testing the bad
            System.out.printf("The sum of those numbers is: %d%n", newNum.GetSum()); // printing out the sum.
        
        
    }// end main method
    
} // end class
