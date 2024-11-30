package product;

public class Clothing extends Product{
	
	
int size;
public Clothing(int pid, String pname,int size) {
	super(pid, pname);
	this.size=size;
}
public void size() {
	System.out.println("size is "+size);
}
public static void main(String[] args) {
	Clothing c1=new Clothing(1,"shirt",42);
	Clothing c2=new Clothing(2,"jeans",32);
	Clothing c3=new Clothing(3,"hat",20);
	
	System.out.println("----------------------------");
	c1.display();
	c1.size();
	
	System.out.println("----------------------------");
	c2.display();
	c2.size();
	
	System.out.println("----------------------------");
	c3.display();
	c3.size();
}
}
