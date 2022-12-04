package lab8.carlow;

public class Triangle extends Shape {
	
	
	private double height ;
	private double base;
	
	
	public Triangle(String name, String colour , double height , double base)
	{
		super(name, colour);
		this.height = height;
		this.base = base;
	}

	// getters and setters

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}

	
	public double area() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + "]";
	}
	
	
	
	
	

}
