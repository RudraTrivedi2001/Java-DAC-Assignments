import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		File f1=new File("output.txt");
		File f2=new File("file2.txt");
		Files.copy(f1.toPath(), f2.toPath());
		System.out.println("file copied to the given file");

	}
	
}
