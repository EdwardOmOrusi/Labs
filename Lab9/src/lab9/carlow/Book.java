package lab9.carlow;

public class Book extends LibraryItem implements LoanItem{
	
	// variables
	
	private String author ;
	private String title;
	private int  numPages;
	
	
	//constructor
	public Book(String type , String ID ,String author, String title, int numPages) {
		super(type ,ID);
		this.author = author;
		this.title = title;
		this.numPages = numPages;
	}

// setters and getters
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumPages() {
		return numPages;
	}


	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

//  calculate price of book
	public void calculatePrice() {
		System.out.println("The price is: " + numPages /2);
		
	}

	// to string
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + "]";
	}
	
	
	

}
