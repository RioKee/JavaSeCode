package test005.java;

public class Home05_06 {

}

class Game01{
	public static void main(String[]args) {
		//������Ϸ   ���������   �ӵ�һ�ֿ�ʼ��һ������
		int ran = (int)(Math.random()*6+1);
		System.out.println(ran);
		
		System.out.println("==��ӭ����ת����Ϸ==");
		System.out.print("��P1�������������");
		String p1 = new java.util.Scanner(System.in).nextLine();
 		System.out.print("��P2�������������");
 		String p2 = new java.util.Scanner(System.in).nextLine();
 		
 		System.out.println(p1 + "��� --PK--" + p2 + "���");
 		System.out.println("==Ϸ��Ϸ��ʼ==");
 		boolean type=true;
 		int i = 1;
 		while(i <= 6){
// 			System.out.println("��"+i+"����Ϸ��ʼ");
 			if(i == ran) {
 				System.out.println("��"+i+"ǹ���ˣ�"+p1+"�������");
 				type=false;
 				break;
 			}
 			System.out.println("��" + i + "ǹû��" + p1 + "�����ʱ���");
 			i++;
 			if(i == ran) {
 				System.out.println("��" + i + "ǹ���ˣ�" + p2 + "�������");
 				break;
 			}
 			System.out.println("��" + i + "ǹû��" + p2 + "�����ʱ���");
 			i++; 
 		}
 		if(type) {
 			System.out.println(p1 + "��Ҵ���ң����");
 		}else {
 			System.out.println(p2 + "��Ҵ���ң����");
 		}
 		
 		
	}
}

class Game02{
	public static void main(String[]args) {
		
		//���ֳ�ʼ��
		int perScore = 0;
		int comScore = 0;
		
		//������Ϸ   //�˳���Ϸ
		System.out.println("��Ϸ��ʼ��ѡ�����£�1��������2��ʯͷ��3����   �� 6�˳���Ϸ��");
		
		//�������ɫ   С��   С�� 
		System.out.print("���������������");
		String p = new java.util.Scanner(System.in).nextLine();
		System.out.println(p + "��� --PK--" + "�������");
 		System.out.println("==Ϸ��Ϸ��ʼ==");
		
		while(true) {
			
			//����ʯͷ��    1��������2��ʯͷ��3����
			//�͵������������Ϸ    ��Ϊ���1 2 3  ����������� 1~3������
			int comNum = (int)(Math.random()*3+1);
//			System.out.println("�����������"+comNum);
			
			//�����������ѡ��ı��
			System.out.print("��" + p + "����������ѡ��");
			int pNum = new java.util.Scanner(System.in).nextInt();
			
			//ƽ��ֻ��дһ���жϣ��Ż�����			
			if(pNum==comNum) {
				System.out.println("ƽ��");
			}else if(pNum==1 && comNum==2) {
				System.out.println("����PKʯͷ�����Ի�ʤ");
				comScore++;
			}else if(pNum==1 && comNum==3) {
				System.out.println("����PK��������ҡ���ʤ");
				perScore++;
			}else if(pNum==2 && comNum==1) {
				System.out.println("ʯͷPK����������ҡ���ʤ");
				perScore++;
			}else if(pNum==2 && comNum==3) {
				System.out.println("ʯͷPK�������Ի�ʤ");
				comScore++;
			}else if(pNum==3 && comNum==1) {
				System.out.println("��PK���������Ի�ʤ");
				comScore++;
			}else if(pNum==3 && comNum==2) {
				System.out.println("��PKʯͷ������ҡ���ʤ");
				perScore++;
			}else if(pNum==6) {	 //�˳���Ϸ			
				break;
			}else {
				System.out.println("������󣡣���   ����������");
				continue;
			}		
		}
		System.out.println("===���ջ���===");
		System.out.println("���" + p + ":" + perScore + "\t����:" + comScore);
	}
}