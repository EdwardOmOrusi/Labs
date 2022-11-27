package lab7.carlow;

public class Vet  extends Animal{
	
	//variables
	private  String name ;
	
	
	// constructor
	public Vet (String name , String type , int age , String gender )
	{
		super(type , age , gender);
		this.name =name;
	}

	//  setting and getting
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	// vaccinated method
	public  void Vaccinated(Animal  animal )
	{
		
		System.out.println(name + "  is vaccinating ");
		
		if(animal.getType() == "Poodle")
		{
			System.out.println("The Dog has been vaccinated");
			
		}
		if(animal.getType() =="Mixed")
		{
			System.out.println("The Dog has been vaccinated");
		}
		
	}
}
