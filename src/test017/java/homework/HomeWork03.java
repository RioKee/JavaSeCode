package test017.java.homework;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork03 h3 = new HomeWork03();
		try {
			h3.isTriangle(1, 3, 8);
			System.out.println("�ܹ���������");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		

	}
	
	public void isTriangle(int a, int b, int c) throws IllegalArgumentException {
		if (a + b < c || a + c < b || a + b < a) {
			throw new IllegalArgumentException();
		}
	}
}
/**
 * дһ������void isTriangle(int a,int b,int c)�� �ж����������Ƿ��ܹ���һ�������Σ�
 * ����������׳��쳣IllegalArgumentException�� ��ʾ�쳣��Ϣ
 * ��a,b,c���ܹ��������Ρ���������Թ�������ʾ�����������߳������ô˷������������쳣��
 */

class IllegalArgumentException extends Exception{
	
	private String message = "��a,b,c���ܹ��������Ρ�";
	
	public IllegalArgumentException() {}
	
	public IllegalArgumentException(String exception) {
		this.message = exception;
	}
	
	public String  getMessage() {
		return message;
	}
}