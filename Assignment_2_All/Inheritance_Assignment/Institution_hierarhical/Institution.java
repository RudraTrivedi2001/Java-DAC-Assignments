package Institution;

public class Institution {
String name;
String location;


public Institution(String name, String location) {
	super();this.name = name;
	this.location = location;
}

public void display() {
	System.out.println("name is "+name);
	System.out.println("institute location  is "+location);
}

}
