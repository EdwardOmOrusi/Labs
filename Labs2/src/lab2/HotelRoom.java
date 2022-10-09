package lab2;

public class HotelRoom {
	// Variables 
			private int roomNumber ;
			
			private String roomType;
			private int vacantRoom;
			private double rate ;
			
			// constructor
			  public HotelRoom()
			  {
				 
			  }
			  
			 // second constructor
		    public HotelRoom(int roomNumb , String roomTyp , int vacantR , double rateRoom)
		    {
			roomNumber= roomNumb;
			roomType = roomTyp ;
			vacantRoom = vacantR;
			rate = rateRoom;
			
			
		    }
				
			 
			 
			public void setRoomNumber (int room)
			{
				roomNumber = room;
			}
			
			public int getRoomNumber()
			{
				return roomNumber;
			}
			
			public void setRoomType (String type)
			{
				roomType = type ;
			}
			
			public String getRoomType ()
			{
			return roomType ;
			
			}
		
			public void  setVacantRoom(int vacant)
			{
				vacantRoom = vacant ;
			}
			
			public int getVacantRoom()
			{
				return vacantRoom; 
			}
			public void setRate (double rateOfRoom )
			{
				rate = rateOfRoom ;
			}
			public double getRate()
			{
				return rate ;
			}
			

}
