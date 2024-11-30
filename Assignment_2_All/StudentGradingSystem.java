package Assignment_2_All;

import java.util.Scanner;

//Q3 student grading system

public class StudentGradingSystem {
	String name;
	long rollno;
	int marks;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void marks(int sub,Scanner s) {
		int total=0;
			for(int i=0;i<sub;i++) {
				System.out.println("enter marks of subject "+(i+1));
				setMarks(s.nextInt());
				total+=getMarks();
				}
	System.out.println("total marks in all subject "+total);
	int per =total/sub;
	System.out.println("your percentage is "+per);
	if (per>100) System.out.println("invalid");
	else if(per>=90) System.out.println("A");
	else if(per>=70) System.out.println("B");
	else if(per>=50) System.out.println("C");
	else System.out.println("!!!!FAIL!!!!");
	}


	public static void main(String[] args) {
		
		Scanner ss=new Scanner(System.in);
		System.out.println("enter number of subject ");
		int sub=ss.nextInt();
		
		StudentGradingSystem sgs1=new StudentGradingSystem();
		StudentGradingSystem sgs2=new StudentGradingSystem();
		StudentGradingSystem sgs3=new StudentGradingSystem();
		StudentGradingSystem sgs4=new StudentGradingSystem();
		StudentGradingSystem sgs5=new StudentGradingSystem();
		
		System.out.println("-----------first student ---------");
		sgs1.setName("gautam");
		sgs1.setRollno(1234);
		System.out.println("name is = "+sgs1.getName()+"\nroll number = "+sgs1.getRollno());
		sgs1.marks(sub,ss);
		
		System.out.println("-----------second student ---------");
		sgs2.setName("mohan");
		sgs2.setRollno(4345);
		System.out.println("name is = "+sgs2.getName()+"\nroll number = "+sgs2.getRollno());
		sgs2.marks(sub,ss);
		
		
		System.out.println("-----------third student ---------");
		sgs3.setName("shyam");
		sgs3.setRollno(9045);
		System.out.println("name is = "+sgs3.getName()+"\nroll number = "+sgs3.getRollno());
		sgs3.marks(sub,ss);
		
		
		System.out.println("-----------4th student ---------");
		sgs4.setName("ruchita");
		sgs4.setRollno(8965);
		System.out.println("name is = "+sgs4.getName()+"\nroll number = "+sgs4.getRollno());
		sgs4.marks(sub,ss);
		
		
		System.out.println("-----------5th student ---------");
		sgs5.setName("ankita");
		sgs5.setRollno(345);
		System.out.println("name is = "+sgs5.getName()+"\nroll number = "+sgs5.getRollno());
		sgs5.marks(sub,ss);
		
	}
}
