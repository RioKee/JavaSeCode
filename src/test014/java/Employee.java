package test014.java;

public class Employee extends Person{
	
	//Employee
	
	private int num;
	private String addres;
	
	public Employee(String name, String gender, int age, int num, String addres) {
		super(name, gender, age);
		this.num = num;
		this.addres = addres;
	}
	
	public boolean equals(Object obj) {
		if(this == obj ) {
			return true;
		}
		if(this instanceof Employee) {
			Employee employee = (Employee)obj;
			return this.num == employee.num && 
					this.getName().equals(employee.getName());
		}
		return false;
	}
	@Override
	public String toString() {
		return "Employee: [编号=" + num + "\t姓名=" + getName() + "\t性别="
				+ getGender() + "\t年龄" + getAge() + "\t地址=" + addres +
				 "]";
	}
}