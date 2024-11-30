package Assignment_1_All;

import java.util.Scanner;

//Q12 reverse array

public class ArrayReverse {
	public static void rev(int q,Scanner s) {
		int aa[]=new int[q];
		for(int i=0;i<aa.length;i++) {
			System.out.println("enter num "+(i+1));
			aa[i]=s.nextInt();
		}
		System.out.println("reverse array are ");
		for(int i=aa.length-1;i>=0;i--) {
			System.out.print(" "+aa[i]);
		}
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size ");
		int q=sc.nextInt();
		rev(q,sc);
		
	}

}
