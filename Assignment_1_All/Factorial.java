package Assignment_1_All;

import java.util.Scanner;

//Q9 factorial of a number.

public class Factorial {
	public static void fact(int num) {
		int fact=1;
		while(num!=0) {
			fact*=num;
			num--;
		}
		System.out.println("factorial of number "+fact);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number for factorial");
		int num=s.nextInt();
		fact(num);
		}
}
