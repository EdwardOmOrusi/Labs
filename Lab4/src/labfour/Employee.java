package labfour;

public class Employee {
	// variable
	
	 private int employeeNumber = 1000;
	 private String employeeName;
	 private String employeeSurname;	 
	 private String employeeType;
	 private  Address addressVar ;
	 private  Office  staff;
	 
	 
	 // constructors
	 
	 public Employee()
	 {
		 setEmployeenumber(1000);
		 setEmployeename("");
		  setEmployeesurname("");
		   setEmployeetype("");
		   
		 
	 }

	 public Employee(int employeeNum , String name , String surname , String type , Address addresVar )
	 {
	   setEmployeenumber(employeeNum);
	   setEmployeename(name);
	   setEmployeesurname(surname);
	   setEmployeetype(type);
	   setAddress(addresVar);
	  
	   
	 }
	 
	
	 // sets and gets 
	 public void setAddress(Address address)
	 {
		 this.addressVar = address;
	 }
	 
	 public Address getAddress()
	 {
		 return this.addressVar;
	 }
	 
	 public void setOffice(Office staff)
	 {
		 this.staff = staff;
	 }
	 
	 public Office getOffice()
	 {
		 return this.staff;
	 }
	 
	 
	 
	 public void setEmployeenumber(int employeeNum)
	 {
		 this.employeeNumber = employeeNum;
	 }
	 
	 public int getEmployeenumber()
	 {
		 return this.employeeNumber;
	 }
	 
	 public void setEmployeename(String name)
	 {
		 this.employeeName = name;
	 }
	 
	 public String getEmployeename()
	 {
		 return this.employeeName;
	 }
	 
	 public void setEmployeesurname(String surname)
	 {
		 this.employeeSurname = surname;
	 }
	 
	 public String getEmployeesurname()
	 {
		 return this.employeeSurname;
	 }
	 
	 public void setEmployeetype(String type)
	 {
		 this.employeeType = type;
	 }
	 
	 public String getEmployeetype()
	 {
		 return this.employeeType;
	 }

	 
	
			
	 
	// to String
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSurname="
				+ employeeSurname + ", employeeType=" + employeeType + "]";
	}
	 
	
	 
	 

}

