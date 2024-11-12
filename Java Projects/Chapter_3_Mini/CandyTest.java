/**

 * Program to create a candy object and test its various methods.

 *

 * @author Anthony Chipner

 * @version January 27, 2022

 */
package mini03;

import java.util.Scanner;

public class CandyTest {
 /**
 * main - calls methods and displays them.
 * 
 * @param       args command line arguments
 * @return      N/A
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        Double price = 0.00;
        int quantity = 0;
        String name;
        
        Candy c = new Candy("Kit Kat", price, quantity);
        c.display();
        
        System.out.println();
        System.out.print("Enter new name: ");
        System.out.println();
        name = input.nextLine();
        
        System.out.print("Price: ");
        System.out.println();
        price = input.nextDouble();
        
        System.out.print("Quanity: ");
        System.out.println();
        quantity = input.nextInt();
       
        c.setPrice(price);
        c.setQuanity(quantity);
        c.setName(name);
        System.out.println();
        c.display();
        System.out.println();
        System.out.printf("Total cost = $%.2f", c.getCost());
    } 
}
