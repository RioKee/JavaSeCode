package test012.java;

public class HomeWork04_Static {
	public static void main(String[] args) {
		
		System.out.println(A.add());
		System.out.println(A.add());
		System.out.println(A.add());
	}
}
class A {
	public static int no = 0;
	
	public int num;
	public static int add() {
		return no += 1;
	}
	//使用非静态方法调用  调用静态方法
}

/**
 * static 
 * 修饰的方法 ，称为静态方法
 * 修饰属性时候，称为静态属性
 * 
 * 在进行类加载过程中，有继承关系时
 * 1）加载父类静态代码块 （静态属性， 不包含静态方法）
 * 2）加载子类静态代码块（静态属性，不包含静态方法）
 * 3）父类非静态代码块（非静态属性）
 * 4）父类构造函数
 * 5）子类非静态代码块（包括非静态初试代码块，非静态属性）
 * 6）子类构造函数
 * 
 * 静态方法不能直接调用非静态属性，不能调用非静态方法
 * 
 * 非静态方法可以调用非静态属性，静态属性  可以直接调用非静态方法，非静态属性
 * 
 * 
 * 类中的被static修饰的成员
 * 静态方法，静态属性，不需要创建对象就能调用  能够被类名调用
 * 优先存于对象  ，不能被对象直接调用
 * 
 */
