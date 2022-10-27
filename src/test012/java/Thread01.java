package test012.java;

public class Thread01 {
	public static void main(String[] args) {
		Student s;
		System.out.println(Student.getNum());
		new Student();
		System.out.println(Student.getNum());
		new Student();
		System.out.println(Student.getNum());
	}
}
