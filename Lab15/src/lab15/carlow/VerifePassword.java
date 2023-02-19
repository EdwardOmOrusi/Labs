package lab15.carlow;
import java.util.Scanner;

public class VerifePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verifier verifier = new Verifier();
		
		Scanner scanner = new Scanner (System.in);
		
		
		try
		{
		
		System.out.println("Please enter");
		String password = scanner.nextLine();
		
		verifier.verifyPasswordStrenght(password);
		
		}
		catch(Exception ex)
		{
			System.out.println("The password is not strong enough");
			
		}
	}

}
