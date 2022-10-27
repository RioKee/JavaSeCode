package test008.java;

public class HomeWork02 {
	public static void main(String[]args) {
		
		B b1 = new B();
		double res = b1.resule(12, 12, '/');
		System.out.println("结果为：" + res);
	}
}

class B{
	
	public double resule(double num1, double num2, char a) {
		
////		return num1 + num2;
		if(a == '+') {
			return num1 + num2;
		}else if(a == '-') {
			return num1 - num2;
		}else if(a == '*') {
			return num1 * num2;
		}else if(a == '/') {
			if(num2 == 0) {
				System.out.println("除数不能为0");
			}
			return num1 / num2;
		}else {
			return 0;
		}
	}
}