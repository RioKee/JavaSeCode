package test004.java;

public class Day04_1 {
	public static void main(String[]args) {
		/*
		 * ���꣺һ�ܵ��ؼ۲�
		 * 		��һ,�ܶ�    ˮ����  7��
		 * 		����������   ������˿  7��
		 * 		���壬����   ��ϲ����  7��
		 * 		����    ơ�����
		 * �����������֣���ʾ�ؼ۲�
		 */
		System.out.println("���꣺һ�ܵ��ؼ۲�\r\n" + 
				"*��һ,�ܶ�    ˮ����  7��\r\n" + 
				"*����������   ������˿  7��\r\n" + 
				"*���壬����   ��ϲ����  7��\r\n" + 
				"*����    ơ�����");
		System.out.print("��ѡ�����ڣ�");
		int num=new java.util.Scanner(System.in).nextInt();
		switch(num) {
			case 1:				
			case 2:
				System.out.println("ˮ����  7��");
				break;
			case 3:
			case 4:
				System.out.println("������˿  7��");
				break;
			case 5:
			case 6:
				System.out.println("��ϲ����  7");
				break;
			case 7:
				System.out.println("ơ�����");
				break;
			default:
				System.out.println("�������");
				break;
		}
		
	}

}
