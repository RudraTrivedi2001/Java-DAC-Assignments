package ReadAndWritePrimitive;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("gautam.txt");
		DataInputStream dis =new DataInputStream(fis);
	
		System.out.println(dis.read());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		dis.close();
		System.out.println("read successfully");
	}
	

}
