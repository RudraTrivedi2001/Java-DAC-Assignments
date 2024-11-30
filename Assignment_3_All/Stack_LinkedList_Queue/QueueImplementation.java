package ProrityQueue_assignment;

import java.util.PriorityQueue;

public  class QueueImplementation1{

		public PriorityQueue<Task> enqueue1() {
			Task tq1= new Task("satya prem ki katha","pyaar", true);
			Task tq2= new Task("1920 ","horro", true);
			Task tq3= new Task("katmandu","kashmir", true);
			PriorityQueue<Task> pg=new PriorityQueue<>();
			pg.add(tq1);
			pg.add(tq2);
			pg.add(tq3);
			
			return pg;	
		}
		
		public void displaytask1(PriorityQueue<Task> pg) {
			for(Task rr:pg) {
				rr.displays();	
			}
		}
		
		public void deque(PriorityQueue<Task> pg) {
			pg.poll();
		}

		public static void main(String[] args) {
			QueueImplementation1 qm= new QueueImplementation1();
			
			System.out.println("------");
			PriorityQueue<Task> p=qm.enqueue1();
			qm.displaytask1(p);
			System.out.println("-----------remove object---------");
			qm.deque(p);
			System.out.println("----------display queue--------");
			qm.displaytask1(p);
			
		
		}


	
}
