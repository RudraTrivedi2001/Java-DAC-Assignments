package PaymentProcessingSystem;

import java.util.Scanner;

public class PayPalPayment implements PaymentMethod{

	String email;
	
	
	
	public PayPalPayment(String email) {
		
		this.email = email;
	}
	
	public boolean processpayment(double amount) {
		System.out.println("payment request send successfully of "+amount);
		return true;
	}
	public String getpaymentdetail() {
		return email;
	}
	public void refund(double amount) {
		
		System.out.println("payment refund to the paypal accout "+amount);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		PayPalPayment ppp=new PayPalPayment("gautamsharma");
		System.out.println("enter payment of rs ");
		int payment=s.nextInt();
		ppp.processpayment(payment);
		String detail=ppp.getpaymentdetail();
		System.out.println(detail);
		System.out.println("enter how payment you want to refund ");
		int ram=s.nextInt();
		
		if(payment==ram) {
		ppp.refund(ram);
		}
		else {
			System.out.println("not valid amount");
		}
	}
	
	
}
