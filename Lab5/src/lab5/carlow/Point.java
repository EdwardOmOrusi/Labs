package lab5.carlow;

public class Point {
	
	// variables 
	
	protected double x ;
	protected double y;
	
	// constructor
	
	 Point(double xPoint , double yPoint)
	{
		x = xPoint;
	    y = yPoint;
	}
	
	//Settings setters and getters for x and y


	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}

	// to string 
	public String toString() {
		return "Point x=" + x + ", y=" + y + "";
	}
	
	
	
	

	
}
