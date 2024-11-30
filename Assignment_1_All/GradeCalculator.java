package Assignment_1_All;

import java.util.Scanner;

//Q7 Grade calculator

public class GradeCalculator {
	
	public static void grade(int sub,Scanner s) {
		
		int a[]=new int[sub];
		int sum=0;
		int total = 0;
			for(int i=0;i<a.length;i++) {
			System.out.println("enter marks of subject"+(i+1));
			 a[i]=s.nextInt(); 
			 total =sum+=a[i];
			
		}
	
		System.out.println("total marks is "+total);
		int per=(total/sub);
		System.out.println("percentage "+per);
		if(per>100) System.out.println("invalid:");
		else if(per>=80)System.out.println("A");
		else if(per>=60) System.out.println("B");
		else if(per>=40) System.out.println("C");
		else  System.out.println("!!!FAIL!!!");
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subjects");
		int sub=sc.nextInt();
		grade(sub,sc);
		
	}
}
