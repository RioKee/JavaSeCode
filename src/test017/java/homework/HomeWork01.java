package test017.java.homework;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("小明");
		try {
			s1.setScore(-1);
		} catch (NumErrorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
/**
1.	使用setScore(int score) 对分数进行判断，如果分数在0-100之间直接赋值，否则throw抛出异常
2.	在测试类中使用try-catch捕获并处理异常

 */

class Student{
	private String name;
	private int score;
	public Student(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) throws NumErrorException{
		if(score < 0 || score >100) {
			throw new NumErrorException("分数输入不正确");			
		}	
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}	
}

class NumErrorException extends Exception{
	private String message;
	public NumErrorException(String exception) {
		message = exception;
	}
	
	public String getMessage() {
		return message;
	}
	
}