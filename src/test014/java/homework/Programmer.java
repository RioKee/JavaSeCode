package test014.java.homework;

public class Programmer extends Employee {
	
	public Programmer(String num, String name, double salary) {
		super(num, name, salary);
	}
	
	@Override
	public void work() {
		System.out.println("���������빤��");
	}
	public void read() {
		System.out.println("����");
	}
	
	public void view() {
		System.out.print(getNum() + ", " + getName() + ", " + "���ʣ�" + 
				getSalary());
		work();
		read();
	}
}
