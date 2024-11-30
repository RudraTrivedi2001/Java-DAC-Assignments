package EmployeeAndTaskManagementSystem;

public class DesignTask extends Task {
	@Override
	 void trackprogress() {
		 System.out.println("your taks is design 60%");
		
	} 
public static void main(String[] args) {
	
	DesignTask dt=new DesignTask();
	dt.trackprogress();
}
}
