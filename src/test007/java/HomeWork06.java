package test007.java;
import java.util.Arrays;

public class HomeWork06 {
	public static void main(String[]args) {
		//ɾ���ظ���Ԫ��
//		String[] words = {"apple", "banana", "cat", "banana", "cat", "dog", "dog"};
//		
//		for(int m = 0; m < add.length; m++) {
//			String[] arr = new String[words.length - 1];
//			for(int i = 0, k = 0; i < words.length - 1; i++) {  //������Ӧ�����꣬��һ��һ����ɾ��
//				if(add[m] != i) {   //���±겻���ʱ����words�����ֵȡ�������������ɾ����Ӧ�±�ֵ
//					arr[k] = words[i];
//					System.out.println(arr[k]);
//					k++;
//				}
//			}
//			words = arr;
//		}
//		System.out.println(Arrays.toString(words));
		
		
		//ɾ���ظ���Ԫ��
		//��ָ����Ԫ��ɾ��Ϊnull
		int[] add = {3, 4, 6};
		String[] words = {"apple", "banana", "cat", "banana", "cat", "dog", "dog"};
		for(int i = 0; i < add.length; i++) {
			for(int j = 0; j < words.length; j++) {
				if(add[i] == j) {
					words[j] = null;
				}
			}
		}
		
		//�ж�Ϊ��ʱ��������ֵ����
		String[] temp = new String[words.length - add.length];  //�����б�ĳ���ȷ��
		for(int i = 0, k = 0; i < words.length; i++) {  //������Ӧ�����꣬��һ��һ����ɾ��
			if( words[i] != null) {   //��������������Ԫ��Ϊ��ֵʱ����С����ռ�
				temp[k] = words[i];
				k++;
			}
		}
		words = temp;
		System.out.println(Arrays.toString(words));
	}
}
