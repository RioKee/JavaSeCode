package test014.java.homework;

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

 *
 */

public abstract class Employee {
	private String num;
	private String name;
	private double salary;
	
	public abstract void work();
	
	public Employee() {}
	public Employee(String num, String name, double salary) {
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

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
	

}
