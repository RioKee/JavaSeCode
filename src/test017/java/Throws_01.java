package test017.java;
import java.util.Scanner;

public class Throws_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		try {
			for(int i = 0; i < arr.length; i++) {
				System.out.print("�������" + (i + 1) + "��ֵ��");
				arr[i] = new Scanner(System.in).nextInt();
			}
		}catch(Exception e) {
			System.out.println("��ֵ����");
			e.printStackTrace();
		}finally {
			System.out.println("�������н���");
		}
		

	}
}
