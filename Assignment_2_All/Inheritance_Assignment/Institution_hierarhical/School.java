package Institution;

public class School extends Institution {
	
	int nooffact;
	

	public School(String name, String location,int nooffact) {
		super(name,location);
		this.nooffact=nooffact;
	}
	public void nofact() {
		System.out.println("number of faculties "+nooffact);
	}
	public static void main(String[] args) {
		School s1=new School("indore public school","sanwer",20);
		School s2=new School("karnatka vidhya niketan","indore",12);
		School s3=new School("holy family ","bhopal",50);
		System.out.println("---------------------------------");
		s1.display();
		s1.nofact();
		
		System.out.println("---------------------------------");
		s2.display();
		s2.nofact();
		
		System.out.println("---------------------------------");
		s3.display();
		s3.nofact();
	}

}
