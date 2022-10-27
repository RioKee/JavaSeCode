package test014.java.homework;

public class CodeJob extends Job{

	private int codeLines;
	private int bugs;
	public CodeJob(String name, int codeLines, int bugs) {
		super(name);
		this.codeLines =codeLines;
		this.bugs = bugs;
	}
	
	@Override
	public void showJob() {
		System.out.println("Ա����" + getName());
		System.out.println("���������� " + codeLines + "\n" + 
							"�����д������� " + bugs);
	}

	@Override
	public String toString() {
		return "CodeJob [codeLines=" + codeLines + ", bugs=" + bugs + "]";
	}
	
}


