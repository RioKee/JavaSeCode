package test005.java;

public class Home05_03 {
	public static void main(String[]args) {
		//99乘法表
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+i*j+" ");
//			}
//			System.out.println();
//		}
		
		//验证短路运算符号
		int i=9;
		if( i < 40 && i > 10 ) {
			System.out.println("符合要求");
		}
	}
}
