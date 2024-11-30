package product;

public class Product {

	int pid;
	String pname;
	public Product(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}
	public void display() {
		System.out.println("product id is    "+pid);
		System.out.println("product name  is "+pname);
	}
	
}
