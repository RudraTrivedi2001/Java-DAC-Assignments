package ReadAndWrite_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("output.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		System.out.println("data read successfully ");
	}

}
