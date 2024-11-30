package LibrarymanagementSystem;

import java.util.ArrayList;

public class TestLibraryBook {

	public static void main(String[] args) {
		LibraryManage lm=new LibraryManage();
		ArrayList<Book> al=lm.addbook();
		lm.displaybook(al);
		lm.deletebook(al);
		lm.displaybook(al);
//		lm.displaybook(al);
		lm.searchbook(al);
		
		
			}
}
