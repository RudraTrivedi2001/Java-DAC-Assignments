package Assignment_2_All;

import java.util.Scanner;

class Inve{
	
	int pid;
	String pname;
	int squantity;
	float price;
	public Inve(int pid, String pname, int squantity, float price) {
		this.pid = pid;
		this.pname = pname;
		this.squantity = squantity;
		this.price = price;
	}
	public void display() {
		System.out.println("id is "+pid+"\nproduct name "+pname+"\nstock qunatity"+squantity+"\nprice of stock "+price);
	}
}
class ManageInventory{

	public Inve[] addstock() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter detail");
		Inve in[]=new Inve[2];
		for(int i=0;i<in.length;i++) {
		in[i]=new Inve(s.nextInt(),s.next(),s.nextInt(),s.nextFloat());
		}
		return in;
	}

	public void removestock(Inve[]in) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter you want to delete1");
		int numm=ss.nextInt();
		
		for(int i=0;i<in.length;i++) {
			if(in[i].pid==numm) {
				in[i]=null;	
			}		
		}
		
	}

	public void displaystock(Inve[]in) {
		for(int i=0;i<in.length;i++) {
			in[i].display();			
		}
		
	}
	
	
}
public class InventoryManageSystem {
	public static void main(String[] args) {
		ManageInventory mi=new ManageInventory();
		
		Inve in[]=mi.addstock();
		mi.displaystock(in);
		mi.removestock(in);
		mi.displaystock(in);
	}
}


