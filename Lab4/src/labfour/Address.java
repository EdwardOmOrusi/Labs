package labfour;

public class Address {
	
	// variables
	private String street;
	 private String town;
	 private String county;
	 
	 // constructor
	 public Address(String street , String  town , String  county )
	 { 
		 setStreet(street);
		 setTown(town);
		 setCounty(county);
	 }
	 
	 // sets and gets 
	 public void setStreet(String street)
	 {
		 this.street= street;
	 }
	 
	 public String getStreet()
	 {
		 return this.street;
	 }
	 
	 public void setTown(String town)
	 {
		 this.town = town;
	 }
	 
	 public String getTown()
	 {
		 return this.town;
	 }

	 public void setCounty(String county)
	 {
		 this.county= county;
	 }
	 
	 public String getCounty()
	 {
		 return this.county;
	 }

	// to string
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", county=" + county + "]";
	}
	 
}
