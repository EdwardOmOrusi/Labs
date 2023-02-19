package lab15.carlow;

public class MyOutOfRangeException  extends Exception{
	
		
		public MyOutOfRangeException ()
		{
			super("Invalid Number");
		}
		
		public MyOutOfRangeException (String message)
		{
			super(message);
		}
	
}
