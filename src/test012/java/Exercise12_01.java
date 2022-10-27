package test012.java;

public class Exercise12_01 {
	public static void main(String[] args) {
		// 静态变量不属于对象，属于类

		Cat.setName("为Cat.name 赋值");
		System.out.println(getCatName());
	}

	static String getCatName() {
		System.out.println("调用 getCatName() 方法");
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
	// alt + /  无惨构造器
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("加载无参构造器");

	}

	//shift alt s  o  快捷键有参构造器
	public Dog(String name, int age, double salary) {
		this();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//shift + alt + s + r  快捷键  getter setter 方法
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