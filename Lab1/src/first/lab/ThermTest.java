package first.lab;

	// Student Name 	: Edward Omorusi
	// Student Id Number: C00258296
	// Date 			: 27/09/2022
	// Purpose 			: My first class implementation

	public class ThermTest
	{ // begin class ThermTest
		public static void main(String args[])
		{ 
			// variable 
			double tempB;
			// being main method
			

			Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
			Thermometer thermB =  new Thermometer();    // Create a new instance object

			System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			thermA.setCelsius(20.0);
			System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			thermB.setCelsius(10.0);
			//Storing the data from the thermB to tempB
			tempB = thermB.getCelsius() ;
			
			// printing the value to the screen
			System.out.println("Temp. of Thermometer B is " + tempB);
		} // end main
	} // end class ThermTest