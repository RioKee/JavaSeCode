package test015;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//抽象类练习
		Worker worker = new Worker("002", "黄蓉", 8000);
		Manager manager = new Manager("001", "郭靖", 20000,50000);
		System.out.print(manager);
		manager.work();
		System.out.print(worker);
		worker.work();
		
	}

}

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
 */
class Worker extends Employee{
	
	public Worker(String num, String name, double salary) {
		super(num, name, salary);
	}
	@Override
	public void work() {
		System.out.println("正在进行开发编码工作");
	}
	public String toString() {
		return getNum() + ", " + getName() + ", 工资 " + getSalary();
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
		System.out.println("正在进行管理工作");
	}
	
	public String toString() {
		return getNum() + ", " + getName() + ", 工资 " + getSalary() + ", 奖金" + bonus;
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