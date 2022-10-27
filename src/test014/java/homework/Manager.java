package test014.java.homework;

public class Manager extends Employee{

	private double bonus;
	public Manager() {}
	public Manager(String num, String name, double salary, double bonus) {
		super(num, name, salary);
		this.bonus = bonus;
	}
	

	public void playScore() {
		System.out.println("踢足球");
	}
	@Override
	public void work() {
		System.out.println("做管理工作");
	}
	
	public void view() {
		System.out.print(getNum() + ", " + getName() + ", " + "工资：" + 
				getSalary() + "奖金：" + bonus);
		work();
		playScore();
	}
	
	
}
