/**

 * Program to

 *

 * @author Anthony Chipner

 * @version January 26, 2022

 */
package lab03;
import java.util.Scanner;
public class DateTest {
 /**
* main - 
* 
* @param       args command line arguments
* @return      N/A
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Date d = new Date();
        int month;
        int day;
        int year;
      
        System.out.print("Enter month day year: ");
        System.out.println();
        month = input.nextInt();
        day = input.nextInt();
        year = input.nextInt();
        
        d.setMonth(month);
        d.setYear(year);
        d.setDay(day);
        System.out.println();
        d.display();
        d.newYear();
        System.out.println();
        d.display();
        
        
        
        
        
        
        
        
        
        
    }
    
}
