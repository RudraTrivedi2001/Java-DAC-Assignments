package LibrarymanagementSystem;

public class Book {

	String title;
	String author;
	int publicationofyear;
	long isbn;
	
	public Book(String title, String author, int publicationofyear, long isbn) {
	
		this.title = title;
		this.author = author;
		this.publicationofyear = publicationofyear;
		this.isbn = isbn;
	}
	
	public void display() {
		System.out.println(title+author+publicationofyear+isbn);
	}
	
}
