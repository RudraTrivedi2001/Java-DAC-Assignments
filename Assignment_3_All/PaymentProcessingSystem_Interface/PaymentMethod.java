package PaymentProcessingSystem;

public interface PaymentMethod {
	boolean processpayment(double amount);
	String getpaymentdetail();
	void refund(double amount);
}
