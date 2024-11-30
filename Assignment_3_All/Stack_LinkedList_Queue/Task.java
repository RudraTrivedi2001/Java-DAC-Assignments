package Collection;

public class Task comparable<Task> {
	String title;
	String description;
	boolean iscompleted;
	
	

	public Task(String title, String description, boolean isCompleted) {
		super();
		this.title = title;
		this.description = description;
		this.iscompleted = iscompleted;
	}

	public void displays() {
		System.out.println(title+description+iscompleted);
		
	}

	public int compareto(Task o){
		return 0;
	}

}
