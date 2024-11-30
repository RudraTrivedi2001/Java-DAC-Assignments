package HasARelation;

public class Car {
 String model;
 int make;
 Enginee eg;
 
public Car(String model, int make, Enginee eg) {
	this.model = model;
	this.make = make;
	this.eg = eg;
}
	public void display() {
		
		System.out.println("model name : "+model);
		System.out.println("make       : "+make);
		eg.disenginee();
	}
 
}
