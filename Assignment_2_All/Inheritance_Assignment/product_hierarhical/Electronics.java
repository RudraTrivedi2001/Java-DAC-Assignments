package product;

public class Electronics extends Product {

	int warrantyPeriod;
	
	public Electronics(int pid, String pname,int warrantyPeriod) {
		super(pid, pname);
		this.warrantyPeriod=warrantyPeriod;
	}
	
	
	public void wperiod() {
		System.out.println("warranty Period of the product "+warrantyPeriod);
	}
	
	public static void main(String[] args) {
		Electronics e1=new Electronics(101,"iphone",1);
		Electronics e2=new Electronics(111,"laptop",2);
		Electronics e3=new Electronics(123,"mixer",1);
		System.out.println("----------------------------");
		e1.display();
		e1.wperiod();
		
		System.out.println("----------------------------");
		e2.display();
		e2.wperiod();
		
		System.out.println("----------------------------");
		e3.display();
		e3.wperiod();
	}
}
