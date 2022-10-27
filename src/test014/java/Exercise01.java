package test014.java;

public class Exercise01 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";  //s2没有开辟新的空间，是将堆中原有的是s2  数据指向赋值给s2  
		String s3 = new String("hello");
		
		System.out.println(s1 == s2);  //ture
		System.out.println(s1 == s3);  //false 
				
	}
	
}

class Person1{
	public static void run() {
		
	}
}

class Doctor extends Person1{
	
//	@Override
//	public void run() {	
//		//子类不能重写静态方法 （抽象方法必须重写，如果抽象方法使用static修饰，那么就违背了抽象方法必须被重写的理念）
//	}
}