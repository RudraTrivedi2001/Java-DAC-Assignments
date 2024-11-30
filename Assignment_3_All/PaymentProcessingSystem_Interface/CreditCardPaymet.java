package PaymentProcessingSystem;

import java.util.Scanner;

public class CreditCardPaymet implements PaymentMethod  {
	
	String cnumber;
	String choldername;
	String expirationdate;
	int cvv;
	
	
	
	 public CreditCardPaymet(String cnumber, String choldername, String expirationdate, int cvv) {
		this.cnumber = cnumber;
		this.choldername = choldername;
		this.expirationdate = expirationdate;
		this.cvv = cvv;
	}
	 
	public boolean processpayment(double amount) {
		System.out.println("enter cvv");
		 Scanner s=new Scanner(System.in);
		 int checkcvv=s.nextInt();
		 if(cvv==checkcvv)
		 {
			 System.out.println("cvv correct");
			 System.out.println("payment is completed "+amount);
			 
			 return true;
			 
		 }
		return false;
	}
	public String getpaymentdetail() {
		
		return cnumber;
		
	}
	public void refund(double amount) {
		
		
		if(amount>0) {
			System.out.println("refund of "+amount+" initiate");
			System.out.println("initiate refund in 24 hours");
			
		}else {
			System.out.println("not");
		}
	
			
		}
	
	public void display() {
		System.out.println(cnumber+choldername+expirationdate);
	}
	public static void main(String[] args) {
		
		
		
		CreditCardPaymet cp=new CreditCardPaymet("234567","gautam","31-09-2025",123);
		boolean eq=true;
		while(eq) {
		System.out.println("enter 1 for paymetn");
		System.out.println("enter 2 for display detail");
		System.out.println("enter 3 for refund");
		System.out.println("enter 4 for last payment detail");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		
		switch(number) {
		
		case 1:cp.processpayment(1200);break;
		case 4:System.out.println("detail of cardnumber "+cp.getpaymentdetail());
		
		break;
		case 3:cp.refund(1000);break;
		case 2:cp.display();eq=false;break;
		}
		}
		
	}
	}


