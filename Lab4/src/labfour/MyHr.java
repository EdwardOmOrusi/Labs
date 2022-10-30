package labfour;

import java.util.Scanner;
public class MyHr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// variables
		int options = 0;
		int  employees = 0;
		Employee[] employee = new Employee[5];
		 
		// while loop
		
		while(options != 4)
		{
			
		 // asking the user to choice a options
		 
		 System.out.println("Please choice a options available:");
		 System.out.println("1. List all offices");
		 System.out.println("2. Create a new employee record");
		 System.out.println("3. List all employees");
		
		 
		 options = in.nextInt();
		 
		 if(options == 1)
		 {
		 System.out.println("Option 1");
		 }
		 else if(options == 2)
		 {
			 
			 if(employees<5)
	   {
			 Scanner input = new Scanner(System.in);
			 int employeeNum ;
			 String name ;
			 String surname ;
			 String type;
			 String street  ;
			 String town ;
			 String county ;
			 
			 
			 
			 
		 System.out.println("Please insert your name");
		 name = input.nextLine();
		 
		 
		 System.out.println("Please insert your surname");
		 surname = input.nextLine();
		 
		 
		 
		 System.out.println("Are you are manager or staff");
		 type = input.nextLine();
		 
		 
		 System.out.println("Employee number");
		 employeeNum = input.nextInt();
		 
		 
		 System.out.println("Enter your street");
		 street = input.nextLine();
		 
		 
		 System.out.println("Enter your Town");
		 town = input.nextLine();
		 
		 
		 System.out.println("Enter your county");
		 county = input.nextLine();
		 
		 
		 Address address1 =  new Address(street , town , county);
		 Employee employee1 = new Employee(employeeNum , name , surname , type , address1);
		
		 
		 employee[employees] = employee1;
		 employees++;
	   } 
		 // if the user the to enter more that 5 employees the program will display a message
			 else {
				 System.out.println("You can only add 5 employees!");
			 }
		 }
		 else if(options == 3)
		 {
		 
		  for (Employee employee1:employee)
		   {
			 if(employee1!=null)
			 {
				System.out.println(employee1.toString()) ;
		     }
		 }
		
		
		 
		
		}
		 
		}
		
	}
}

		 
		
	


