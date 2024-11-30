package VehicleRentalService;

public abstract class Vehicle {
	
	String licenseplate;
	int rentalpriceperday;
	abstract void calculaterentalcost(int days);

}
