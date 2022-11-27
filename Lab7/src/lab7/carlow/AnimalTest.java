package lab7.carlow;

//Author 			: Edward Omorusi
//Date 			    : 24/11/2022
//Purpose 			: A test driver program for our Animal class

public class AnimalTest
{
	public static void main (String args[])
	{
		// creating two objects using the animal and vet class
		Animal dog = new Dog("Poodle", 4, "Male");
		Vet  dog1= new Vet("Wilson" , "Poodle" , 5 , "Male");
		// Printing the details of the dog to the screen
		
		// using the vaccinated method
		dog1.Vaccinated(dog1);
		
		//printing dog details
		System.out.println(dog);
		
		System.out.println();
		
		// Creating two objects using the animal and vet class
		Animal cat = new Cat("Mixed", 2, "Female");
	    Vet cat1 = new Vet("Laura" , "Mixed" , 2 , "Female");
	    // Printing the details of the cat to the screen	
		
		
		// using the vaccinated method
		cat1.Vaccinated(cat1);
		//printing cat details
		System.out.println(cat);
		
		

		
		
		

		}
}