package Assignment_1_All;

import java.util.Scanner;

//Q11 maximum and minimum in array.
public class Max_MinArray {
	public static void max_min(int b,Scanner s) {
		int a[]= new int[b];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter number "+(i+1));
			a[i]=s.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) max=a[i];
			 if (a[i]<min) min=a[i];	
		}	
		System.out.println("maximum number in array is "+max);
		System.out.println("minimum number in array is "+min);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array ");
		int b=sc.nextInt();
		
		max_min(b,sc);
		
		
	}

}
