package lab2;


public class lab2q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelRoom roomA = new HotelRoom ();   // Creating a instance of a object
		HotelRoom roomB = new HotelRoom();    // Creating a new instance of a object
		
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("single");
		System.out.println("Room A room number is " + roomA.getRoomNumber()+"  and room type is " + roomA.getRoomType());
		
		// if room A is occupied will display a message to the screen if not will display other message
		
				if (roomA.getVacantRoom() == 1)
				{
					System.out.println("Room A is ocuppied and is rate is " + roomA.getRate());
				}
				else
				{
					System.out.println("Room A is not occupied  and is rate is " + roomA.getRate());
				}
		
		//setting variables for room B
				
		roomB.setRoomNumber(201);
		roomB.setRoomType("double");
		System.out.println("Room B room number is " + roomB.getRoomNumber()+"  and room type is " + roomB.getRoomType());
		//settings the variables of the sets of room A
		roomA.setVacantRoom(1);
		roomA.setRate(100);
		
		
		
		
		//settings the variables of the sets of room B
				roomB.setVacantRoom(0);
				roomB.setRate(80);
				
				
				// if room B is occupied will display a message to the screen if not will display other message
				if (roomB.getVacantRoom() == 1)
				{
					System.out.println("Room B is ocuppied and is rate is " + roomB.getRate());
				}
				else
				{
					System.out.println("Room B is not occupied  and is rate is " + roomB.getRate());
				}


	}

}
