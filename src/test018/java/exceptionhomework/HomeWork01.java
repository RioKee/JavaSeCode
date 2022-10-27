package test018.java.exceptionhomework;

public class HomeWork01 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
			Student stu = new Student();
			try {
				stu.setScore(101);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(stu.toString());
			
	}
}

class Student {
	private String name;
	private int score;
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	
	public String toString() {
		return "name=" + name + " score=" + score;
	}
	public void setScore(int score) throws Exception {
		if(score < 0 || score >100) {
			System.out.println("�쳣");
			throw new Exception("�����쳣������Ҫ��0-100֮��");
		}
		this.score = score;
	}

}


//����һ��
//1.	ʹ��setScore(int score) �Է��������жϣ����������0-100֮��ֱ�Ӹ�ֵ������throw�׳��쳣
 
