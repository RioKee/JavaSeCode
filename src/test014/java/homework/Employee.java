package test014.java.homework;

/**
 * 员工抽象类 
包含3个属性：工号，姓名，工资。 
一个抽象方法：工作描述（例如：不同员工有不同的工作内容） 
项目经理子类 
另外还有一个奖金属性 
普通方法：踢足球 

程序员子类 
普通方法：看书 

测试类： 
测试经理和员工 

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
