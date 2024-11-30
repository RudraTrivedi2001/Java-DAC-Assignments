package ReadAndWritePrimitive;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos =new FileOutputStream("gautam.txt",true);
		DataOutputStream dos=new DataOutputStream(fos);
		
		
		
		dos.writeInt(20);
		dos.writeBoolean(true);
		dos.writeDouble(30.90);
		
		dos.close();
		dos.close();
		System.out.println("write successfully");
	}
	}

