package lab8.carlow;

public class Student extends Person {
	
	// variables
	private String course ; 
	
	// constructor
	public Student(String name , String course) {
		super(name);
		this.course = course;
		
	}
// getters and setters
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	// getDescription
		public  String  getDescription() {
		   return "A Student Studying" + course;
			
		}
	
	
	

}
