/* Program: fig 5.6 interest application.. Interest.java
* The programmer: Anthony Chipner
* Date: 09/10/2023
* Purpose: modification of fig 5.6 in deitel java book to allow for users to 
    put in different amounts and interests.
*/
package interest;
import java.util.*; // imports all classes available in the java library.
public class Interest { // start of interest class.
   public static void main(String[] args) { // start of main method.
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a Principal amount."); // promting the user to enter an amount.
      double principal = input.nextDouble(); // initial amount before interest
      System.out.println("Please enter a rate of Interest in decimal form."); // prompting the user to enter a rate. 
      double rate = input.nextDouble(); // interest rate

      // display headers
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; ++year) {                  
         // calculate new amount on deposit for specified year  
         double amount = principal * Math.pow(1.0 + rate, year);
                                                                
         // display the year and the amount                     
         System.out.printf("%4d%,20.2f%n", year, amount);       
      }// end for loop                                                         
   }// end  main method
} // end class.

