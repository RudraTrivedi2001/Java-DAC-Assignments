package Assignment_2_All;

import java.util.Scanner;

//Q2 bank account management 
public class BankAccountManagement {
	long accnum;
	String accholname;
	float balance;
	
	public long getAccnum() {
		return accnum;
	}

	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}

	public String getAccholname() {
		return accholname;
	}

	public void setAccholname(String accholname) {
		this.accholname = accholname;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposite(float dep) {
		setBalance(balance+dep);
		System.out.println("credited successfullyy "+dep);
	}
	
	public void withdrawl(float with) {
		setBalance(balance-with);
		System.out.println("withdrawl successfullyy "+with);
	}
	public void display() {
		System.out.println(" updated total balance is "+getBalance());
	}


	public static void main(String[] args) {
		
		BankAccountManagement bam1=new BankAccountManagement();
		BankAccountManagement bam2=new BankAccountManagement();
		System.out.println("first account detail");
		bam1.setAccnum(9876543);
		bam1.setAccholname("raja");
		bam1.setBalance(50000);
		System.out.println("account number = "+bam1.getAccnum()+"\naccount holder name = "+bam1.getAccholname()+"\nbalance = "+bam1.getBalance());
		System.out.println("--------------------------------");
		Scanner ss=new Scanner(System.in);
		System.out.println("enter 1 for deposite");
		System.out.println("enter 2 for withdrawl");
		int c1=ss.nextInt();

		switch(c1) {
		case 1:System.out.println("enter amount for deposite");
		float dep=ss.nextFloat();
		bam1.deposite(dep);
		bam1.display();
		break;
		case 2:System.out.println("enter amount for withdrawl");
		float with=ss.nextFloat();
		bam1.withdrawl(with);
		bam1.display();
		break;
		default: System.out.println("invalid ");
		}
		System.out.println("------second account ---------");
		bam2.setAccnum(56767);
		bam2.setAccholname("shyam");
		bam2.setBalance(3000);
		System.out.println("account number = "+bam2.getAccnum()+"\naccount holder name = "+bam2.getAccholname()+"\nbalance = "+bam2.getBalance());
		System.out.println("--------------------------------");
		
		System.out.println("enter 1 for deposite");
		System.out.println("enter 2 for withdrawl");
		int c2=ss.nextInt();
		switch(c2) {
		case 1:System.out.println("enter amount for deposite");
		float dep=ss.nextFloat();
		bam2.deposite(dep);
		bam2.display();
		break;
		case 2:System.out.println("enter amount for withdrawl");
		float with=ss.nextFloat();
		bam2.withdrawl(with);
		bam2.display();
		break;
		default: System.out.println("invalid ");
		
		}
	}
}
