package test007.java;

public class HomeWork05 {
	public static void main(String[]args) {
		//�ҳ�Ԫ���ظ����±�
		String[] words = {"apple", "banana", "cat", "banana", "cat", "dog", "dog"};
		
		//��Ŀ�ֽ�
		//����һ��Ԫ�أ��͵ڶ�Ԫ�ؽ��бȽϣ���ͬ�ͼ�¼������
		//ɾ����ͬ��Ӧ���±�Ԫ�أ����������¼����
		
		for(int i = 0; i < words.length ; i++) {  
			for(int j = i; j < words.length; j++) {
				if(i != j) {  //ȥ�����Լ�����Ƚ�
//					System.out.print(words[i] + " " + words[j] + " \t");
					if(words[i].equals(words[j])) {  //�ж��Ƿ��Ѿ����ֹ������ֹ����¼
						System.out.print(j + " ");  //����ظ�ֵ���±�
					}
				}	
			}
		}
		
		
		
		
		
 	}
}
