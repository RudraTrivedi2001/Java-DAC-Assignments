package Bank_Account;

public class Checking extends Bank {
	
float odraft;
	public Checking(long accno, float bal,float odraft) {
		super(accno, bal);
		this.odraft=odraft;
	}
	
	public void withdrawl() {
		bal=bal- odraft;
		System.out.println(odraft);
		System.out.println(bal);
		}
	public void odraft(float t) {
		if(bal<-1000)
		{
			float ttl=(bal*8*t)/100;
			bal=bal+ttl;
			System.out.println("overall interest is " + ttl);
		}
	}
	
	public static void main(String[] args) {
		Checking c1=new Checking(1234,-40f,2.01f);
		
		c1.withdrawl();
		c1.odraft(1);
		c1.display();
	}

}
