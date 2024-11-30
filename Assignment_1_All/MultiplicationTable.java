package Assignment_1_All;

import java.util.Scanner;

//Q4 Multiplication of table 

public class MultiplicationTable {
	
	public static void mul(int num) 
	{
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));			
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter th number which you have to multiply");
		int num=s.nextInt();
		mul(num);
	}

}
