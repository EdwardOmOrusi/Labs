package lab8.carlow;

public class Employee extends Person{

	// variables
	private  double annualSalary;

	public Employee(String name , double salary) {
		super(name);
		this.annualSalary = salary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	// getDescription
	public  String  getDescription() {
	   return "An employee with a salary of "+ annualSalary;
		
	}
	
	

}
