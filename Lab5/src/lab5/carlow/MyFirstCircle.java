package lab5.carlow;

//Author    :Edward Omorusi
	//Date      :03/11/2022
	//Purpose   :A test driver for our  Point/Circle inheritance
	

public class MyFirstCircle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating new objects for Point and Circle
		Point myPoint = new Point(20,10);
		
		Circle myCircle = new Circle(15,30,5);
		
		
       // Printing the values to the screen
		
		System.out.println("Point Details" + myPoint);
		
		System.out.println(" Circle Details" + myCircle);
		
		
	}

}
