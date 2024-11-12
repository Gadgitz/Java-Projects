/*
* Program: UDefClass.java
* Programmer: Anthony Chipner
* Purpose: User defined class that takes two numbers and check for validity 1 - 10 and then sums the numbers.
*/
package udefclass; // package start
public class UDefClass { // begin user def class.
    private int number1; // 1- 10 first number
    private int number2; // 1- 10 second number 
    private int sum; // variable to store the sum
    
    public void checknum(int number1, int number2){ // sets number if it meets the parameter of greater than 0 and less than 10;
        if (number1 < 0 || number1 > 10){ // testing for validity
            System.out.println("This is an invalid number..."); // print if number is not valid
        } else if(number1 > 0 && number1 < 10){ // testing for validity
            this.number1 = number1;// setting number1.
        } // end if
        
    //} // end method
    //public void CheckNum2(int number2){
        if (number2 < 0 || number2 > 10){ // testing for validity
            System.out.println("This is an invalid number..."); // print if number is not valid
        } else if(number2 > 0 && number2 < 10){ // testing for validity
            this.number2 = number2; //setting number2.
        }// end if statement
        
    } //end method
    
    public int GetSum(){ // method to add the numbers and get the sum.
        return sum = number1 + number2; // returns the sum after adding.
    } // end method.
} // end class
