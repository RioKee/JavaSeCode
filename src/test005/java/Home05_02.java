package test005.java;

public class Home05_02 {
	public static void main(String[]args) {
		//�����༶��5��ѧ�� �ɼ�   ��ʾ��������ܳɼ���ƽ���ɼ�
		//�������ѭ��  �ڲ�5��ѭ��  �����ͬʱ�Ƚ����ܺ͵����

		int sum=0;
		for(int i=1;i<=3;i++) {
			System.out.println("�������"+i+"���༶�ɼ�");
			for(int j=1;j<=5;j++) {
				System.out.print("��"+j+"λͬѧ��");
				sum+=new java.util.Scanner(System.in).nextInt();
			}
			System.out.println("��"+i+"���༶�ܳɼ���"+sum+"\tƽ���ɼ�Ϊ��"+sum/5);			
		}
		
	
	
	}
	

}
