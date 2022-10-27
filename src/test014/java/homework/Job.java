package test014.java.homework;

public abstract class Job {	
	private String name;
	public abstract void showJob();
	public Job(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
