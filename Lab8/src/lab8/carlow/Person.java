package lab8.carlow;

public abstract class Person {
	
	// variables
	private String name;
	
	
   //  constructor
	public Person(String name) {
		
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public abstract String getDescription();
}
