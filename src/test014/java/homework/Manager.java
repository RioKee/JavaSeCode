package test014.java.homework;

public class Manager extends Employee{

	private double bonus;
	public Manager() {}
	public Manager(String num, String name, double salary, double bonus) {
		super(num, name, salary);
		this.bonus = bonus;
	}
	

	public void playScore() {
		System.out.println("������");
	}
	@Override
	public void work() {
		System.out.println("��������");
	}
	
	public void view() {
		System.out.print(getNum() + ", " + getName() + ", " + "���ʣ�" + 
				getSalary() + "����" + bonus);
		work();
		playScore();
	}
	
	
}
