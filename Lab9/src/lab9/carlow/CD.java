package lab9.carlow;

public class CD extends LibraryItem implements LoanItem{
	
	// variables
	
	private String band ; 
	private String title;
	private int numpages;
	
	// constructor
	public CD(String type, String iD, String band, String title, int numpages) {
		super(type, iD);
		this.band = band;
		this.title = title;
		this.numpages = numpages;
	}

	// getters and setters 
	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumpages() {
		return numpages;
	}

	public void setNumpages(int numpages) {
		this.numpages = numpages;
	}

	//  calculate price of cd
	public void calculatePrice() {
		
		System.out.println("The price is: " + numpages*1.5);
		
	}

	// to string 
	public String toString() {
		return "CD [band=" + band + ", title=" + title + ", numpages=" + numpages + "]";
	}
	
	
	

}
