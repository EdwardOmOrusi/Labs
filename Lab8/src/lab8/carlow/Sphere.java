package lab8.carlow;

public class Sphere extends ThreeDShape {
	
	// private variables
		private String name;
		private String  colour;
		private double radius;
		
		
		
		// constructor
		public Sphere(String name, String colour, double radius  ) 
		{
			super(name, colour);
			this.radius = radius;
			
		
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


		public double getRadius() {
			return radius;
		}


		public void setRadius(double radius) {
			this.radius = radius;
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
