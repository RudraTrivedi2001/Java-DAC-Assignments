package Assignment_2_All;

import java.util.Scanner;

class Booking{
	int rnumber; 
	String  rtype; 
	int  rnight;
	boolean available;
	public Booking(int rnumber, String rtype, int rnight, boolean available) {
		this.rnumber = rnumber;
		this.rtype = rtype;
		this.rnight = rnight;
		this.available = available;
	}
	public void display() {
		System.out.println("room number "+rnumber+"\nroom type "+rtype+"\nnight per day "+rnight+"\navailable "+available);
	}	
}
class ManageBooking{

	public Booking[] bookroom() {
		Booking b []=new Booking[2];
		Scanner ss=new Scanner(System.in);
		System.out.println("enter booking detail");
		for(int i=0;i<b.length;i++) {
			b[i]= new Booking(ss.nextInt(),ss.next(),ss.nextInt(),ss.nextBoolean());
		}
		return b;
		
	}

	public void totalpernight(Booking b[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter rate ");
		float rate=s.nextFloat();
		int ttl=0;
		for(int i=0;i<b.length;i++)	
		{
				ttl=(int) (b[i].rnight*rate);
				System.out.println("total price for stay "+ttl);
		}
		
		
	}

	public void cancelbook(Booking b[]) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		System.out.println("enter room number to cancel booking ");
		for(int i=0;i<b.length;i++) {
			if(b[i].rnumber==number) {
				b[i]=null;	
			}else System.out.println("not match data");
			
		}
		
	}
	public void display(Booking []b) {
		for(int i=0;i<b.length;i++) {
			b[i].display();
		}
	}
	
		
}

public class HotelBookingSystem {
	public static void main(String[] args) {
		ManageBooking mb=new ManageBooking();
		
		Booking b[]=mb.bookroom(); 
		mb.display(b);
		mb.totalpernight(b); 
		mb.cancelbook(b);
	}
}

