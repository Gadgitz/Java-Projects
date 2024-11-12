/**

 * Program to check and print absolute difference

 *

 * @author Anthony Chipner

 * @version January 19, 2022

 */
package lab02;

/**
 *
 * @author B00465897
 */
import java.util.Scanner;
public class CasesNeeded {
  /**
 * main - check which number is larger and print difference
 * 
 * @param       args command line arguments
 * @return      N/A
 */   
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        int leftOver;
        int totalCases;
        
        System.out.print("Num candles? ");
        System.out.println();
        int candles = input.nextInt();
        System.out.print("Candles per case? ");
        System.out.println();
        int cases = input.nextInt();
        
        totalCases = candles / cases;
        leftOver = candles % cases;
        
        System.out.printf("%d cases %d leftover%n", totalCases, leftOver);
        
        if (totalCases > 5) {
            System.out.println("*** large order");
        }
        
        System.out.println("Done!");
   
    }
    
}
