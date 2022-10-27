package test012.java;

public class HomeWork03 {
	public static void main(String[] args) {
//		Student[] student = new Student[3];
		
		//思路分析  静态属性初始化为1000   初始化创建对象的时候，
		// 使用静态方法  对静态属性进行自增操作  
		//将得到的静态变量值，通过方法返回给对象实际存放no值
		
		Student s1 = new Student("张三", 23, 88);
		Student s2 = new Student("李四", 22, 99);
		Student s3 = new Student("王五", 23, 100);
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
		setNum();  // 每次加载类，静态num属性都自增1
		this.no = getNum();
		
		setName(name);  //校验名字
		setAge(age);	//校验年龄
		setScore(score);  //校验分数
		

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
			System.out.println("你输入的名字长度不合规（0~32个字符之间），请重新输入");
			return;
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 || age > 120) {
			System.out.println("你输入的年龄不合规（0~120之间），请重新输入");
			return;
		}
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score < 0 || score >100) {
			System.out.println("你输入的分数不合规(0~100之间)，请重新输入");
			return;
		}
		this.score = score;
	}

	
	
}