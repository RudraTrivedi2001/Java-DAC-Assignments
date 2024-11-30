package HaspmapAssignment3;

public class SimpleInventory {

	String name;
	int quantity;
	double price;
	
	public SimpleInventory(String name, int quantity, double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public void display() {
		
		System.out.println(name+" "+quantity+" "+price);
	}
}
