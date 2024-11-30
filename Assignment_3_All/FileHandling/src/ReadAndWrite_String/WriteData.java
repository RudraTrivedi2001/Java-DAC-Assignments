package ReadAndWrite_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("output.txt");
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the detail");
		int i=0;
		while(i<3) {
			fw.write(s.nextLine());
			System.out.println();
			i++;
		}

		fw.close();

		System.out.println("write task complted");
		
	}

}
