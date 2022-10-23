package lab3;

import lab3.EasyIn;

public class SavingsAccount 
{
	// variables
		private static int accountNumber = 0 ;
		private static double annualInterestRate ;
		private double savingsBalance ;
		
	 
		// constructor
		public SavingsAccount(double savings)
		{
			accountNumber++;
			this.savingsBalance = savings;
		}
		
		
		public static void setInterestRate(double rate)
		{
			annualInterestRate = rate;
		}
		
		public static double getInterestRate()
		{
			return annualInterestRate;
		}
		// setting savings Balance
		public void setSavingsBalance(int savingsBal)
		{
			this.savingsBalance = savingsBal;
		}
		
		// getting savings Balance
		public double getSavingsBalance()
		{
			return this.savingsBalance;
			
		}
		
	   public static int getAccountNumber() {
			return accountNumber;
		}

	public double calculateMonthlyInterest()
	   {
		 return ((this.savingsBalance * annualInterestRate) / 12) + this.savingsBalance;
	     
	   }
	    public static double modifyInterestRate()
	    {
	    	System.out.println("Modify the Interest Rate ");
	    	annualInterestRate = EasyIn.getDouble();
	    	
	    	return annualInterestRate ;
		 
		
	 }
}
