package lab3;

import labnumber3.SavingsAccount;

public class lab3q2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Creating user1 and user 2 objects
		  SavingsAccount saver1 = new SavingsAccount(2000);
		  SavingsAccount saver2 = new SavingsAccount(3000);
		  
		  // setting the rate 4%
		   saver1.setInterestRate(0.4);
		   saver2.setInterestRate(0.4);
		   
		   // display the current balance with the 4 %
		   System.out.println(" Current balance is " + saver1.calculateMonthlyInterest());
		   System.out.println(" Current balance is " +saver2.calculateMonthlyInterest());
		   
		   
		   // changing the to the 5 %
		   SavingsAccount.modifyInterestRate();
		   
		   // display the new balance adding the  5%
		   System.out.println(" Current balance is " +saver1.calculateMonthlyInterest());
		   System.out.println(" Current balance is " +saver2.calculateMonthlyInterest());
		    		
		   
		   System.out.println("Numbers of Accounts created" + SavingsAccount.getAccountNumber ());
		  

	}

}
