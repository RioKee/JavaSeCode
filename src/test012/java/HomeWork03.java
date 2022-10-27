package test012.java;

public class HomeWork03 {
	public static void main(String[] args) {
//		Student[] student = new Student[3];
		
		//˼·����  ��̬���Գ�ʼ��Ϊ1000   ��ʼ�����������ʱ��
		// ʹ�þ�̬����  �Ծ�̬���Խ�����������  
		//���õ��ľ�̬����ֵ��ͨ���������ظ�����ʵ�ʴ��noֵ
		
		Student s1 = new Student("����", 23, 88);
		Student s2 = new Student("����", 22, 99);
		Student s3 = new Student("����", 23, 100);
		s1.show();
		s2.show();
		s3.show();
		
		Student s4 = new Student("", -1, 101);
		s4.show();


	}

}

class Student {
	private int no;
	private static int num = 1000;
	private String name;
	private int age;
	private double score;

	
	public Student() {
		setNum();
	}  
	public Student(String name, int age, double score) {
		super();
		setNum();  // ÿ�μ����࣬��̬num���Զ�����1
		this.no = getNum();
		
		setName(name);  //У������
		setAge(age);	//У������
		setScore(score);  //У�����
		

	}
	
	public void show() {
		System.out.println("no: " + no + "\t name: " + name + "\tage" + age + "\t score" + score);
	}

	public static int getNum() {
		return num;
	}

	public static void setNum() {
		num += 1;

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.length() == 0 || name.length() > 32) {
			System.out.println("����������ֳ��Ȳ��Ϲ棨0~32���ַ�֮�䣩������������");
			return;
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 || age > 120) {
			System.out.println("����������䲻�Ϲ棨0~120֮�䣩������������");
			return;
		}
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score < 0 || score >100) {
			System.out.println("������ķ������Ϲ�(0~100֮��)������������");
			return;
		}
		this.score = score;
	}

	
	
}