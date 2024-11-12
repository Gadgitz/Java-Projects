/**
 *
 * Program to help save money.
 *
 *
 *
 * @author Anthony Chipner
 *
 * @version January 28, 2022
 *
 */
package hmwk03_04;

import java.util.Scanner;

public class MoneyGoals {

    /**
     * main - Money goals
     *
     * @param args command line arguments
     * @return N/A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarGoal = 0;
        int jarGoal2 = 0;
        int jarAmount = 0;
        int jarNum;
        String money = "$";
        
        CashJar cj = new CashJar(1, jarGoal, jarAmount);
        CashJar cj2 = new CashJar(2, jarGoal, jarAmount);

        System.out.print("Goals? ");
        System.out.println();
        jarGoal = input.nextInt();
        jarGoal2 = input.nextInt();
        cj.setjarGoal(jarGoal);
        cj2.setjarGoal(jarGoal2);

        cj.display();
        System.out.println();
        System.out.println();
        cj2.display();
        
        while(cj.getjarAmount() <= cj.getjarGoal() && cj2.getjarAmount() <= cj2.getjarGoal()){
        System.out.println();
        System.out.print("Jar Amount? ");
        System.out.println();
        jarNum = input.nextInt();
        
        if(jarNum == 1){
            jarAmount = input.nextInt();
            cj.setjarAmount(jarAmount);
            System.out.printf("Jar %d has $%d", jarNum, cj.getjarAmount());
        } else {
            jarAmount = input.nextInt();
            cj2.setjarAmount(jarAmount);
            System.out.printf("Jar %d has $%d", jarNum, cj2.getjarAmount());
        }
        
        }
        System.out.println();
        if (cj.getjarAmount() >= cj.getjarGoal()){
            System.out.printf("Congratulations, you met the goal for jar %d!", 1);
        } else {
            System.out.printf("Congratulations, you met the goal for jar %d!", 2);
        }
        System.out.println();
        cj.display();
        System.out.println();
        System.out.println();
        cj2.display();
        System.out.println();

    }
}
