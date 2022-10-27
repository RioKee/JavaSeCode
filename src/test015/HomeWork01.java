package test015;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ϰ
		Worker worker = new Worker("002", "����", 8000);
		Manager manager = new Manager("001", "����", 20000,50000);
		System.out.print(manager);
		manager.work();
		System.out.print(worker);
		worker.work();
		
	}

}

/**
 * Ա�������� 
����3�����ԣ����ţ����������ʡ� 
һ�����󷽷����������������磺��ͬԱ���в�ͬ�Ĺ������ݣ� 
��Ŀ�������� 
���⻹��һ���������� 
��ͨ������������ 
����Ա���� 
��ͨ���������� 
�����ࣺ 
���Ծ����Ա�� 
 */
class Worker extends Employee{
	
	public Worker(String num, String name, double salary) {
		super(num, name, salary);
	}
	@Override
	public void work() {
		System.out.println("���ڽ��п������빤��");
	}
	public String toString() {
		return getNum() + ", " + getName() + ", ���� " + getSalary();
	}
}

class Manager extends Employee{
	private double bonus;
	public Manager(String num, String name, double salary, double bonus) {
		super(num, name, salary);
		this.bonus = bonus;
	}
	
	@Override
	public void work() {
		System.out.println("���ڽ��й�����");
	}
	
	public String toString() {
		return getNum() + ", " + getName() + ", ���� " + getSalary() + ", ����" + bonus;
	}
}
abstract class Employee{
	private String num;
	private String name;
	private double salary ;
	
	
	public Employee(String num, String name, double salary) {
		super();
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	public abstract void work();

	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}