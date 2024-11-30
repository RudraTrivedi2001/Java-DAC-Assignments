package HasARelation;

public class Enginee {

	long egnum;
	String egtype;
	int power;
	
	public Enginee(long egnum, String egtype, int power) {
		
		this.egnum = egnum;
		this.egtype = egtype;
		this.power = power;
	}
	public void disenginee() {
		System.out.println("engine 		   : "+egnum);
		System.out.println("type of engine : "+egtype);
		System.out.println("horse power    : "+power);
		
	}
	
}
