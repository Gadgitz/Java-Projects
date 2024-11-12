/**

 * Program to take an average of ratings and print a picture.

 *

 * @author Anthony Chipner

 * @version January 18, 2022

 */
package hmwk02;

import java.util.Scanner;

public class Ratings {
    
 /**
 * main - gets average of ratings and prints picture depending on rating.
 * 
 * @param       args command line arguments
 * @return      N/A
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //int rating;
        int sum;
        int average;
        
        System.out.print("4 ratings? ");
        
        System.out.println();
        sum = input.nextInt();
        //sum = rating;
        sum += input.nextInt();
        //average = rating + sum;
        sum += input.nextInt();
        //sum = average + rating;
        sum += input.nextInt();
        average = (sum + 2) / 4;
        
        if (average == 1) {
            System.out.println("Rating is 1: /(>_<)\\");
        }
        
        if (average == 2) {
            System.out.println("Rating is 2: (>_<)");
        }
        
        if (average == 3) {
            System.out.println("Rating is 3: (^_^)");
        }
        
        if (average == 4) {
            System.out.println("Rating is 4: (~o~)");
        }
        
        if (average == 5) {
            System.out.println("Rating is 5: \\(~o~)/");
        }
        
    }    
}
