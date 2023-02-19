package lab15.carlow;

public class Verifier {
	
	// attribute 
	
	MyOutOfRangeException myOutOfrange ;
	
	
	
	
	
	public static void verifyIntRange(int value , int low1 , int high2)
	{
		if ((low1 >= value) &&  (value <= high2))
		{
			System.out.println("The Value is correct");
		}
	}
	
	public static void verifyPasswordStrenght(String password)
	{
		if (password.length() >= 8)
		{
			System.out.println( password + "Is Strong enough");
		}
	}
	

}
