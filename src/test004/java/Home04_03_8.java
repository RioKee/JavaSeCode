package test004.java;

public class Home04_03_8 {
	public static void main(String[]args) {
		//���100֮���ż����  ������
//		int sum=0;
//		int i=0;
//		while(i<=100) {
//			if(i%2==0)
//				sum=sum+i;
//			i++;
//		}
//		System.out.println("ż���ĺͣ�"+sum);
		
		
		//���100���ڵ�������
//		int sum=0;
//		int i=0;
//		while(i<=100) {
//			if(i%2!=0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println("�����ͣ�"+sum);
		
		//9������5��ѧ���ɼ��������ܳɼ���ƽ����
//		int i=1;
//		int sum=0;
//		while(i<6) {
//			System.out.print("���"+i+"λͬѧ����ɼ���");
//			int num=new java.util.Scanner(System.in).nextInt();
//			sum+=num;
//			i++;
//		}
//		System.out.println("�ܳɼ���"+sum);
//		System.out.println("ƽ���֣�"+(sum/5));
		
		//10���ܹ�10000�ˣ�ÿ������2%, һ������7��
//		int i=7;
//		int sum=10000;
//		while(i>0) {
//			sum*=1.02;
//			i--;
//		}
//		System.out.println("�ڶ������һ����������"+sum);
		
		/*
		 * 11 ����7�ܹ�
		 *      ���ֳ���7  ����
		 * 7�ı����������
		 * �������  7 77  ��ô����   ͬʱ��������֧�����Ա�����if
		 * */
//		for(int i=1;i<=100;i++) {
//			boolean type=true;
//			if(i%7==0) {  //7�ı���
//				System.out.print("����");
//				type=false;
//			}
//			if(i%10==7 || i/10%10==7) {  //��λ������7  ʮλ������7
//				System.out.print("����");
//				type=false;
//			}
//			if(type) {
//				System.out.println(i);
//			}else {
//				System.out.println();
//			}
//		
//		}
		
		// �Զ���˵�
		
		
		while(true) {
			System.out.println("===ѧ������ϵͳ===\n"
					+ "1������ѧ����Ϣ \n"
					+ "2����ȡѧ����Ϣ \n"
					+ "3��ѧ���ɼ����а�\n"
					+ "4���޸�ָ��ѧ����Ϣ\n"
					+ "5��ɾ��ָ��ѧ����Ϣ \n"
					+ "6���˳����� \n"
					+ "������˵����:");
			String num=new java.util.Scanner(System.in).nextLine();
			switch(num) {
				case "1":
					System.out.println("����ѧ����Ϣ");
					String action1=new java.util.Scanner(System.in).nextLine();
					if(action1.equals("save")) {
						System.out.println("����ѧ����Ϣ���");
					}else {
						System.out.println("�������󣬷�����һ���˵�");
					}
					continue;
				case "2":
					System.out.println("��ȡѧ����Ϣ");
					String action2=new java.util.Scanner(System.in).nextLine();
					if(action2.equals("load")) {
						System.out.println("��ȡѧ����Ϣ���");
					}else {
						System.out.println("�������󣬷�����һ���˵�");
					}
					continue;
				case "3":
				case "show":
					System.out.println("ѧ����Ϣ���а�");
					continue;
				case "4":
					System.out.println("�޸�ָ��ѧ����Ϣ");
					
					continue;
				case "5":
					System.out.println("ɾ��ָ��ѧ����Ϣ");
					continue;
				case "6":
				case "exit":
					System.out.println("�˳�����");
					break;
				default:
					System.out.println("������󣡣����������룺");
					System.out.println("ѧ������ϵͳ\n"
							+ "1������ѧ����Ϣ \n"
							+ "2����ȡѧ����Ϣ \n"
							+ "3��ѧ���ɼ����а�\n"
							+ "4���޸�ָ��ѧ����Ϣ\n"
							+ "5��ɾ��ָ��ѧ����Ϣ \n"
							+ "6���˳����� \n"
							+ "������˵����:");
					continue;
			}
			break;
		}
		
		
	}
}
