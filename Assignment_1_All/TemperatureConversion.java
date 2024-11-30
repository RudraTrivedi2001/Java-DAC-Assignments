package Assignment_1_All;

import java.util.Scanner;

//Q6 temperature conversion celcius to farehenit.

public class TemperatureConversion {

	
public static void conversion(float c) {
		
		float f=c*1.8f+32;
		System.out.println("temp in farehenit "+f);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature in celcius  to convert in farehnit");
		float c=s.nextFloat();
		conversion(c);
		
	}
}
