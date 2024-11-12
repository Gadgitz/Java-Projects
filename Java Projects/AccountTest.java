/*
* Program: Example 3.9 from book
* Programmer: Anthony Chipner
* Purpose: Assignment is to describe line by line of this example in full detail.
*/
package examples3_8.pkg3_9;

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner; /* imports the scanner class to 
instantiate objects of the scanner class.*/

public class AccountTest { // creates a class that is public to all by the name of "AccountTest"
   public static void main(String[] args) {// Main method of the class. This is where it will always start to run the class.
      Account account1 = new Account("Jane Green", 50.00); // instantiates objects form class Account with the name parameters and balance.
      Account account2 = new Account("John Blue", -7.53); //instantiates objects form class Account with the name parameters and balance.

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); // displays the initial balance and calls the get method of the class account utilized the objects created earlier.
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); // displays the initial balance and calls the get method of the class account utilized the objects created earlier.

      
      Scanner input = new Scanner(System.in); // creates a scanner object to obtain input data from the user.

      System.out.print("Enter deposit amount for account1: "); // prompts the user for the deposit amount.
      double depositAmount = input.nextDouble(); // stores the user input for the deposit amount.
      System.out.printf("%nadding %.2f to account1 balance%n%n", 
         depositAmount);                                            // confirms the amount being deposited to the user.
      account1.deposit(depositAmount); // adds the amount the user inputed for the dposit to the object account1's deposit variable.

      // display balances
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance()); // displays the balance from the account1 object by calling the methods getName() and getBalance() in class Account.
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); // displays the balance from the account2 object by calling the methods getName() and getBalance() in class Account.

      System.out.print("Enter deposit amount for account2: "); // prompts the user to enter an amount to deposit into the object account2.
      depositAmount = input.nextDouble(); // obtain user input and stores it in the variable depositAmount.
      System.out.printf("%nadding %.2f to account2 balance%n%n", 
         depositAmount);                                          // confirms the amount to be deposited to the user by displaying this output to the screen.
      account2.deposit(depositAmount); // adds the user inputed balance to the object account2's deposit variable.

      // display balances
      System.out.printf("%s balance: $%.2f%n", 
         account1.getName(), account1.getBalance()); // calls the object account1's getName() method and getBalance() method. and then prints out the data stored in those method variables.
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance()); // calls the object account2's getName() method and getBalance() method. and then prints out the data stored in those method variables. 
   } // end of main method 
} // end of class

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
