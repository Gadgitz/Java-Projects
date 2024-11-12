/**
 *
 * Program to  *
 *
 *
 * @author Anthony Chipner
 *
 * @version February 02, 2022
 *
 */
package lab04;

import java.util.Scanner;

public class Gas {

    /**
     * main - prints a cup of Java
     *
     * @param args command line arguments
     * @return N/A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gg;
        int miles;
        int totalMiles = 0;
        int totalGallons = 0;
        int mpg;
        double totalMpg =0.00;

        System.out.print("Num miles (-1 to quit)? ");
        System.out.println();
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Num gallons? ");
            System.out.println();
            gg = input.nextInt();
            
            if(gg == 0) {
                System.out.println("Gallons cannot be zero");
            } else {
                totalMiles += miles;
                totalGallons += gg;
                mpg = miles / gg;
                totalMpg = totalMiles / totalGallons;

                System.out.printf("MPG: %.2f%n", (double)mpg);
            }
            System.out.print("Num miles (-1 to quit)? ");
            System.out.println();
            miles = input.nextInt();
        }
        
        System.out.printf("Total MPG: %.2f%n", totalMpg);
    }
}
