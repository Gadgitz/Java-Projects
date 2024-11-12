/**

 * Program to check and utilize enums for prime, composite and neither.

 *

 * @author Anthony Chipner

 * @version February 16, 2022

 */
package lab06;
import java.util.Scanner;
public class Prime {
    
    enum Number { PRIME, COMPOSITE, NEITHER }
    /**
     * main - gets input from user and checks against enums.
     * 
     * @param       args command line arguments
     * @return      N/A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Number? ");
        System.out.println();
        num = input.nextInt();
        
        switch (decide(num)) {
            case PRIME:
                System.out.print("Prime");
                break;
            case COMPOSITE:
                System.out.print("Composite");
                break;
            case NEITHER:
                System.out.print("Neither");
                break;  
        }
        
    }
    public static Number decide(int num) {
         /**
     * main - checks if a number
     * 
     * @param       args command line arguments
     * @return      N/A
     */
        if (num == 1) {
            return Number.NEITHER;
        } 
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return Number.COMPOSITE;
            }
        } return Number.PRIME;

    }
}
