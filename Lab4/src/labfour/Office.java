package labfour;

public class Office {
	
	// variables
	private  int roomNumbers = 100;
	@Override
	public String toString() {
		return "Office [roomNumbers=" + roomNumbers + ", model=" + model + "]";
	}

	private String model;
	
	// constructors
	public Office()
	{
		setRoomNumbers (100);
		setModel("");
	}
	public Office(int room , String carModel)
	{
		setRoomNumbers (room);
		setModel( carModel);
	}
	
	
	
	// sets and gets of the variables
	
	public void setRoomNumbers (int room)
	{
		this.roomNumbers = room;
	}
	
	public int getRoomNumbers()
	{
		return this.roomNumbers;
	}
	
	 public void setModel(String carModel)
	 {
		 this.model = carModel;
	 }
	 
	 public String getModel()
	 {
		 return this.model;
	 }

}
