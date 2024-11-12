/* Big Decimal Transactions
* The programmer: Anthony Chipner
* Date: 10/08/2023
* Purpose: Utilize big decimal to keep track of bank transactions.
*/
package transactions; // begin package
import java.util.*; // import all java classes from java API Library.
import java.math.BigDecimal; // imports java's math API Library.
public class Transactions { // begin class
    public static void main(String[] args) { // start main method
        LinkedList<Object> list = new LinkedList<Object>(); // created linked list to store balance data.
        BigDecimal currentBalance = new BigDecimal("10500.00"); // created new object to store initial balance.
        BigDecimal deposit = new BigDecimal("556.59"); // created new object to keep track of new deposit.
        BigDecimal withdraw = new BigDecimal("475.44"); // created new object to keep track of withdraw amount. 
        
       list.add(currentBalance); // added currentBalance to list for storage
        list.add(deposit); // added deposit amount to list
        list.add(withdraw); // added withdraw amount to list
        
       BigDecimal balance = currentBalance.add(deposit); // added the current balance and deposit together to get a new balance
       list.add(balance); // added balance to list.
       BigDecimal finalBalance = balance.subtract(withdraw); // subtracted withdrawl from balance
       list.add(finalBalance); // added final balance to list
       
           System.out.println("Beginning Balance: " + list.get(0).toString()); // printed beginning balance.
           System.out.println("Deposit made: " + list.get(1).toString()); // printed deposit amount.
           System.out.println("New Balance: " + list.get(3).toString()); // printed new balance.
           System.out.println("Withdrawl: " + list.get(2).toString()); // printed withdrawl.
           System.out.println("Final Balance: " + list.get(4).toString()); // printed final balance.
        
    }// end main method
    
} // end class
