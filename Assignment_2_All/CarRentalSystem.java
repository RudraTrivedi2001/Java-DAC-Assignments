package Assignment_2_All;

import java.util.Scanner;

//Q5 car rental per day.

public class CarRentalSystem {

	String carmodel;
	long regnum;
	int rentalperday;
	static boolean available;
	static int global;
	
	int fordays;
	int totalrent;
	void rentcar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days ");
		fordays=sc.nextInt();
		System.out.println("car is rented for "+fordays);
	}
	public int carreturn() {
		totalrent=fordays*rentalperday;
		return totalrent;
	}
	public void displaycharge() {
		System.out.println("your total rent for  "+fordays+" days = "+global+"Rs");
		
	}
	
	public static void main(String[] args) {
		CarRentalSystem crs1=new CarRentalSystem();
		CarRentalSystem crs2=new CarRentalSystem();
		CarRentalSystem crs3=new CarRentalSystem();
		CarRentalSystem crs4=new CarRentalSystem();
		CarRentalSystem crs5=new CarRentalSystem();
		System.out.println("------first object------");
		crs1.carmodel="hyunai";
		crs1.regnum=34567;
		crs1.rentalperday=1200;
		crs1.available=true;
		System.out.println("car model = "+crs1.carmodel+"\nregistration number = "+crs1.regnum+"\nrent per day = "+crs1.rentalperday+"\navailability = "+crs1.available);
		if(available==true) {
		crs1.rentcar();
		global=crs1.carreturn();
		crs1.displaycharge();
		}
		else
			System.out.println("======car is not available=====");
		
		System.out.println("------second object------");
		crs2.carmodel="suzuki";
		crs2.regnum=987654872;
		crs2.rentalperday=500;
		crs2.available=true;
		System.out.println("car model = "+crs2.carmodel+"\nregistration number = "+crs2.regnum+"\nrent per day = "+crs2.rentalperday+"\navailability = "+crs2.available);
		
		if(available ==true){
		crs2.rentcar();
		global=crs2.carreturn();
		crs2.displaycharge();
		}else
		System.out.println("======car is not available=====");
		
		System.out.println("------Third object------");
		crs3.carmodel="tata";
		crs3.regnum=10001111;
		crs3.rentalperday=800;
		crs3.available=false;
		System.out.println("car model = "+crs3.carmodel+"\nregistration number = "+crs3.regnum+"\nrent per day = "+crs3.rentalperday+"\navailability = "+crs3.available);
		if(available==true) {
		crs3.rentcar();
		global=crs3.carreturn();
		crs3.displaycharge();
		}
		else
			System.out.println("======car is not available=====");
		
		
		
		System.out.println("------4th object------");
		crs4.carmodel="BMW";
		crs4.regnum=112345661;
		crs4.rentalperday=3000;
		crs4.available=true;
		System.out.println("car mo5el = "+crs4.carmodel+"\nregistration number = "+crs4.regnum+"\nrent per day = "+crs4.rentalperday+"\navailability = "+crs4.available);
		if(available==true) {
		crs4.rentcar();
		global=crs4.carreturn();
		crs4.displaycharge();
		}
		else
			System.out.println("======car is not available=====");
		
		
		
		System.out.println("------5th object--------");
		crs5.carmodel="kia";
		crs5.regnum=457678911;
		crs5.rentalperday=2200;
		crs5.available=false;
		System.out.println("car model = "+crs5.carmodel+"\nregistration number = "+crs5.regnum+"\nrent per day = "+crs5.rentalperday+"\navailability = "+crs5.available);
		if(available==true) {
		crs5.rentcar();
		global=crs5.carreturn();
		crs5.displaycharge();
		}
		else
			System.out.println("======car is not available=====");
		System.out.println("****************THANK YOU**************");
	}
}
