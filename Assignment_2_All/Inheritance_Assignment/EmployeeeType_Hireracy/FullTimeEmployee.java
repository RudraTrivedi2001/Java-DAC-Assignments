package EmployeeeTypeHireracy;

public class FullTimeEmployee extends Employee {
	
	 float bonus;
	FullTimeEmployee(int eid,String name,float salary){
		super(eid, name, salary);
		this.bonus=bonus;
		
	}
	void annualbonus() {
		bonus=0.0833f*salary;
		System.out.println("your bonus is"+bonus);
		salary+=bonus;
		super.employeedisplay();
		
	}
	static float comp=0;
	public  float compensation() {
		 comp=bonus+comp;
		 return comp;
	}
	
	public static void main(String[] args) {
		FullTimeEmployee pte1=new FullTimeEmployee(101,"gautam",2500.70f);
		FullTimeEmployee pte2=new FullTimeEmployee(102,"dhruv",3000f);
		FullTimeEmployee pte3=new FullTimeEmployee(103,"ram",2000f);
		System.out.println("-----------------------------");
		pte1.employeedisplay();
		pte1.annualbonus();
		float co=pte1.compensation();
//		System.out.println("total compesation of "+co);
		System.out.println("----------------------------------------");
		pte2.employeedisplay();
		pte2.annualbonus();
		float co1=pte2.compensation();
//		System.out.println("total compesation of "+co1);
		System.out.println("----------------------------------------");
		pte3.employeedisplay();
		pte3.annualbonus();
		float co2=pte3.compensation();
		System.out.println("total compesation of "+co2);
	}

}
