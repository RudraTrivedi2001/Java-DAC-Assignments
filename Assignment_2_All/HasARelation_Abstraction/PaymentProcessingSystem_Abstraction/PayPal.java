package PaymentProcessingSystem;

public class PayPal extends PaymentMethod {

	void processpayment(double amount) {
		System.out.println("your amount debited "+amount+" through UPI");
	}
	public static void main(String[] args) {
		PayPal pp= new PayPal();
		pp.processpayment(300000);
	}
}
