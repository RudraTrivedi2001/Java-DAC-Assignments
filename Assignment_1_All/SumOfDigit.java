package Assignment_1_All;

import java.util.Scanner;

//Q5 Sum of all digit in integer.

public class SumOfDigit {
	
	public static void digitsum(int num) {
		int rem;
		int sum=0;
		while(num!=0) {
			
			rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("sum of digit in number "+sum);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to sum particular digit ");
		int number=s.nextInt();
		digitsum(number);
	}
}
