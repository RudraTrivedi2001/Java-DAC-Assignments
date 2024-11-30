package Assignment_2_All;

	import java.util.Scanner;
	
//Q1 book management system.
	
	public class BookManagementSystem {
		String title;
		String author;
		float price;
		long isbn;
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public long getIsbn() {
			return isbn;
		}
		public void setIsbn(long isbn) {
			this.isbn = isbn;
		}
		
		public void discount(float dis) {
			float total=price*(dis/100);
			setPrice(price-total);
			System.out.println("after discount  of "+dis+"%  the  price of the book is "+getPrice());
		}
		public static void main(String[] args) {
			Scanner ss=new Scanner(System.in);
			System.out.println("enter discount you want for all book ");
			float dis =ss.nextFloat();
			BookManagementSystem bms1=new BookManagementSystem();
			BookManagementSystem bms2=new BookManagementSystem();
			BookManagementSystem bms3=new BookManagementSystem();
		
			 
			System.out.println("----------first object---------");
			bms1.setTitle("ganesh chahturthi");
			bms1.setAuthor("ganesh");
			bms1.setPrice(50f);
			bms1.setIsbn(857687327);
			System.out.println("tile = "+bms1.getTitle()+"\nAuthor = "+bms1.getAuthor()+"\nprice = "+bms1.price+"\nisbn = "+bms1.isbn);
			bms1.discount(dis);
			
			System.out.println("-------second object----------");
			bms2.setTitle("kalaa  kahar");
			bms2.setAuthor("kallu");
			bms2.setPrice(50f);
			bms2.setIsbn(85768447);
			System.out.println("tile = "+bms2.getTitle()+"\nAuthor = "+bms2.getAuthor()+"\nprice = "+bms2.price+"\nisbn = "+bms2.isbn);
			bms2.discount(dis);
			
			System.out.println("-------third object-----------");
			bms3.setTitle("magarmach ka khoof");
			bms3.setAuthor("dinesh pandit");
			bms3.setPrice(200.90f);
			bms3.setIsbn(85768447);
			System.out.println("tile = "+bms3.getTitle()+"\nAuthor = "+bms3.getAuthor()+"\nprice = "+bms3.price+"\nisbn = "+bms3.isbn);
			bms3.discount(dis);
		}
	}


