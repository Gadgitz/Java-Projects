// Project 5 fig. 6.17 Chapter 6
// Author: Anthony Chipner
// Date: 09/21/2018

import java.util.Scanner;
public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		System.out.println("Welcome to the Even or Odd program!");
		
		do {
			System.out.println("Please Enter a number to determine if they are Even or Odd: ");
			int number = input.nextInt();
			count = count +1;
			
			if (isEven(number)) {
				System.out.printf("%d is an Even number%n", number);
			}
			else {
				System.out.printf("%d is an odd number%n", number);
			}
			
		} while (count <= 10);
		
		System.out.println("End of Even or Odd Program!");
	}
	public static boolean isEven(int number) {
	
		return number % 2 == 0;
	}
	}