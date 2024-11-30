package EmployeeAndTaskManagementSystem;

public class DevelopmentTask extends Task{
	@Override
	 void trackprogress() {
		System.out.println("your task has been developed ");
	}
public static void main(String[] args) {
	DevelopmentTask dt=new DevelopmentTask();
	dt.trackprogress();
}
}
