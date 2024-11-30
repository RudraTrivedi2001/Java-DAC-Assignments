package Assignment_2_All;

import java.util.Scanner;

//Q4 Employee management.

public class EmployeeManagement {

	int eid;
	String ename;
	String des;
	float salary;
	
	public void increasesalary(float increase) {
		salary+=increase;
		System.out.println(salary);
		final float calformulabonus=0.0833f;
		float bonus =salary * calformulabonus;
		System.out.println("bonus is "+bonus);
		System.out.println("your total salary after bonus is "+(salary+bonus));
	}
	public void reademployee() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter id ");
		eid=s.nextInt();
		System.out.println("enter name ");
		ename=s.next();
		System.out.println("enter designation ");
		des=s.next();
		System.out.println("enter salary ");
		salary=s.nextFloat();
	}
	
	void display() {
		System.out.println(" id = "+eid);
		System.out.println(" name = "+ename);
		System.out.println(" designation = "+des);
		System.out.println(" salary = "+salary);
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		EmployeeManagement em1=new EmployeeManagement();
		EmployeeManagement em2=new EmployeeManagement();
		EmployeeManagement em3=new EmployeeManagement();
		System.out.println("-----employee 1-------");
		em1.reademployee();
		em1.display();
		System.out.println("how much you have to increase salary");
		float increase=s.nextFloat();
		em1.increasesalary(increase);
		System.out.println("-----employee 2-------");
		em2.reademployee();
		em2.display();
		System.out.println("how much you have to increase salary");
		float increase1=s.nextFloat();
		em2.increasesalary(increase1);
		
		System.out.println("-----employee 3-------");
		em2.reademployee();
		em2.display();
		System.out.println("how much you have to increase salary");
		float increase2=s.nextFloat();
		em2.increasesalary(increase2);
	}
}
