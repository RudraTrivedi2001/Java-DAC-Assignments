package HasARelation;

public class TestLibraryBook {

	public static void main(String[] args) {
		Book b=new Book("kayamat ki raat ","dinesh pandit",1234567);
		Library l=new Library("indore","vijay nagar",500,b);
		l.display();
	}
}
