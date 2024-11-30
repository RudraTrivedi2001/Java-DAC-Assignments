package Assignment_1_All;

import java.util.Scanner;

//Q3 Character count 
public class CharacterCount {
	
	public static void count(String name) {
		char[]ss=name.toCharArray();
		System.out.println("length of String "+ss.length);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter anything ");
		String name=s.nextLine();
		
		count(name);
		
		
	}

}
