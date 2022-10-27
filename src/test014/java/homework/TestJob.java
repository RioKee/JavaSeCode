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
		System.out.println("员工：" + getName());
		System.out.println("测试案例数：" + caseNum + "\n" +
							"案例错误数：" + findBugs);
	}
}
