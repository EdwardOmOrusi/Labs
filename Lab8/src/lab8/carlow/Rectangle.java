package lab8.carlow;

public class Rectangle extends Shape {
	
	
	// private variables
	
		private String name;
		private String colour;
		private double lenght;
		private double breadth;
		
		
		
		
		
		
		public Rectangle(String name, String colour , double lenght , double breadth ) 
		{
		super(name, colour);
		this.lenght = lenght;
		this.breadth = breadth;
		
		}




// setters and getters

		public String getName() {
			return name;
		}






		public void setName(String name) {
			this.name = name;
		}






		public String getColour() {
			return colour;
		}






		public void setColour(String colour) {
			this.colour = colour;
		}






		public int getLenght() {
			return lenght;
		}






		public void setLenght(double lenght) {
			this.lenght = lenght;
		}






		public int getBreadth() {
			return breadth;
		}






		public void setBreadth(double breadth) {
			this.breadth = breadth;
		}




		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	
		

}
