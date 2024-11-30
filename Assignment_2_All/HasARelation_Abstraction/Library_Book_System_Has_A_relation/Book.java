package HasARelation;

public class Book {
String title;
String author;
long isbn;

public Book(String title, String author, long isbn) {
	
	this.title = title;
	this.author = author;
	this.isbn = isbn;
}
public void bdisplay() {
	System.out.println("title of the book   : "+title);
	System.out.println("author of the book  : "+author);
	System.out.println("ISBN number  		: "+isbn);
}


}
