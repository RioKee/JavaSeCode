package test008.java;

public class Exercise01 {
	public static void main(String[] args) {
		Student.name = "С��";
		
		Student s1 = new Student();
		System.out.println("�����name=" + s1.name.hashCode());
		System.out.println("��̬����name=" + Student.name.hashCode());
		
	}
}

class Student{
  public  static String name = "jack";
  int age = 12;
}