package test002;
import java.util.Scanner;

public class Day02_14 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������ʵ�ʶ�λ��");
		int num=input.nextInt();
		if ((0<num) && (num<500)) {
			System.out.println("�̵���");
		}if (num<=0) {
			System.out.println("����,������Ч");
		}if(num>500) {
			System.out.println("�����");
		}
	}

}
