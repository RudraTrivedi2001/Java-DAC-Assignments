package PaymentProcessingSystem;

public class CreditCard extends PaymentMethod {
	
	 void processpayment(double amount) {
		 System.out.println("your amount debited "+amount+" from card");
	 }
	 public static void main(String[] args) {
		 CreditCard cc=new CreditCard();
		 cc.processpayment(20000);
		 
		 
	}
}
