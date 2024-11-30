package Method_Overloading;

public class LibraryManagement {

	
	public void addbook(String title,String author) {
		System.out.println("title is "+title);
		System.out.println("author  is "+author);
	}
	
	public void addbook(String title,String author,int year) {
		System.out.println("title is "+title);
		System.out.println("author  is "+author);
		System.out.println("year  is "+year);
	}
	public void addbook(String title,String author,int year,String genre) {
	System.out.println("title is "+title);
	System.out.println("author  is "+author);
	System.out.println("year  is "+year);
	System.out.println("type of book genre is "+genre);
	
		}
	public static void main(String[] args) {
		
		LibraryManagement lm=new LibraryManagement();
		System.out.println(" ------------1st method-----------------");
		lm.addbook("kayamat ki raat ", "dinesh pandit");
		System.out.println(" ------------2nd method-----------------");
		lm.addbook("gullivers gravel","vasco di gama",2000);
		System.out.println(" ------------3rd method-----------------");
		lm.addbook("mahabharat","arjun",1900,"history");
		
	}
}
