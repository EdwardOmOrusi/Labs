package lab2;



public class lab2q1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
				HotelRoom roomA = new HotelRoom ();   // Creating a instance of a object
				HotelRoom roomB = new HotelRoom();    // Creating a new instance of a object
				
				roomA.setRoomNumber(200);
				roomA.setRoomType("single");
				System.out.println("Room A room number is " + roomA.getRoomNumber()+"  and room type is " + roomA.getRoomType());
				roomB.setRoomNumber(201);
				roomB.setRoomType("double");
				System.out.println("Room B room number is " + roomB.getRoomNumber()+"  and room type is " + roomB.getRoomType());

	}

}
