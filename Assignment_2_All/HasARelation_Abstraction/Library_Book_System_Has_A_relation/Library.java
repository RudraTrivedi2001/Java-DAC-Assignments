package HasARelation;

public class Library {
	
	String name;
	String loc;
	int lbook;
	Book b;
	
	public Library(String name, String loc, int lbook,Book b) {
		
		this.name = name;
		this.loc = loc;
		this.lbook = lbook;
		this.b=b;
	}
	public void display() {
		System.out.println("library name     : "+name);
		System.out.println("library location : "+loc);
		System.out.println("list of books    : "+lbook);
		b.bdisplay();
	}
	

}
