//Project 8.6
// Author Anthony Chipner
// Date: 10/12/2018
public class SavingsCalculator {
	
	static double annualInterestRate = 0.04;
	public static void main(String[] args) {
	
		SavingsAccount Saver1 = new SavingsAccount(2000.00);
		SavingsAccount Saver2 = new SavingsAccount(3000.00);
		
		System.out.printf("Current Savings Balance: %f, %f",Saver1.getBalance(), Saver2.getBalance());
		
		
		Saver1.setBalance(Saver1.getBalance() + Saver1.calculateMonthlyInterest(annualInterestRate,12.0));
		Saver2.setBalance (Saver2.getBalance() + Saver2.calculateMonthlyInterest(annualInterestRate,12.0));
		
		System.out.printf(" Saving Balance after Interest Rate: %f , %f",Saver1.getBalance(), Saver2.getBalance());
		
		annualInterestRate = 0.05;
		
		Saver1.setBalance(Saver1.getBalance() + Saver1.calculateMonthlyInterest(annualInterestRate,12.0));
		Saver2.setBalance (Saver2.getBalance() + Saver2.calculateMonthlyInterest(annualInterestRate,12.0));
		
		System.out.printf(" Saving Balance after Interest Rate: %f , %f",Saver1.getBalance(), Saver2.getBalance());
	}
}



 