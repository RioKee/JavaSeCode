package test005.java;

public class Exer03 {
	public static void main(String[]args) {
		//����  ������֮��  ��ȥ����
		for(int i = 1; i <= 10000; i++) {
			//ȡ1000����
			int sum=0;
			for(int j = 1; j < i; j++) {
				// ȥ������
				if(i%j==0) {
					sum+=j;
				}				
			}
			if(sum==i) {
				System.out.println("������"+i);
			}
			
		}
		
		
	}
}
