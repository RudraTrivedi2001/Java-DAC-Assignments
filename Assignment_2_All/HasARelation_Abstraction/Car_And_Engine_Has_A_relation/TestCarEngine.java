package HasARelation;

public class TestCarEngine {

	public static void main(String[] args) {
		Enginee eg=new Enginee(3456,"turbo",1200);
		Car c=new Car("hyundai",2,eg);
		c.display();
	}
}
