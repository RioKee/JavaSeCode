package test017.java;
import java.util.Scanner;

public class Throws_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		try {
			for(int i = 0; i < arr.length; i++) {
				System.out.print("请输入第" + (i + 1) + "个值：");
				arr[i] = new Scanner(System.in).nextInt();
			}
		}catch(Exception e) {
			System.out.println("赋值出错");
			e.printStackTrace();
		}finally {
			System.out.println("程序运行结束");
		}
		

	}
}
