package test005.java;

public class Home05_05 {
	public static void main(String[]args) {
		//����5��ѧԱ�ɼ����ɼ�����ʹ����Ϊ����
		int []score=new int[5];
		int temp;
		for(int i=0;i<5;i++) {
			System.out.println("���"+i+"λͬѧ����ɼ���");
			score[i]=new java.util.Scanner(System.in).nextInt();
		}
		for(int i=0;i<score.length;i++) {
			for(int j=1;j<score.length-i;j++) {
				if(score[i]<score[j]) {
					temp=score[j];
					score[j]=score[i];
					score[i]=temp;
				}
			}
		}
		for (int i : score) {
			System.out.println(i+" ");
		}
	}
}
