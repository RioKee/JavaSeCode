package test018.java.exceptionhomework;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork03 hm3 = new HomeWork03();
		hm3.isTriangle(1, 2, 3);
		System.out.println("==============");
		hm3.isTriangle(1, 2, 4);
	}
	public void isTriangle(int a, int b, int c) {
		try {
			if(a + b < c || a + c < b || b + c < c) {
				throw new IllegalArgumentException(a, b, c);				
			}
			System.out.println(a + ", " + b + ", " + c + " " + "能构成三角形");
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
//任务三：
//写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
//如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
//如果可以构成则显示三角形三个边长，调用此方法，并捕获异常。
class IllegalArgumentException extends Exception{	
	public IllegalArgumentException(int a, int b, int c) {		
		super(a + ", " + b + ", " + c + " " + "不构成三角形");		
	}
}