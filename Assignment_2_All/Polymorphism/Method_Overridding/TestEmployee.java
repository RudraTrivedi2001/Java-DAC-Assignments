package Method_Overridding;

class Employee{
	
float slary;

public Employee(float slary) {
	
	this.slary = slary;
	}
public float getsalary() {
	return slary;
}
}
class PartTime extends Employee{
	int hwork;
	float hrate;
	PartTime(float slary,int hwork,float hrate){
		super(slary);
		this.hwork=hwork;
		this.hrate=hrate;
	}
	@Override
	public float getsalary() {
		 
		return slary+(hwork*hrate);
	}
}


class FullTime extends Employee{
	float bonus;
	FullTime(float slary,float bonus){
		super(slary);
		this.bonus=bonus;
	}
	void annualbonus() {
		bonus=0.0833f*slary;
		System.out.println("your bonus is"+bonus);
		slary+=bonus;
	}
	@Override
	public float getsalary() {
		return slary;
	}
}

class Contract extends Employee{
int month;
float rate;
	public Contract(float slary,int month,float rate) {
		super(slary);
		this.month=month;
		this.rate=rate;
	}
	public void contract() {
		slary+=(month*rate);	
	}
	@Override
	public float getsalary() {
		return slary;
	}
}


public class TestEmployee {
public static void main(String[] args) {
	PartTime pt=new PartTime(2000f,2,1.3f);
	System.out.println(pt.getsalary());
	
	System.out.println("-------------------");
	FullTime ft=new FullTime(2000f,3000);
	ft.annualbonus();
	System.out.println(ft.getsalary());
	
	System.out.println("-------------------");
	Contract c=new Contract(2000,4,1.8f);
	c.contract();
	System.out.println(c.getsalary());
}
	
}

