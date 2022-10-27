package test008.java;

public class Exercise01 {
	public static void main(String[] args) {
		Student.name = "小明";
		
		Student s1 = new Student();
		System.out.println("对象的name=" + s1.name.hashCode());
		System.out.println("静态方法name=" + Student.name.hashCode());
		
	}
}

class Student{
  public  static String name = "jack";
  int age = 12;
}