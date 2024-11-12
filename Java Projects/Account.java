/*
* Program: Example 3.8 from book
* Programmer: Anthony Chipner
* Purpose: assignment is to describe line by line of this example in full detail.
*/
package examples3_8.pkg3_9; // name of the package class is located in.
// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Account { // created Account Class and is set to public so it can be accessed from anywhere or anybody.
   private String name; // A private (meaning nothing else can access this variable other than this class.) instance variable to store String data into the variable name of "name". 
   private double balance; // A private (meaning nothing else can access this variable other than this class.) instance variable to store a double value data into the variable name of "balance".

     
   public Account(String name, double balance) { /* Account constructor that receives two parameters. 
      This allows the information from the variables name and balance to be passed into the method/constructor. Notice also that this declares both parameters in the same line.*/
      this.name = name; // The this keyword refers to the current object and then assigns "name" to the object of "name".

      
      if (balance > 0.0) { // this checks to make sure that the balance variable is not greater than 0.0.
         this.balance = balance; /* assuming the above is true and the balance is not greater than 0.0 then it again utilizes the "this" 
         keyword to refer the current object and then assigns "balance" to the object of "balance".*/
      }
   }

   // method that deposits (adds) only a valid amount to the balance
   public void deposit(double depositAmount) {     // Method to check to make sure the amount being added is valid and then calculates and stores that amount in "balance" variable.
      if (depositAmount > 0.0) { //beginning of the "if" statement which checks for validation of the amount and if it is greater than 0.0.
         balance = balance + depositAmount; // if the amount is greater than 0.0 then it gets added to the varaible balance.
      }// end of if statement
   }// end of method

   // method returns the account balance
   public double getBalance() { // begins the method of "getBalance" which retrieves the information from the constructor Account and then returns it.
      return balance; // returns the data stored in "balance"
   } 

   // method that sets the name
   public void setName(String name) { // method to set the name to "name".
      this.name = name; // uses the keyword "this" to sets "name" to the object name.
   } 

   // method that returns the name
   public String getName() { // method to return the name that was set earlier.
      return name; // returns the name.
   } 
}


