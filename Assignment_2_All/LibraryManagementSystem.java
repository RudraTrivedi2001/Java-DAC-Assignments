package LibraryManagement;
import java.security.DomainCombiner;
import java.util.*;

public class LibraryManagementSystem {
	ArrayList<Book> booklist;
	ArrayList<Member> memberlist;
	public Library() {
		booklist = new ArrayList<>();
		memberlist = new ArrayList<>();
	}
	public void addBook(Book book) {
		booklist.add(book);
	}
	public void addMember(Member member) {
		memberlist.add(member);
	}
	public void issueBook(String title,int memberid) {
		Book book = searchBookByTitle(title);
		Member member = findMemberById(memberid);
		if(book!=null && member!=null) {
			if(!book.isAvailable) {
				book.available();
				System.out.println("Book issued to "+member.getMembername());
			}else {
				System.out.println("Book is already issued");
			}
			
			
		}else {
			if(book==null) {
				System.out.println("Book is not found");
			}
			if(member==null) {
				System.out.println("Member is not found");
			}
		}
		
	}
	public void returnBook(String title) {
		Book book = searchBookByTitle(title);
		if(book!=null && book.isAvailable) {
			book.returnbook();
			System.out.println("Book is returned");
		}
		else {
			System.out.println("Book is not issued or not available ");
		}
	}
	public Book searchBookByTitle(String title) {
		for(int i=0;i<booklist.size();i++) {
			if(booklist.get(i).getTitle().equalsIgnoreCase(title)) {
				return booklist.get(i);
			}
		}
		return null;
	}
	public void searchBookByAuthor(String author) {
		boolean isFound =false;
		for(int i=0;i<booklist.size();i++) {
			if(booklist.get(i).getTitle().equalsIgnoreCase(author)) {
				booklist.get(i).display();
				isFound =true;
			}
		}
		if(!isFound) {
			System.out.println("No book found by author name ");
		}
	}
	public Member findMemberById(int memberid) {
		for(int i=0;i<memberlist.size();i++) {
			if(memberlist.get(i).getMemberid()==memberid) {
				return memberlist.get(i);
			}
		}
		return null;
	}
	public void displayAllBooks() {
	for(Book book : booklist) {
		book.display();
	}
	}
	public void displayAllMembers() {
		for(Member member : memberlist) {
			member.display();
		}
	}
	public static void main(String[] args) {
		Library ll = new Library();
		ll.addBook(new Book("Mahabharat","Gautam Ji"));
		ll.addBook(new Book("Room 104","Chetan Bhagat"));
		ll.addBook(new Book("Kaipo che","Chetan Bhagat"));
		ll.addMember(new Member(101,"Gautam"));
		ll.addMember(new Member(102,"Piyush"));
		ll.addMember(new Member(103,"Dhruv"));
		ll.displayAllBooks();
		ll.displayAllMembers();
		ll.issueBook("Mahabharat", 102);
		ll.issueBook("Room 104", 103);
		ll.issueBook("Kaipo che", 101);
		ll.returnBook("Room 104");
		ll.displayAllBooks();
	}
}
class Book{
	String title;
	String author;
	boolean isAvailable;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable=false;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	// issue the book
	public void available() {
		this.isAvailable=true;
	}
	// return the book
	public void returnbook() {
		this.isAvailable=false;
	}
	public void display() {
		System.out.println("title - "+title);
		System.out.println("Author - "+author);
		System.out.println("Status - "+ (isAvailable ? "issued" : "avaialble"));
	}
}
class Member{
	int memberid;
	String membername;
	public Member(int memberid, String membername) {
		super();
		this.memberid = memberid;
		this.membername = membername;
	}
	public int getMemberid() {
		return memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void display() {
		System.out.println("Member Id is - "+memberid);
		System.out.println("Member Name is - "+membername);
	}
	
	
}
