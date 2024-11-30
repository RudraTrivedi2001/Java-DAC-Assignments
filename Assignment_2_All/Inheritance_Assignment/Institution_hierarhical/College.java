package Institution;

public class College extends Institution {

	int noofst;
	
	public College(String name, String location,int noofst) {
		super(name,location);
		this.noofst=noofst;
	}
	public void nost() {
		System.out.println("nuber of student "+noofst);
	}
	
	
	public static void main(String[] args) {
		
		College c1= new College("shri vaishnav","indore",220);
		College c2= new College("Acropolis","indore",500);
		College c3= new College("iit","khadpur",100);
		
		System.out.println("------------------------");
		c1.display();
		c1.nost();
		
		System.out.println("------------------------");
		c2.display();
		c2.nost();
		
		System.out.println("------------------------");
		c3.display();
		c3.nost();
	}
}
