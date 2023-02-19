package lab15.carlow;

import java.util.Scanner;

public class VerifyRangeTest {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Verifier ver = new Verifier();
		
		
		MyOutOfRangeException my = new MyOutOfRangeException();
		Scanner scanner = new Scanner (System.in);
		
		
		try
		{
		System.out.println("Please enter");
		int input = scanner.nextInt();
		
		System.out.println("Please enter the lowest number");
		int low1= scanner.nextInt();
		
		System.out.println("Please enter the highest number");
		int high2 = scanner.nextInt();
		
		
		Verifier.verifyIntRange(input, low1, high2);
		
		}
	catch(Exception ex)
	   {
		System.out.println("Invalid");
	   }
	}
	 
		
}
	
