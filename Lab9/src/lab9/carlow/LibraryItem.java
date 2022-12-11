package lab9.carlow;

public class LibraryItem {
	
	// variables
	
	private String type;
	private String ID;
	
	
	//constructor
	public LibraryItem(String type, String iD) {
		
		this.type = type;
		ID = iD;
	}

// setters and getters
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "LibraryItem [type=" + type + ", ID=" + ID + "]";
	}

	
	
	
	


}
