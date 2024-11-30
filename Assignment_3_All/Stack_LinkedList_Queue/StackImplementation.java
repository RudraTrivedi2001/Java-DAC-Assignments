package Collection;

import java.util.Stack;

public class StackImplementation {
	
	public Stack<Task> push() {
		Task t1=new Task("javascript","complte basic",true);
		Task t2=new Task("mern","front end backend",true);
		Task t3=new Task("python","ai learning",true);
		
		Stack<Task> s= new Stack<>();
		s.push(t1);
		s.push(t2);
		s.push(t3);
		
		return s;
		
	}

	public void pop(Stack<Task> s) {
		Task pop1=s.pop();
		pop1.displays();
	}
	public  void display(Stack<Task> s) {
		for(Task ss:s) {
			ss.displays();
		}
	}
	
	public void peek(Stack<Task> s) {
		Task peek1=s.peek();
		peek1.displays();
		
	}
	
	public static void main(String[] args) {
		StackImplementation si=new StackImplementation();
		System.out.println("---------pushing the element ---------");
		Stack<Task> e=si.push();
		si.display(e);
		System.out.println("-----pop---- task is completed----------");
		si.pop(e);
		System.out.println("----peek---currently working on---------");
		si.peek(e);

		
	}
}
