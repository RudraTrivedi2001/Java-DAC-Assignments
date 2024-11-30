package VehicleRentalService;

public class Car extends Vehicle{
	
	String licenseplate;
	int rentalpriceperday;
	
	int noofdoors;
	boolean isautomatic;
	
	 public Car(String licenseplate, int rentalpriceperday, int noofdoors, boolean isautomatic) {
		this.licenseplate = licenseplate;
		this.rentalpriceperday = rentalpriceperday;
		this.noofdoors = noofdoors;
		this.isautomatic = isautomatic;
	}
	 public void display() {
		 System.out.println("license plate "+licenseplate);
		 System.out.println("rental price   "+rentalpriceperday);
		 System.out.println("number of doors  "+noofdoors);
		 System.out.println("automatic or not "+isautomatic);
	 }
	 
	 

	void calculaterentalcost(int days) {
		rentalpriceperday=rentalpriceperday*days;
		System.out.println("total rent is "+rentalpriceperday);
	}
	public static void main(String[] args) {
		
		Car c =new Car("mp09ct5543",300,4,true);
		c.display();
		c.calculaterentalcost(4);
	}

}
