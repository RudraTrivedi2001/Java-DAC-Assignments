package VehicleRentalService;

public class Bike extends Vehicle{

	String licenseplate;
	int rentalpriceperday;
	
	String engine;
	boolean hassideglass;
	
	
	 public Bike(String licenseplate, int rentalpriceperday, String engine, boolean hassideglass) {

		this.licenseplate = licenseplate;
		this.rentalpriceperday = rentalpriceperday;
		this.engine = engine;
		this.hassideglass = hassideglass;
	}
	 public void display() {
		 System.out.println("license plate "+licenseplate);
		 System.out.println("rental price   "+rentalpriceperday);
		 System.out.println("engine type   "+engine);
		 System.out.println("have glasses   "+hassideglass);
		 
	 }
	void calculaterentalcost(int days) {
		rentalpriceperday=rentalpriceperday*days;
		System.out.println("total rent of bike per day "+rentalpriceperday);
				
	}
	 public static void main(String[] args) {
		 Bike b=new Bike("mp09cn5543",200,"ktm",false);
		 b.display();
		 b.calculaterentalcost(3);
	}
}
