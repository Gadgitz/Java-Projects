// Multiples.java
// Application that reads two integers and determines whether the first is a multiples of the second.
// Author: Anthony Chipner
// Date: 08/20/2018

import java.util.Scanner; // Program uses class scanner

public class Multiples {

   public static void main(String[] args) {
// create Scanner to obtain input from command window.
      Scanner input = new Scanner(System.in);

      System.out.print("Enter first integer: "); // prompt
      int number1 = input.nextInt(); // read first number from user.

      System.out.print("Enter second integer: "); // prompt
      int number2 = input.nextInt();

      int test = number2 % number1;// declaring integer and utilizes the remainder operator.

      if (test == 0) { // decides if number2 is a multiple of number1
         System.out.printf("The number %d is a multiple of %d", number1, number2);
      }

      if (test != 0) { // decides if number2 is not a multiple of number1
         System.out.printf("The number %d is not a multiple of %d", number1, number2);
      }

   } // end method main

} // end class