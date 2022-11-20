package lab6.carlow;

import java.util.Arrays;

public class Student extends Person {
	
	// variables
	
	private int numCourses ;
	private int [] grades ;
	private String[] courses;
	
	// constructor 
	
	public Student (String name , String address)
	{
		super(name , address);
	}

	// To string
	public String toString() {
		return "Student numCourses=" + numCourses + ", grades=" + Arrays.toString(grades) + ", courses="+ Arrays.toString(courses);
	}

    // Add course grade 
	public void addCourseGrade(String string, int grades)
	{
    
	}
	
		

	public void printGrades() {
		// TODO Auto-generated method stub
		
	}

	public String getAverageGrade() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

