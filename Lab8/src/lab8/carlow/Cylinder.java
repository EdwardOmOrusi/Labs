package lab8.carlow;

public class Cylinder extends ThreeDShape {
	
	
	// private variables
		private String name;
		private String  colour;
		private double height;
		private  double radius;
		
		
		
	// constructor	
		public Cylinder(String name, String colour , double height ,  double radius ) {
			super(name, colour);
			this.radius = radius;
			this.height = height;
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



		public  double getHeight() {
			return height;
		}



		public void setHeight(double height) {
			this.height = height;
		}



		public double getRadius() {
			return radius;
		}



		public void setRadius(double radius) {
			this.radius = radius;
		}





		@Override
		public String toString() {
			return "Cylinder name=" + this.name + ", colour=" + this.colour + ", height=" + height + ", radius=" + radius ;
		}


		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public double volume() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	

}
