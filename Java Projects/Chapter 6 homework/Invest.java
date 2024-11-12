/**
 * Invest class
 * Calculates and prints compound interest in a table.
 *
 * @author Anthony Chipner
 * @version February 14, 2022
 */
package hmwk05_06;

import java.util.Scanner;

public class Invest {

    /**
     * main - calculates and prints compound interest in a table.
     *
     * @param args command line arguments
     * @return N/A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double initialInvestment;
        double periodicInvestment;
        double annualInterest;
        int years;
        String value;
        
        System.out.print("I-P-R-Y-C? ");
        
        System.out.println();
        initialInvestment = input.nextDouble();
        periodicInvestment = input.nextDouble();
        annualInterest = input.nextDouble();
        years = input.nextInt();
        value = input.next();
        
        if (periodicInvestment <= 0){
            InvestLib.firstPrint(initialInvestment, annualInterest, InvestLib.Compound(value), years);
        } else{
            InvestLib.secondPrint(initialInvestment, annualInterest,String value, periodicInvestment,InvestLib.Compound(value), years);
        }
        
    }

}

