package test005.java;

public class Exer01 {
	public static void main(String[]args) {
		// һ��ѧУ  �����꼶  
		//ÿ���꼶������  ÿ���� 5��ѧ��  
		//ƽ���� 
		
		//�꼶  �� ѧ��
		
		for(int i = 1; i <= 3; i++) {  //�����꼶
			for(int j = 1; j <= 3; j++) { //�����༶
				int sum=0;
				for(int k = 1; k <= 5; k++) {
					System.out.print(i+"��"+j+"��"+"��"+k+"λͬѧ" );
					int score=new java.util.Scanner(System.in).nextInt();
					sum+=score;
				}
				System.out.println("=="+i+"��"+j+"��"+"ƽ���ɼ�Ϊ"+sum/5);
				
			}
		}
		
		
	}
}
