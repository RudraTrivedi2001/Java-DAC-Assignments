package Assignment_2_All;

import java.util.Scanner;

class Course{
	int cid;
	String cname;
	String iname;
	float fee;
	
	public Course(int cid, String cname, String iname, float fee) {
		this.cid = cid;
		this.cname = cname;
		this.iname = iname;
		this.fee = fee;
	}

	public void display() {
		System.out.println("id "+cid+"\nstudent name "+cname+"\ninstructor name "+iname+"\nfee "+fee);	
	}
}

class ManageCourse{
	
	public Course[] enrollstudent() {
		Scanner s=new Scanner(System.in);
		Course cc[]=new Course[5];
		System.out.println("enter detail");
		for(int i=0;i<cc.length;i++) {
			cc[i]= new Course(s.nextInt(),s.next(),s.next(),s.nextFloat());
		}
		return cc;
	}
	public void display(Course []cc) {
		for(int i=0;i<cc.length;i++) {
			cc[i].display();			
		}
	}
	static float revenue=0;
	public float revenue(Course[] cc) {
		for(int i=0;i<cc.length;i++)
		{
			revenue=revenue+cc[i].fee;
		}
		return revenue;
	}
}

public class OnlineCourseEnrollment {
	public static void main(String[] args) {
		ManageCourse mc=new ManageCourse();
		Course []cc=mc.enrollstudent();
		mc.display(cc);
		float fee=mc.revenue(cc);
		System.out.println("total revenue are "+fee);
			
	}
}


