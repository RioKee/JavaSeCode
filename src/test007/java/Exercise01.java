package test007.java;

public class Exercise01 {
	public static void main(String[]args) {
		
		//实例化对象
		Dog dog1 = new Dog();
		dog1.father();
		dog1.son();
		
	}
	

	
	public void func() {
		
	}

}

//类的继承  关键字 extends  父类  子类

class Animal{
	
	//Animal定义方法
	public void action() {
		
	}
	
	public void father() {
		System.out.println("这是父类");
	}
	
}

//继承父类Animal
class Dog extends Animal{
	String name;
	int age;
	public void son() {
		System.out.println("这是子类");
	}
}