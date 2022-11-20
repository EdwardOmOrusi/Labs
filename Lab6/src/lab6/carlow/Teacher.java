package lab6.carlow;

import java.util.Arrays;

public class Teacher extends Person
{
	// variables
	
	private int numCourses;
	private int [] courses;
	
	// constructor
	public Teacher(String name , String address)
	{
		super(name,address);
	}

	// addCourse
	public boolean addCourse(String course) {
		return true;
		
	}

  // remove course
	public boolean removeCourse(String course) {
		
		return true;
	}
	
	// to string
		@Override
		public String toString() {
			return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) +"]";
		}

}
