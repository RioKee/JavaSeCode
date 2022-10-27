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
			System.out.println("异常");
			throw new Exception("输入异常，分数要在0-100之间");
		}
		this.score = score;
	}

}


//任务一：
//1.	使用setScore(int score) 对分数进行判断，如果分数在0-100之间直接赋值，否则throw抛出异常
 
