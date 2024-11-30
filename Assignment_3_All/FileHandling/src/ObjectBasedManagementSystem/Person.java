package ObjectBasedManagementSystem;

import java.io.Serializable;

public class Person implements Serializable  {

	String name;
	int age ;
	String mail;
	
	
	Person(String name,int age,String mail){
		this.name=name;
		this.age=age;
		this.mail=mail;
		
	}
	
	public void display() {
		
		System.out.println(name+age+mail);
	}
	
}
