package test014.java.homework;

public class TestJob extends Job {
	private int caseNum;
	private int findBugs;
	public TestJob(String name, int caseNum, int findBugs) {
		super(name);
		this.caseNum = caseNum;
		this.findBugs = findBugs;
	}
	
	@Override
	public void showJob() {
		System.out.println("Ա����" + getName());
		System.out.println("���԰�������" + caseNum + "\n" +
							"������������" + findBugs);
	}
}
