package Bank_Account;

public class Bank {

	long accno;
	float bal;
	
	public Bank(long accno, float bal) {

		this.accno = accno;
		this.bal = bal;
	}
	public void display() {
		System.out.println("account number "+accno);
		System.out.println("balance is "+bal);
	}
	
}
