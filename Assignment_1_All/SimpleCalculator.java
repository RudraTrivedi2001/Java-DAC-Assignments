package Assignment_1_All;
import java.util.Scanner;

//Q1 Simple calculator
public class SimpleCalculator {
		public static int add(int a,int b) {
			
			int result = a+b;
			return result;
		}
		
		public static int sub(int a,int b) {
			
			int result = a-b;
			return result;
		}

		public static int mul(int a,int b) {
		
		int result = a*b;
		return result;
		}

		public static int div(int a,int b) {
		
		int result = a/b;
		return result;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number 1");
			int c=sc.nextInt();
			System.out.println("enter number 2");
			int d =sc.nextInt();
			
			System.out.println("sum is            "+add(c,d));
			System.out.println("subtraction is    "+sub(c,d));
			System.out.println("multiplication is "+mul(c,d));
			System.out.println("division  is      "+div(c,d));
		}
	}


