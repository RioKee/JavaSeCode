package test004.java;

public class Home04_04 {
	public static void main(String[]args) {
		//100~999��ˮ�ɻ���
		//ÿһλ�ϵ��������η������ڱ���
//		int i=100;
//		while(i<999) {
//			int a=i%10;
//			int b=i/10%10;
//			int c=i/10/10;
//			if(i==a*a*a+b*b*b+c*c*c) {
//				System.out.println("ˮ�ɻ�����"+i);
//			}
//			i++;
//		}
		
		//����5�������ҳ�����������С����
		//�������ʼֵ�������յĵ�һ���������ڴ�ռ䲢�������
		System.out.println("�������1������");
		int numMax=new java.util.Scanner(System.in).nextInt();  
		int numMin=numMax;
		for(int i=2;i<=5;i++) {
			System.out.println("�������"+i+"������");
			int num=new java.util.Scanner(System.in).nextInt();
			if(numMax<num) {
				numMax=num;
			}
			if(numMin>num) {
				numMin=num;
			}
		}
		System.out.println("��������"+numMax);
		System.out.println("��С������"+numMin);
		
		
		
		//��������ð��������
	}
}
