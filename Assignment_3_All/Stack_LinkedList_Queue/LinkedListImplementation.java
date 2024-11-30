package Collection;

import java.util.LinkedList;

public class LinkedListImplementation {
	
	public LinkedList<Task> add() {
		Task tl1=new Task("tv","cid",true);
		Task tl2=new Task("laptop","game",true);
		Task tl3=new Task("mobile","cricket",true);
		Task tl4=new Task("running","ground",true);
		LinkedList<Task> ll=new LinkedList<>();
		ll.add(tl1);
		ll.add(tl2);
		ll.add(tl3);
		ll.add(tl4);
		return ll;
	}
	public void display(LinkedList<Task> ll)
	{
		for(Task qq:ll) {
			qq.displays();
			
		}
		Task curtask=ll.peek();
		System.out.println("----------current task running ------- ");
		curtask.displays();
	}
	public void remove(LinkedList<Task> ll) {
		Task rem=ll.remove();
		rem.displays();
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedListImplementation lli=new LinkedListImplementation();
		System.out.println("---------add task ---------");
		LinkedList<Task> ll=lli.add();
		System.out.println("-----------display task -------------");
		lli.display(ll);
		System.out.println("---------remove task-----------");
		lli.remove(ll);
		
		
	}

}
