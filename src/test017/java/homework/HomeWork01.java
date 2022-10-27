package test017.java.homework;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("С��");
		try {
			s1.setScore(-1);
		} catch (NumErrorException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
/**
1.	ʹ��setScore(int score) �Է��������жϣ����������0-100֮��ֱ�Ӹ�ֵ������throw�׳��쳣
2.	�ڲ�������ʹ��try-catch���񲢴����쳣

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
			throw new NumErrorException("�������벻��ȷ");			
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