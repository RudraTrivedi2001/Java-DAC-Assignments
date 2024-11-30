package Assignment_1_All;

import java.util.Scanner;

//Q10 maximum value in three number. 

public class MaximumValue {
public static void max(int a,int b,int c) {
		
		if(a>b && a>c) System.out.println("a is greater "+a);
		else if(b>a&&b>c) System.out.println("b is greater "+b);
		else System.out.println("c is greater "+c);
	}

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number three number to check which is largest ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		max(a,b,c);
		
}
}
