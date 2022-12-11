package lab9.carlow;

public class Car extends RoadVehicle implements ImportDuty  {
	private String carType;
 
	public Car() {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

	@Override
	public void calculateDuty(int num) 
	{
	
		System.out.println("The tax taken is :" + CARTAXRATE*num);
	}
}