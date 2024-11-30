package vehicle;

public class Car extends Vehicle{

	int doornum;
	Car(int make,String model,int doornum){
		super(make, model);
		this.doornum=doornum;
	}
	
	public void printcar(String color,String engine,String type ) {
		super.displaydetail();
		System.out.println("color of car "+color);
		System.out.println("engine type  "+engine);
		System.out.println("type of car  "+type);
	}
	public static void main(String[] args) {
		
		Car c1=new Car(2,"hyundai",4);
		Car c2=new Car(6,"scorpio",7);
		Car c3=new Car(2,"ferrari",2);
		System.out.println("------------------------------");
		c1.printcar("white","turbo","suv");
		System.out.println("------------------------------");
		c2.printcar("black","megma","xuv");
		System.out.println("------------------------------");
		c3.printcar("yello","unokha","seden");
		
	}
}
