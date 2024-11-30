package EmployeeeTypeHireracy;

public class PartTimeEmployee extends Employee{
	int hwork;
	float hrate;
	
	PartTimeEmployee(int eid,String name,float salary,int hwork,float hrate){
		super(eid, name, salary);
		this.hwork=hwork;
		this.hrate=hrate;	
	}
	 float total=0;
	public void Work() {
		 salary=hwork*hrate;
		System.out.println("hours of working "+hwork+"price per hour "+hrate+"total amount "+salary);
		
	}
	static float over=0;
	public float compensation() {
		return over+=salary;
		
		
	}
	public static void main(String[] args) {
		PartTimeEmployee pte1=new PartTimeEmployee(1009,"rahul",0,3,300);
		PartTimeEmployee pte2=new PartTimeEmployee(111,"sumer",0,5,700);
		PartTimeEmployee pte3=new PartTimeEmployee(1112,"gauri",0,6,200);
		System.out.println("----------------------");
		pte1.employeedisplay();
		pte1.Work();
		pte1.employeedisplay();
		pte1.compensation();
		
		System.out.println("----------------------");
		pte2.employeedisplay();
		pte2.Work();
		pte2.employeedisplay();
		pte2.compensation();
		
		
		System.out.println("----------------------");
		pte3.employeedisplay();
		pte3.Work();
		pte3.employeedisplay();
		float comp=pte3.compensation();
		System.out.println("overall salary distributed "+comp);
		
		
	}

	
}
