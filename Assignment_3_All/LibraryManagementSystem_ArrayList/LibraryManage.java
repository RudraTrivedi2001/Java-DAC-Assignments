package LibrarymanagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManage {

	public ArrayList<Book> addbook() {
		ArrayList<Book> al=new ArrayList<>();
		Book b1=new Book("kayamat ki raat","dinesh pandit",200,12345);
		Book b2=new Book("gulivers travel","vascode gama",1900,65432);
		Book b3=new Book("magarmach ka jala","piyush",2024,8764);
		Book b4=new Book("janeman","janu",1999,8789);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		return al;
	}

	public void deletebook(ArrayList<Book> al) 
	{
		System.out.println("enter isbn number to remove book");
		Scanner s=new Scanner(System.in);
		long number=s.nextLong();
		int pos=0;
		for(Book el:al) {
			
			if(el.isbn==number) {
				pos=al.indexOf(el);
			
			}
		}
		al.remove(pos);
	}

	public void displaybook(ArrayList<Book> al) {
		for(Book w:al) {
			w.display();
		}
		
	}

	public void searchbook(ArrayList<Book> al) {
		System.out.println("enter the book you want to search");
		Scanner s=new Scanner(System.in);
		String tname=s.nextLine();
		for(Book obj:al) {
			if(tname.equals(obj.title)) {
				obj.display();
			}
		}
		
	}

	
	

}
