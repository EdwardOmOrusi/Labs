package lab7.carlow;

public class Dog extends Animal {

	// Constructor overloading
	public Dog(String type, int age, String gender) 
	{
		super(type, age, gender);
		
	}
	// will print the dog is eating to the screen
	public void eat()
	{
		System.out.println("The Dog is eating");
	}
	// will print the dog is sleeping to the screen
	public void sleep()
	{
		System.out.println("The Dog is sleeping");
	}
	// will print the dog is making a sound to the screen
	public void makeSound()
	{
		System.out.println("Woof woof");
	}

	// to string method 
	public String toString() {
		return "Dog = " + super.toString() ;
	}
	
	
}

