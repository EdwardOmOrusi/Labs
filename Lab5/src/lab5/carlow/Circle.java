package lab5.carlow;

public class Circle extends Point{
	
	// variables
	
	private double radius;
	
	// constructor
	
	public Circle(double radius , double x , double y)
	{
		super(x,y);
		this.radius = radius;
	}
		

// setters and getters of radius 
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

// to string 
	public String toString() {
	return "Circle radius=" + radius + " X ="+ x + " Y ="+ y;
	}

	

}
