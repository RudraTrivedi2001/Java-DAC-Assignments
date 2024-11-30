package CreateDelete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\learnjava");
	
		
		if(f.exists()) {
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
			System.out.println();
			System.out.println("file is deleted");
			// f.delete();
			
		}
		else {
			f.createNewFile();
			
			System.out.println("file created");
		}
	}

}
