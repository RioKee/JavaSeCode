package test007.java;

import java.util.Arrays;

public class HomeWork06_over {
	public static void main(String[]args) {
		
		//�ҳ�Ԫ���ظ����±�
		String[] words = {"apple", "banana", "cat", "banana", "cat", "banana","cat", "dog", "dog"};
		String[] wordsTemp = new String[words.length];  //����һ������Ԫ��,���������в���ԭ�������Ӱ��
		for(int i = 0; i < words.length; i++) {
			wordsTemp[i] = words[i];
		}
		
		//��Ŀ�ֽ�
		//����һ��Ԫ�أ��͵ڶ�Ԫ�ؽ��бȽϣ���ͬ�ͼ�¼������
		//�Ƚ�ֵ�Ƿ���ȣ����������¼�±�
		
		//1.��һ��ȥ���ظ�������ֵnull
		for(int i = 0; i < words.length ; i++) { 
			for(int j = i; j < words.length; j++) {
				if(i != j) {  //ȥ�����Լ�����Ƚ�
					if(words[i].equals(words[j])) {  //�ж��Ƿ��Ѿ����ֹ������ֹ��ͼ�¼
						wordsTemp[j] = null;    //���ظ������鲿�ָ�ֵΪnull��ֻ��ʹ�ÿ��������飬����ԭ�������Ӱ��
					}
				}	
			}
		}
		System.out.println("��һ��ȥ���ظ�������ֵnull��" + Arrays.toString(wordsTemp));

		//2.��¼�ظ���ֵ�±�Ϊ������¼�ж��ٿ�ֵ��ȷ���½�����ĳ���
		int count = 0;
		System.out.print("�ڶ�����¼�ظ�ֵ�±�Ϊ��");
		for(int i = 0; i < wordsTemp.length; i++) {
			if(wordsTemp[i] == null) {
				System.out.print(i + " ");
				count++;
			}
		}
		//�½�һ�����飬ȷ���������鳤��
		String[] over = new String[wordsTemp.length - count]; 
		
		//3.�ж�Ϊ��ʱ��������ֵ����
		for(int i = 0, k = 0; i < wordsTemp.length; i++) {  //������Ӧ�����꣬��һ��һ����ɾ��
			if( wordsTemp[i] != null) {   //��������������Ԫ��Ϊ��ֵʱ����С����ռ�
				over[k] = wordsTemp[i];
				k++;
			}
		}
		words = over;
		System.out.println("\n������ȥ���ظ�Ч����" + Arrays.toString(words));
	}
}
