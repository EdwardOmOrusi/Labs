package lab9.carlow;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Creating a array using the library items 
		LibraryItem[] items = new LibraryItem [3];
		
		LibraryItem item1 =  new LibraryItem("Cd" , "001");
		LibraryItem item2 =  new LibraryItem("Book" , "007");
		LibraryItem item3 =  new LibraryItem("Book" , "006");
		
		items[0] = item1 ;
		items[1] = item1 ;
		items[2] = item1 ;
		
		
		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[3]);
	}
	
	}


