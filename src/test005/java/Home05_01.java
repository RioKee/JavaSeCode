package test005.java;

public class Home05_01 {
	public static void main(String[]args) {
		//1������5��ѧԱ�ɼ������飬��ʾ���гɼ����ܳɼ���ƽ���ɼ�
		int [] array=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.print("���������֣�");
			array[i]=new java.util.Scanner(System.in).nextInt();
		}
		System.out.print("���гɼ���");
		for (int i : array) {
			sum+=i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("�ܳɼ���"+sum);
		System.out.println("ƽ���ɼ���"+sum/5);
	}
}
