package test004.java;

public class Day04_02 {
	public static void main(String[]args) {
		//�ж�ˮ�ɻ���   153   ÿ��λ���ϵ����η�����������
//		for(int i=100;i<=999;i++) {
//			int a=i%10;
//			int b=i/10%10;
//			int c=i/10/10;
//			if(i==a*a*a+b*b*b+c*c*c) {
//				System.out.println("ˮ�ɻ�����"+i);
//			}
//		}
		
		//����ͬ������  36ֻ��92
		int x=1,y=1;
		for(x=1;x<=32;x++) {
			if(2*x+(32-x)*4==92) {
				System.out.println(x+" "+(32-x));
			}
		}
	}
}
