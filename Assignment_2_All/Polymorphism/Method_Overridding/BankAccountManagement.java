package Method_Overridding;

class Account {
	
	long accno;
	float bal;
	public Account(long accno, float bal) {
		this.accno=accno;
		this.bal=bal;
	}
	public float calculateintrest() {
		return bal;
	}
	
}
class SavingsAccount extends Account{
	float interestrate;
	int time;
	
	SavingsAccount(long accno, float bal,float interestrate,int time){
		super(accno, bal);
		this.interestrate=interestrate;
		this.time=time;
	}
	
	public float calculateintrest() {
		return bal=(bal*interestrate*time)/100;
	}
	
}


class CheckingAccount extends Account{
	
	float interestrate;
	int time;
	CheckingAccount(long accno, float bal,float interestrate,int time){
		super(accno, bal);
		this.interestrate=interestrate;
		this.time=time;
	}
	public float calculateintrest() {
		if(bal<-1000) {
			bal=bal*interestrate*time;	
		}
		return bal;
	}
}
	


	

	

class BusinessAccount extends Account{
	
	float interestrate;
	int time;
	
	BusinessAccount(long accno, float bal,int time){
		super(accno, bal);
		this.time=time;
	}
	
	public float calculateintrest() {
		return bal=(bal*4*time)/100;
	}	
}



public class BankAccountManagement {
public static void main(String[] args) {
	
	SavingsAccount sv=new SavingsAccount(1234,2000f,1.2f,3);
	System.out.println("interest for balance is "+sv.calculateintrest());
	System.out.println("-------------------------------");
	CheckingAccount ca=new CheckingAccount(3456,-3000f,0.08f,2);
	System.out.println("interest for balance is "+ca.calculateintrest());
	System.out.println("-------------------------------");
	BusinessAccount ba=new BusinessAccount(8796,4000,2);
	System.out.println("interest for balance is "+ba.calculateintrest());
}
}
