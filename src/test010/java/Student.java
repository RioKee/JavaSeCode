package test010.java;

public class Student {
	public int no;
	public String name;
	public int score;
	
	public Student() {}
	
	public Student(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	public void info() {
		System.out.println("���:" + no + " ѧ������:" + name + " �ɼ���" + score);
	}
	
}
