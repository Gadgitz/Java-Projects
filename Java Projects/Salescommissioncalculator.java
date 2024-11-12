// Project 4.19 Sales Commission Calculator
// Date: 09/07/18
// Author: Anthony Chipner

import java.util.Scanner;

public class Salescommissioncalculator{
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	String name = "";
	double unitOne = 239.99;
	double unitTwo = 129.75;
	double unitThree = 99.95;
	double unitFour = 350.89;
	double commission = 0.09;
	int count = 0;
	double total = 0.0;
	double salary = 200.00;
	
	System.out.println("Welcome to Sales Commission Calculator!");
	System.out.printf("Please enter the employee's name: %s", name);
	name = input.nextLine();
	
	do {
		System.out.print("Enter the total amount of units sold for Unit One: ");
		double units = input.nextDouble();
		
		total = total + units * unitOne;
		count = count + 1;
		
		System.out.print("Enter the total amount of units sold for Unit Two: ");
		units = input.nextDouble();
		
		total = total + units * unitTwo;
		count = count + 1;
		
		System.out.print("Enter the total amount of units sold for Unit Three: ");
		units = input.nextDouble();
		
		total = total + units * unitThree;
		count = count + 1;
		
		System.out.print("Enter the total amount of units sold for Unit Four: ");
		units = input.nextDouble();
		
		total = total + units * unitFour;
		count = count + 1;
		
	} while (count == 2);
	
	double weeklyPay = total * commission + salary;
	
	System.out.printf("Total weekly pay is:%n%.2f%n", weeklyPay);
	
	
	}
}
