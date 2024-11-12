/**

 * Program to check and print absolute difference

 *

 * @author Anthony Chipner

 * @version January 18, 2022

 */
package mini02;
import java.util.Scanner;
public class AbsDiff {
    
 /**
 * main - check which number is larger and print difference
 * 
 * @param       args command line arguments
 * @return      N/A
 */
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int larger;
        
        System.out.print("n1 n2? ");
        System.out.println();
        num1 = input.nextInt();
        System.out.println();
        num2 = input.nextInt();
        
        
        if(num1 > num2){
            larger = num1 - num2;
            System.out.printf("%d is larger%n", num1);
            System.out.printf("|n1 - n2| = %d", larger);
        }
        
        if(num1 < num2){
            larger = num2 - num1;
            System.out.printf("%d is larger%n", num2);
            System.out.printf("|n1 - n2| = %d", larger);
        }
        
        if(num1 == num2){
            larger = num1 - num2;
            System.out.printf("|n1 - n2| = %d", larger);
        }
    }
}