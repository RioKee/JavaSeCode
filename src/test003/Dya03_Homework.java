package test003;

import java.util.Scanner;

public class Dya03_Homework {
	public static void main(String[]args) {
		//�ڶ���  15��
		/*
		 * 500����ɫ
		 * 500���Ϻ�ɫ
		 * */
//		System.out.print("������������");
//		Scanner input=new Scanner(System.in);   //����ɨ��
//		int num=input.nextInt();				//�洢�����ֵ
//		if(num>0 && num<=500) {					//�ж�������Ƿ񳬳���Χ
//			System.out.println("�̵���");			//�����ж�������
//		}else {
//			System.out.println("�����");
//		}
		
//		�ڶ���  16�� ����ʦ�������
//		 ��Ŀ����   �ײ㳤�� 58 33
//		    		  ��Ҫ�������   ��  ��
//		Scanner input=new Scanner(System.in);
//		System.out.print("���������");
//		int num=input.nextInt();  //����
//		
//		System.out.print("�������");
//		int a=input.nextInt();
//		System.out.print("�����볤��");
//		int b=input.nextInt();
//		
//		int sum=(58*33)+(num*a*b);
//		System.out.println("��������ܺͣ�"+sum);
		
		
		//day3  ��4��
		//��ɫս���ȼ��ֲ�
//		Scanner input=new Scanner(System.in);
//		System.out.print("���������ս����");
//		int num=input.nextInt();
//		
//		if(num>0 && num<=1000) {
//			System.out.println("��");
//		}
//		if(num>1000 && num<=2500) {
//			System.out.println("���");
//		}
//		if(num>2500 && num<=5000) {
//			System.out.println("����");
//		}
//		if(num>5000 && num<=10000) {
//			System.out.println("�����");
//		}
//		if(num>10000 && num<=20000) {
//			System.out.println("������");
//		}
//		if(num>20000) {
//			System.out.println("�������");
//		}
		
		
		/*��9��Ŀ���
		 *  һ����5��Ƥ��ѡ��ÿ��Ƥ�����Լ���Ӧ�ļӳ�
		 *  ������ԭʼս����  �������پ���Ƥ���ӳɡ���������ӳɺ��ս��
		 * 
		 * */
//		while(true) {
			System.out.println("=======��ӭ������Ƥ��ս���ӳ�ϵͳ��=========");
			System.out.println("1�������Ƥ��");
			System.out.println("2����Ϸ�ҹ���Ƥ��");
			System.out.println("3��������Ƥ��");
			System.out.println("4����������Ƥ��");
			System.out.println("5�����ù���Ƥ��");
			
			Scanner input=new Scanner(System.in);
			System.out.print("���������ս����");			
			int num=input.nextInt();
			
			System.out.print("��ѡ�񴩴�Ƥ�������ͣ�");
			int option=input.nextInt();
			
			if(option==1){
				num*=1.02;
				System.out.print("�����Ƥ���ӳɣ���");
			}
			if(option==2){
				num*=1.04;
				System.out.print("��Ϸ�ҹ���Ƥ���ӳɣ���");
			}
			if(option==3){
				num*=1.04;
				System.out.print("������Ƥ���ӳɣ���");
			}
			if(option==4){
				num*=1.08;
				System.out.print("��ֵ����Ƥ���ӳɣ���");
			}
			if(option==5){
				num*=1.16;
				System.out.print("��ֵ�ҹ���Ƥ���ӳɣ���");
			}
			
			System.out.print("  �ӳɺ�ս����ֵΪ��"+num+"  �Ǽ�Ϊ��");
			//ս����ֵ�ж�	
			if(num>0 && num<=1000) {
				System.out.println("��");
			}
			if(num>1000 && num<=2500) {
				System.out.println("���");
			}
			if(num>2500 && num<=5000) {
				System.out.println("����");
			}
			if(num>5000 && num<=10000) {
				System.out.println("�����");
			}
			if(num>10000 && num<=20000) {
				System.out.println("������");
			}
			if(num>20000) {
				System.out.println("�������");
			}
			
			
					
//		}
		
		
		
		
		
		
		
		
		
	}

}
