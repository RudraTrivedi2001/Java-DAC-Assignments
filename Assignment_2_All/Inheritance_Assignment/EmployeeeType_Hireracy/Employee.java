package EmployeeeTypeHireracy;

public class Employee {
	int eid;
	String name;
	float salary;
	
	
	public Employee(int eid, String name, float salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	public void employeedisplay() {
		System.out.println("id is "+eid+"\nname is "+name+"\nSalary is "+salary);
	}
	

}
