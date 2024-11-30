package AppendFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class TypeExit {

	public static void main(String[] args) throws IOException {
		
	FileWriter fw=new FileWriter("TypeExit.txt",true);
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter data");
	
	boolean b=true;
	String ss="exit";
	while(b) {
		fw.write(s.nextLine());
		fw.equals("exit");
		b=false;
	}
		fw.close();
		System.out.println("data write successfully");
		
	}
}
