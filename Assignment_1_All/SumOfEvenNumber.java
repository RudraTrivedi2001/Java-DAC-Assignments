package Assignment_1_All;

import java.util.Scanner;

//Q2 sum of even number

public class SumOfEvenNumber {

	public static void esum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {  
				sum+=i;
			}
		}
		System.out.println("sum of even number "+sum);
		
	}
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter how many times loop can be executed");
		int loopstime=ss.nextInt();		
		esum(loopstime);
		
	}
}
