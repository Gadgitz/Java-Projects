
public class SavingsAccount{
	
	private double savingsBalance;
	private double Months = 12.0;
	
	public SavingsAccount(double balance) {
		savingsBalance = balance;
		
	}
public double calculateMonthlyInterest(double annualInterestRate, double Months){
	
	double monthlyInterest = savingsBalance * annualInterestRate / Months;
	
	return monthlyInterest;
}
public void setBalance(double value){
savingsBalance = value;

}
public double getBalance(){

	return savingsBalance;
}
}