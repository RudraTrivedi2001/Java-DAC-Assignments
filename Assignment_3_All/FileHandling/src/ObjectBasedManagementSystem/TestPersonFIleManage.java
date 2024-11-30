package ObjectBasedManagementSystem;

import java.io.IOException;
import java.util.ArrayList;

public class TestPersonFIleManage {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileManage fm=new FileManage();
		try {
		ArrayList<Person> e=fm.Writeperson("dot.txt");

		fm.search();
//		ArrayList<Person> q=fm.readperson("output.txt");
//		System.out.println(q);
		
		
		}
		catch(Exception e) {
e.printStackTrace();			

			
		}
	}

}
