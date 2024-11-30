package Assignment_2_All;

import java.util.Scanner;

class Carting{
	int pid ;
	String pname;
	float price;
	int quantity;
	
	public Carting(int pid, String pname, float price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	public void display() {
		System.out.println("product id "+pid+"\nname is "+pname+"\nproduct price"+price+"product quantity"+quantity);
	}
	
}
class ManageCart{
	
	public Carting[] createcart() {

		Carting c[]=new Carting[2];
		System.out.println("enter detail ");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<c.length;i++) {
			c[i]=new Carting(s.nextInt(),s.next(),s.nextFloat(),s.nextInt());			
		}
		return c;
		
	}
	public void remove(Carting[] c) {
		System.out.println("enter product nam eyou want to delte");
		Scanner s=new Scanner(System.in);
		int rem=s.nextInt();
		for(int i=0;i<c.length;i++) {
			if(c[i].pid==rem)
			{
				c[i]=null;
			}
			
		}
	}
	public void addtocart(Carting[] c) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		for(int i=0;i<c.length;i++) {
			if(c[i].pname!=n) {
				System.out.println("item added successfully");	
			}	
		}
		}
	public void display(Carting []c) {
		for(int i=0;i<c.length;i++) {
			c[i].display();
		}
	}
}


	
public class ShoppingCartSystem {
	public static void main(String[] args) {
		ManageCart mc=new ManageCart();
		Carting c[]=mc.createcart();
		mc.display(c);
		mc.remove(c);
		mc.display(c);
		
	}
}
