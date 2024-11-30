package PaymentProcessingSystem;

public class BankTransferPayment implements PaymentMethod {

	String bankaccountnumber;
	String bankname;
	
	static double totalamount=9000;
	public BankTransferPayment(String bankaccountnumber, String bankname) {
		this.bankaccountnumber = bankaccountnumber;
		this.bankname = bankname;
	}
	
	public boolean processpayment(double amount) {
		if(totalamount>amount) {
			totalamount=totalamount-amount;
		System.out.println("process payment of "+amount);
		return true;
		}
		return false;
	}
	public String getpaymentdetail() {
		
	return 	bankaccountnumber;
	}
	public void refund(double amount) {
		if(amount>0) {
		System.out.println("initiate refund "+amount);
		}
		else {
			System.out.println("not valid");
		}
	}
	public void display() {
		System.out.println(bankaccountnumber+" "+bankname+" "+totalamount);
	}
	
	public static void main(String[] args) {
		BankTransferPayment btp=new BankTransferPayment("543223","hhhh");
		BankTransferPayment btp1=new BankTransferPayment("1234","kkkkk");
		btp.display();
		btp.processpayment(2000);
		btp.refund(200);
		System.out.println("detail acoount number "+btp.getpaymentdetail());

	}
}
