package test014.java.homework;

public class Programmer extends Employee {
	
	public Programmer(String num, String name, double salary) {
		super(num, name, salary);
	}
	
	@Override
	public void work() {
		System.out.println("做开发编码工作");
	}
	public void read() {
		System.out.println("看书");
	}
	
	public void view() {
		System.out.print(getNum() + ", " + getName() + ", " + "工资：" + 
				getSalary());
		work();
		read();
	}
}
