package test017.java.homework;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork03 h3 = new HomeWork03();
		try {
			h3.isTriangle(1, 3, 8);
			System.out.println("能构成三角形");
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
 * 写一个方法void isTriangle(int a,int b,int c)， 判断三个参数是否能构成一个三角形，
 * 如果不能则抛出异常IllegalArgumentException， 显示异常信息
 * “a,b,c不能构成三角形”，如果可以构成则显示三角形三个边长，调用此方法，并捕获异常。
 */

class IllegalArgumentException extends Exception{
	
	private String message = "“a,b,c不能构成三角形”";
	
	public IllegalArgumentException() {}
	
	public IllegalArgumentException(String exception) {
		this.message = exception;
	}
	
	public String  getMessage() {
		return message;
	}
}