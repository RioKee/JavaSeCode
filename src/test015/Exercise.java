package test015;

import test014.java.homework.CodeJob;  //不同包需要导入就能使用

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeJob codeJob = new CodeJob("开发小张", 10000, 500);
		System.out.println(codeJob);
	}

}


interface IA{
	public static final String name1 = "常量1"; // 
	public static String name2 = "变量2"; //  变量必须是静态
	public String name3 = "变量3"; // 
//	public String name4; //   必须赋初值
	
	public abstract void func1();  //默认抽象方法
	void func2(); 
//	void func3() {
//		System.out.println("默认被abstract修饰，不能有方法体");
//	}
//	default void func4();  //报错，default 修饰符方法必须有方法体
	default void func5() {
		
	}
	
//	static void func6();  //报错，静态方法必须有方法体
	static void func7() {
	}
}

class Test implements IA{

	@Override
	public void func1() {
		System.out.println("重写func1");
	}

	@Override
	public void func2() {
		System.out.println("重写func2");
	}
	
	//不构成方法重写
	@Override
	public  void func5() {  //func5() 是否构成方法重写
		
	} 
	//error
//	@Override
//	static void func7() {
//	}
//	public IA() {}   //不能有构造器
}

abstract class AbstractModel{
	
	public String name;  //成员属性可以不用初始化
	public AbstractModel() {}  //可以有构造器
//	void fun1();   //报错，一般方法必须有方法体
	abstract void fun3(); //abstract修饰的构造方法不能有方法体
	public abstract void fun4(); 
//	private abstract void fun5();  //private static final 都不能修饰抽象方法  这与重写违背
	
	
	
	
	
	
	
	
	
	
	
}