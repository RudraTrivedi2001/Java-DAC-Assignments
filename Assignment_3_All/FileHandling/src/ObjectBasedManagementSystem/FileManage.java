package ObjectBasedManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManage {

	
	public ArrayList<Person> Writeperson(String filename) throws IOException
	{
		
		FileOutputStream fos=new FileOutputStream(filename);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		ArrayList<Person> al=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter object to create");
		int number=s.nextInt();
		int i=0;
		while(i<number) {
			Person p=new Person(s.next(),s.nextInt(),s.next());
			oos.writeObject(p);
			al.add(p);
			i++;
		}
		fos.close();
		oos.close();
		System.out.println("--------data write successfully---------");
		return al;
	}
	public ArrayList<Person> readperson(String filename1) throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream(filename1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Person p =(Person) ois.readObject();
		ArrayList<Person> al=(ArrayList<Person>) ois.readObject();
		fis.close();
		ois.close();
		return al;
	}
	
	public void display(ArrayList<Person> al) {
		 
		for(Person pp:al) {
			
			pp.display();
			
		}	
	}
	
	public void search() throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("dot.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person pp=(Person) ois.readObject();
		ArrayList<Person> al=(ArrayList<Person>) ois.readObject();
		System.out.println("enter name you want to search");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		for(Person pp1:al) {
			pp1.display();
			
		}

	
			}
	}
	

