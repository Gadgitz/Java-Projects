//Project 7.10 Sales Commission
//Author: Anthony Chipner
//Date: 09/28/18

import java.util.Scanner;

public class SalesCommissions{
	
    private static int[] salaryAmount = new int[9];
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double salesAmount;
        
        
        for(int a = 0; a < 9; a++)
            salaryAmount[a] = 0;
    
        System.out.printf("%s","Enter the gross sales amount(-1 to quit): ");
        salesAmount = input.nextDouble();
        
        while(salesAmount != -1){
            calculateSalary(salesAmount);
            
            System.out.printf("%s","Enter the gross sales amount(-1 to quit): ");
            salesAmount = input.nextDouble();
            
        }
        results();
    }
    
    private static void calculateSalary(double amount){
        double salary;
        
        salary = 200 + amount*0.09;
        
        if(salary >= 200 && salary < 300) {
            salaryAmount[0]++;
        }
        else if(salary >= 300 && salary < 400) {
            salaryAmount[1]++;
        }
        else if(salary >= 400 && salary < 500) {
            salaryAmount[2]++;
        }
        else if(salary >= 500 && salary < 600) {
            salaryAmount[3]++;
        }
        else if(salary >= 600 && salary < 700) {
            salaryAmount[4]++;
        }
        else if(salary >= 700 && salary < 800) {
            salaryAmount[5]++;
        }
        else if(salary >= 800 && salary < 900) {
            salaryAmount[6]++;
        }
        else if(salary >= 900 && salary < 1000) {
            salaryAmount[7]++;
        }
        else {
            salaryAmount[8]++;
        }
    }
    
    private static void results(){
        System.out.print("Salary Amount\tNumber of Salespersons\n");
        for(int amount = 0; amount < 9; amount++){
            if(amount == 8){
                System.out.printf("$%d and over\t", amount*100+200);
                System.out.printf("%d\n", salaryAmount[amount]);
            }
            else{
                System.out.printf("$%d-%d\t", amount*100+200, amount*100+299);
                System.out.printf("%d\n", salaryAmount[amount]);
            }
        }
    }
}