package test005.java;

import java.util.Scanner;

public class Home05_06_01 {
	public static void main(String[]args) {
		//����switch ��֧  ��   ��ľ��������ж����ս��
		
		//��Ϸ��ʼ
		System.out.println("1��������2��ʯͷ��3����   ");
		
		//����ʯͷ��    1��������2��ʯͷ��3����
		//�͵������������Ϸ    ��Ϊ���1 2 3  ����������� 1~3������
		int comNum = (int)(Math.random()*3+1);
		System.out.println("�����������"+comNum);
		
		//��Ҳ���
		System.out.print("��ѡ����Ĳ���:");
		int choice = new Scanner(System.in).nextInt();
		
		String opt = "";
		switch(choice) {
			case 1 : 
				opt = comNum == 1 ? "ƽ��" : (comNum == 2 ? "�����ˣ�" : "��Ӯ�ˣ�");
				break;
			case 2 :
				opt = comNum == 2 ? "ƽ��" : (comNum == 2 ? "�����ˣ�" : "��Ӯ�ˣ�");
				break;
			case 3 :
				opt = comNum == 2 ? "ƽ��" : (comNum == 2 ? "�����ˣ�" : "��Ӯ�ˣ�");
				break;
			default:
				System.out.println("�����쳣");
				break;
		}
		System.out.println(opt);
		
		
		
	}

}
