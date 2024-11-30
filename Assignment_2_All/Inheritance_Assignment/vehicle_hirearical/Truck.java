package vehicle;

public class Truck extends Vehicle{

	int cargocapacity;
	Truck(int make,String model,int cargocapacity){
		super(make, model);
		this.cargocapacity=cargocapacity;
	}
	
	public int  wcapacity(int tt,int body) {
		cargocapacity=tt-body;
		return cargocapacity;
	}
	
	public static void main(String[] args) {
		Truck t1=new Truck(2,"long",1000);
		Truck t2=new Truck(3,"medium",700);
		Truck t3=new Truck(1,"small",500);

		System.out.println("-------------------------");
		t2.displaydetail();
		int capacity1=t2.wcapacity(120000, 50000);
		System.out.println("capacity of cargo="+capacity1);
		
		System.out.println("-------------------------");
		t2.displaydetail();
		int capacity2=t2.wcapacity(700, 200);
		System.out.println("capacity of cargo="+capacity2);
		

		System.out.println("-------------------------");
		t3.displaydetail();
		int capacity3=t3.wcapacity(500, 150);
		System.out.println("capacity of cargo="+capacity3);
	}
}
