package lab8.carlow;

public abstract class TestPerson {

	public static void main(String[] args) {
 
		// creating objects of student and person 
		Person person;
		Student student = new Student("Eric" , "Computer Science");
		Employee employee =  new Employee("James" , 12000);
		
		
		//  printing the description and the name of the student
		person =  student ;
		System.out.println("The Name of the is :" + student.getName());
		System.out.println(student.getDescription());
		
		
		// printing the description and name of the employee
        person =  employee ;
        System.out.println("The Name of the is :" + employee.getName());
		System.out.println(employee.getDescription());
		
	}
	

}
