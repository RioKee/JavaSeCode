package test003;

import java.util.Scanner;

public class SwitchCode {
	public static void main(String[]args) {
//		Scanner input=new.Scanner(System.in)
//		
		//һ��������ɶ�������趨
//		int num=new Scanner(System.in).nextInt();
//		System.out.println(num);
		
		/*���Եȼ����֣�������Ŀ�����а������֧�жϣ�ֻ����IF�ж�*/
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("������ɼ�");
//		int score=input.nextInt();
//		if(score>90 && score<=100) {
//			System.out.println("�ɼ�ΪA");
//		}
//		if(score>80 && score<=90) {
//			System.out.println("�ɼ�ΪB");
//		}
//		if(score>70 && score<=80) {
//			System.out.println("�ɼ�ΪC");
//		}
//		if(score>=60 && score<=70) {
//			System.out.println("�ɼ�ΪD");
//		}
//		if(score>=0 && score<60) {
//			System.out.println("�ɼ�ΪE");
//		}
		
		//��ӡ����������
//		for(int i=1;i<=5;i++) {
//			for(int k=1;k<=5-i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		/*����һ���ַ���������ַ�����unicode�����ܺ�*/
		
		
		
		/*����һ�������ж�����������ż��*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("������һ������");
		int num=input.nextInt();
		// ż�����������ܱ�2��������������0   0Ҳ��ż��
		if(num%2==0 || num==0) {
			System.out.println(num+"Ϊż��");
		}else {
			System.out.println(num+"Ϊ����");
		}
		
		
		
	}

}
