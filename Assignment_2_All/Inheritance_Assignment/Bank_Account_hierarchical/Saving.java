package Bank_Account;

public class Saving extends Bank{

	float intrestrate;
	public Saving(long accno, float bal,float intrestrate) {
		super(accno, bal);
		this.intrestrate=intrestrate;
	}
	public void interest(int t) {
		float ttl=(bal*intrestrate*t)/100;
		bal=bal+ttl;
		System.out.println("overall interest is " + ttl);
		super.display();
	}

	
	
	public static void main(String[] args) {
		Saving s1=new Saving(12233,30f,2.5f);
		Saving s2=new Saving(88437,90f,10.9f);
		Saving s3=new Saving(890234,10.90f,1.8f);
		System.out.println("---------------");
		s1.display();
		s1.interest(3);
		
		System.out.println("---------------");
		s2.display();
		s2.interest(5);
		
		System.out.println("---------------");
		s3.display();
		s3.interest(2);
		
	}
}
