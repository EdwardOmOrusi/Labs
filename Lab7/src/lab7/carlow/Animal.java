package lab7.carlow;

public class Animal {

	// variables
	
   private String type;
   private int age;
   private  String gender;
   
   
   // constructor
   
  

public Animal(String type , int age , String gender)
   {
	   setType(type);
	   setAge(age);
	   setGender(gender);
   }



// getters and setters
public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}

public void eat ()
{
	System.out.println("Animal is eating");
}
public void sleep()
{
	System.out.println("Animal is sleeping");
}
public void  makeSound()
{
	System.out.println("Animal make sound");
}

// to string
public String toString() {
	return "Animal type=" + type + ", age=" + age + ", gender=" + gender;
}
   
   
   
}
