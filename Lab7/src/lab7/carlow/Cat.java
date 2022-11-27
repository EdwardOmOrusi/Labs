package lab7.carlow;

public class Cat extends Animal {
	
	// overloading constructor 

	public Cat(String type , int age , String gender) 
	{
		super(type,age,gender);
		
	}
	// will print the cat is eating to the screen
		public void eat()
		{
			System.out.println("The Cat is eating");
		}
		// will print the cat is sleeping to the screen
		
		public void sleep()
		{
			System.out.println("The Cat is sleeping");
		}
		// will print the cat is making a sound to the screen
		
		public void makeSound()
		{
			System.out.println("Meoh Meoh");
		}

		// to string method
		public String toString() {
			return "Cat = " + super.toString() ;
		}
	
	}

