package test012.java;

public class Exercise12_01 {
	public static void main(String[] args) {
		// ��̬���������ڶ���������

		Cat.setName("ΪCat.name ��ֵ");
		System.out.println(getCatName());
	}

	static String getCatName() {
		System.out.println("���� getCatName() ����");
		return Cat.name;
	}

}

class Cat {
	public static String name;
	public int age = 10;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Cat.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Dog {
	public String name;
	public int age;
	public double salary;
	// alt + /  �޲ҹ�����
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("�����޲ι�����");

	}

	//shift alt s  o  ��ݼ��вι�����
	public Dog(String name, int age, double salary) {
		this();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//shift + alt + s + r  ��ݼ�  getter setter ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}