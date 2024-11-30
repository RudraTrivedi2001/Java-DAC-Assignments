package vehicle;

public class Vehicle {
	int make;
	String model;
	public Vehicle(int make, String model) {
		this.make = make;
		this.model = model;
	}
	public void displaydetail() {
		System.out.println("make is to "+make+"\nmodel name "+model);
	}
	

}
